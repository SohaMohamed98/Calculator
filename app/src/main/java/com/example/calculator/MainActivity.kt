package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        res.setOnClickListener {

            var one = num1.text
            var two = num2.text
            var Result=one.toString().toInt()+two.toString().toInt()
            txt_view.text = Result.toString()

        }



    }

}
