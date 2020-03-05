package com.example.calculatorbmi;

import android.os.Bundle;



import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;


import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
    private static final NumberFormat numberFormat =
            NumberFormat.getNumberInstance();

    private EditText weight;
    private EditText height;


    private TextView bmiTextView;

    private Button calculateButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        weight = (EditText) findViewById(R.id.weight);
        height =  (EditText) findViewById(R.id.height);
        bmiTextView = (TextView) findViewById(R.id.bmi);
        calculateButton = (Button) findViewById(R.id.calculate);



        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate();
            }
        });



    }


    private void calculate() {
        String heighStr = height.getText().toString();
        String weightStr = weight.getText().toString();

        if(weightStr != null && !"".equals(weightStr) && heighStr != null && !"".equals(heighStr)) {
            float heightValue = Float.parseFloat(heighStr) / 100;
            float weightValue = Float.parseFloat(weightStr);

            float bmi = weightValue / (heightValue * heightValue);

            showBMI(bmi);
        }

    }

    private void showBMI(float bmi) {
        String viewBMI = "";

        if (Float.compare(bmi, 15f) <= 0) {
            viewBMI = "very severaly underweight";
        } else if (Float.compare(bmi, 15f) > 0 && Float.compare(bmi, 16f) <= 0) {
            viewBMI = "severaly underweight";
        } else if (Float.compare(bmi, 16f) > 0 && Float.compare(bmi, 18.5f) <= 0) {
            viewBMI = "underweight";
        } else if (Float.compare(bmi, 18.5f) > 0 && Float.compare(bmi, 25f) <= 0) {
            viewBMI = "normal";
        } else if (Float.compare(bmi, 25f) > 0 && Float.compare(bmi, 30f) <= 0) {
            viewBMI = "overweight";
        } else if (Float.compare(bmi, 30f) > 0 && Float.compare(bmi, 35f) <= 0) {
            viewBMI = "obese class I";
        } else if (Float.compare(bmi, 35f) > 0 && Float.compare(bmi, 40f) <= 0) {
            viewBMI = "obese class II";
        }else {
            viewBMI = "obese class III";
        }

        viewBMI = bmi + "\n" + viewBMI;
        bmiTextView.setText(viewBMI);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}

