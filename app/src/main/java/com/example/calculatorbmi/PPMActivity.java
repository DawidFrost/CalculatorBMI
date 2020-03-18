package com.example.calculatorbmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TextView;

public class PPMActivity extends AppCompatActivity {

    private EditText height;
    private EditText weight;
    private EditText age;
    private Switch sex;
    private TextView ppmTextView;
    private Button calculateButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ppm);
        // Get data
        height = (EditText) findViewById(R.id.height);
        weight = (EditText) findViewById(R.id.weight);
        age = (EditText) findViewById(R.id.age);
        sex = (Switch) findViewById(R.id.sex);
        ppmTextView = (TextView) findViewById(R.id.ppmView);
        calculateButton = (Button) findViewById(R.id.calculatePPM);

        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculatePPM();
            }
        });


    }

    private void calculatePPM(){
        String heighStr = height.getText().toString();
        String weightStr = weight.getText().toString();
        String ageStr = age.getText().toString();

        if(weightStr != null && !"".equals(weightStr) && heighStr != null && !"".equals(heighStr) && ageStr != null && !"".equals(ageStr)) {
            float heightValue = Float.parseFloat(heighStr);
            float weightValue = Float.parseFloat(weightStr);
            float ageValue = Float.parseFloat(ageStr);

            if (sex.isChecked()){
                float ppm = (float) (665.1 + (9.563 * weightValue) + (1.85 * heightValue) - (4.676 * ageValue));
                showPPM(ppm);
            }
            else {
                float ppm = (float) (66.5 + (13.75 * weightValue) + (5 * heightValue) - (6.775 * ageValue));
                showPPM(ppm);
            }
        }


    }

    private void showPPM(float ppm) {
        String viewPPM = "";

        viewPPM = ppm + " kcal\n";
        ppmTextView.setText(viewPPM);
    }


}
