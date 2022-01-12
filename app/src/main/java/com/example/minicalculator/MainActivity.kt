package com.example.minicalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener{
        val bb=nb1.text.toString().toInt()
            val by=nb2.text.toString().toInt()
            val sum = bb+by
            vt2.setText("$sum")
            tv1.setText("+")
        }
        button2.setOnClickListener{
            val bb=nb1.text.toString().toInt()
            val by=nb2.text.toString().toInt()
            val sum = bb-by
            vt2.setText("$sum")
            tv1.setText("-")
    }
        button3.setOnClickListener{
            val bb=nb1.text.toString().toInt()
            val by=nb2.text.toString().toInt()
            val sum = bb*by
            vt2.setText("$sum")
            tv1.setText("*")
}
        button4.setOnClickListener{
            val bb=nb1.text.toString().toInt()
            val by=nb2.text.toString().toInt()
            val sum = bb/by
            vt2.setText("$sum")
            tv1.setText("/")
        }
        button5.setOnClickListener{
            val bb=nb1.text.toString().toInt()
            val by=nb2.text.toString().toInt()
            val sum = bb%by
            vt2.setText("$sum")
            tv1.setText("%")
        }
        button6.setOnClickListener {
            nb1.setText("")
            nb2.setText("")
            vt2.setText("")
            tv1.setText("")
        }
    }
}