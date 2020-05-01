package com.example.fitandcoronaappkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonBMI = findViewById<Button>(R.id.GoBMI)
        val buttonPPM = findViewById<Button>(R.id.GoPPM)
        val buttonCorona = findViewById<Button>(R.id.GoCorona)

        buttonBMI.setOnClickListener{
            val intent = Intent(this, BmiActivity::class.java)
            startActivity(intent)
        }
        buttonPPM.setOnClickListener{
            val intent = Intent(this, PpmActivity::class.java)
            startActivity(intent)
        }
        buttonCorona.setOnClickListener{
            val intent = Intent(this, CoronaActivity::class.java)
            startActivity(intent)
        }
    }
}
