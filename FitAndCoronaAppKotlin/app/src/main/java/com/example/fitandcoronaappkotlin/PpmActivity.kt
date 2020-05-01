package com.example.fitandcoronaappkotlin

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Switch
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.math.roundToInt

class PpmActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ppm)

        val btnCalculatePPM = findViewById<Button>(R.id.CalculatePPM)
        val weight = findViewById<EditText>(R.id.PpmWeight)
        val height = findViewById<EditText>(R.id.PpmHeight)
        val age = findViewById<EditText>(R.id.PpmAge)
        val sex = findViewById<Switch>(R.id.PpmSex)
        val tvPPM = findViewById<TextView>(R.id.PpmView)

        btnCalculatePPM.setOnClickListener {

            val heightValue = height.text.toString().toFloat()
            val weightValue = weight.text.toString().toFloat()
            val ageValue = age.text.toString().toInt()

            if (sex.isChecked) {
                val ppm =
                    (665.1 + 9.563 * weightValue + 1.85 * heightValue - 4.676 * ageValue)
                tvPPM.text = "${ppm.roundToInt()} kcal\n"
            } else {
                val ppm =
                    (66.5 + 13.75 * weightValue + 5 * heightValue - 6.775 * ageValue)
                tvPPM.text = "${ppm.roundToInt()} kcal\n"
            }
        }
    }
}
