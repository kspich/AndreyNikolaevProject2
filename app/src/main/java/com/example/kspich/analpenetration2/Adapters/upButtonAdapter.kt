package com.example.kspich.analpenetration2.Adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.kspich.analpenetration2.R

class lowerButtonsAdapter(val text1:String, val text2:String, val text3:String, val image:Int) : RecyclerView.Adapter<lowerButtonsAdapter.ViewHolder>(){

    override fun getItemCount() = 3

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.raffleValue?.text = text1
        holder.raffleInfo?.text = text2
        holder.rafflePeriod?.text = text3
        holder.img?.setImageResource(image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.button_layout, parent, false)
        return ViewHolder(view)
    }

    class ViewHolder(but: View) : RecyclerView.ViewHolder(but)
    {
        var img:ImageView? = null
        var raffleValue:TextView? = null
        var raffleInfo:TextView? = null
        var rafflePeriod:TextView? = null

        init {
            raffleValue = but.findViewById(R.id.rt1)
            raffleInfo = but.findViewById(R.id.rt2)
            rafflePeriod = but.findViewById(R.id.rt3)
        }
    }

}