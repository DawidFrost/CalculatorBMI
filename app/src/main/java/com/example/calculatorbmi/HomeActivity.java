package com.example.calculatorbmi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button buttonBMI=(Button) findViewById(R.id.GoBMI);
        Button buttonPPM=(Button) findViewById(R.id.GoPPM);
        Button buttonCorona=(Button) findViewById(R.id.GoCorona);

        // Add listener
        buttonBMI.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        openCalculatorBMI();
                    }
                });
        buttonPPM.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        openCalculatorPPM();
                    }
                });
        buttonCorona.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        openCoronaRecip();
                    }
                });

    }
        public void openCalculatorBMI(){
            Intent bmi = new Intent(this,MainActivity.class);
            startActivity(bmi);
        }
        public void openCalculatorPPM(){
            Intent ppm = new Intent(this,PPMActivity.class);
            startActivity(ppm);
        }
    public void openCoronaRecip(){
        Intent intent = new Intent(this,CoronaRecipActivity.class);
        startActivity(intent);
    }


}
