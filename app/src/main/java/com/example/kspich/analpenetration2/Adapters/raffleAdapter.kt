package com.example.kspich.analpenetration2.Adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

import com.example.kspich.analpenetration2.R

class raffleAdapter(val values: MutableList<completedRaffle>) : RecyclerView.Adapter<raffleAdapter.ViewHolder>(){

    override fun getItemCount() = values.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.dtext?.text = "Дата: "+values[position].date
        holder.wtext?.text = "Победитель: "+values[position].winner
        holder.ptext?.text = "Участники: "+values[position].parts.toString()
    }

    init {
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.craffle_layout, parent, false)
        return ViewHolder(view)
    }

    class ViewHolder(raffle: View) : RecyclerView.ViewHolder(raffle)
    {
        var imgv: ImageView? = null
        var dtext: TextView? = null
        var wtext: TextView? = null
        var ptext: TextView? = null
        init {
            //imgv = raffle.findViewById(R.id.rimage)
            dtext = raffle.findViewById(R.id.rvt1)
            wtext = raffle.findViewById(R.id.rvt2)
            ptext = raffle.findViewById(R.id.rvt3)
        }
    }

}
public class completedRaffle
{
    var date:String = ""
    var winner:String = ""
    var parts:Int = 0
    public constructor(d:String, w:String, p:Int)
    {
        date = d
        winner = w
        parts = p
    }
}
