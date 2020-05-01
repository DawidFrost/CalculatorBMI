package com.example.fitandcoronaappkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class BmiActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bmi)

        val btnCalculateBMI = findViewById<Button>(R.id.CalculateBMI)
        val tvBMI = findViewById<TextView>(R.id.TextViewBMI)
        val weight = findViewById<EditText>(R.id.EnterWeight)
        val height = findViewById<EditText>(R.id.EnterHeight)

        btnCalculateBMI.setOnClickListener {
            val bmiWeight = weight.text.toString().toFloat()
            val bmiHeight = height.text.toString().toFloat()/100

            var viewBMI =""
            val bmiCalc =  bmiWeight / ( bmiHeight  * bmiHeight )

            when (bmiCalc){
                in 0..15 -> viewBMI="very severaly underweight"
                in 15..16 -> viewBMI="severaly underweight"
                in 16..18-> viewBMI="severaly underweight"
                in 18..25 -> viewBMI="normal"
                in 25..30 -> viewBMI="overweight"
                in 30..35 -> viewBMI="obese class I"
                in 35..40 -> viewBMI="obese class II"
                else -> viewBMI="obese class III"
            }

            tvBMI.text = bmiCalc.toString() + "\n" +viewBMI
        }
    }
}
