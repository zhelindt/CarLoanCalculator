package com.example.carloancalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCalculate.setOnClickListener {
            val input:String = editText.text.toString()
            val input1:String = editText2.text.toString()
            val input2:String = editText3.text.toString()
            val input3:String = editText4.text.toString()

            val value: Double = input.toDouble()
            val value1: Double = input1.toDouble()
            val value2: Double = input2.toDouble()
            val value3: Double = input3.toDouble()

            val result: Double = value - value1
            val result1: Double = result * value3 * value2
            val result2: Double = (result + result1) / value2 / 12

            textView9.text = "%.2f".format(result)
            textView10.text = "%.2f".format(result1)
            textView11.text = "%.2f".format(result2)

        }
    }
}
