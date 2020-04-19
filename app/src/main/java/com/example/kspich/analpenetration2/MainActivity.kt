
package com.example.kspich.analpenetration2

import android.graphics.drawable.Drawable
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TableRow
import android.widget.TextView
import com.example.kspich.analpenetration2.Adapters.completedRaffle
import com.example.kspich.analpenetration2.Adapters.raffleAdapter
import kotlinx.android.synthetic.main.button_layout.view.*
import com.example.kspich.analpenetration2.R
import kotlinx.android.synthetic.*

class MainActivity : AppCompatActivity() {

    val AndreyList: MutableList<completedRaffle> = mutableListOf(completedRaffle("29.08.2019","Ашотик",228), completedRaffle("28.08.2019","Дима",1), completedRaffle("29.08.2019","Ашотик",228), completedRaffle("28.08.2019","Дима",1))

    fun addButton(v:ViewGroup,text1:String, text2:String, text3:String, image:Int) {
        var b:View = LayoutInflater.from(this).inflate(R.layout.button_layout, null);
        b.rt1.text = text1
        b.rt2.text = text2
        b.rt3.text = text3
        b.imageView.setImageResource(image)
        v.addView(b);
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var row1:TableRow = findViewById(R.id.row1)
        var row2:TableRow = findViewById(R.id.row2)

        val rHistory: RecyclerView = findViewById(R.id.rview)
        rHistory.layoutManager = LinearLayoutManager(this)
        rHistory.adapter = raffleAdapter(AndreyList)

        addButton(row1,"10 золотых","призы до 1р","Ежедневно",R.drawable.rub1)
        addButton(row1,"100 золотых","призы до 2р","Еженедельно",R.drawable.rub2)
        addButton(row2,"1000 золотых","призы до 5р","Ежемесячно",R.drawable.rub5)
        addButton(row2,"10000 золотых","призы до 10р","Ежегодно",R.drawable.rub10)

    }
}
