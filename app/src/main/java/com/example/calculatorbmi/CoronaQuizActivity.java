package com.example.calculatorbmi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class CoronaQuizActivity extends AppCompatActivity {
    TextView tv;
    Button submitbutton, quitbutton;
    RadioGroup radio_g;
    RadioButton rb1,rb2,rb3,rb4;

    String questions[] = {
            "Where corona virus first appeared?",
            "Who is most at risk of coronavirus?",
            "What are the signs of corona virus infection?",
            "How can you become infected with corona virus?",
            "In which Chinese city was the first coronavirus detected?",
            "What is the correct virus name?"
    };
    String answers[] = {"China","Elderly people","Cough, shortness of breath, fever","when you shake hand with someone else","Wuhan","Covid-19"};
    String opt[] = {
            "China","Australia","USA","Indie",
            "young women","children","Middle-aged men","Elderly people",
            "Diarrhea, runny nose, fever","Sore throat, runny nose, headache","Cough, shortness of breath, fever","Itching, runny nose, cough",
            "when you eat unwashed vegetables and fruits.","when you go outside naked","when you shake hand with someone else","When a dog licks you",
            "Wuhan","Shanghai","Pekin","Shenzhen",
            "Corona-SARS-2","nCoV-2019","SARS-CoV-2","Covid-19"

    };

    int flag=0;
    public static int marks=0,correct=0,wrong=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_corona_quiz);

        final TextView score = (TextView)findViewById(R.id.textView4);
        Intent intent = getIntent();

        submitbutton=(Button)findViewById(R.id.button3);
        quitbutton=(Button)findViewById(R.id.buttonquit);
        tv=(TextView) findViewById(R.id.tvque);
        radio_g=(RadioGroup)findViewById(R.id.answersgrp);
        rb1=(RadioButton)findViewById(R.id.radioButton);
        rb2=(RadioButton)findViewById(R.id.radioButton2);
        rb3=(RadioButton)findViewById(R.id.radioButton3);
        rb4=(RadioButton)findViewById(R.id.radioButton4);
        tv.setText(questions[flag]);
        rb1.setText(opt[0]);
        rb2.setText(opt[1]);
        rb3.setText(opt[2]);
        rb4.setText(opt[3]);

        submitbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(radio_g.getCheckedRadioButtonId()==-1)
                {
                    Toast.makeText(getApplicationContext(), "Please select one choice", Toast.LENGTH_SHORT).show();
                    return;
                }
                RadioButton uans = (RadioButton) findViewById(radio_g.getCheckedRadioButtonId());
                String ansText = uans.getText().toString();

                if(ansText.equals(answers[flag])) {
                    correct++;
                    Toast.makeText(getApplicationContext(), "Correct", Toast.LENGTH_SHORT).show();
                }
                else {
                    wrong++;
                    Toast.makeText(getApplicationContext(), "Wrong", Toast.LENGTH_SHORT).show();
                }

                flag++;

                if (score != null)
                    score.setText(""+correct);

                if(flag<questions.length)
                {
                    tv.setText(questions[flag]);
                    rb1.setText(opt[flag*4]);
                    rb2.setText(opt[flag*4 +1]);
                    rb3.setText(opt[flag*4 +2]);
                    rb4.setText(opt[flag*4 +3]);
                }
                else
                {
                    marks=correct;
                   Intent in = new Intent(getApplicationContext(),CoronaQuizResultActivity.class);
                    startActivity(in);
                }
                radio_g.clearCheck();
            }
        });
        quitbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),CoronaQuizResultActivity.class);
                startActivity(intent);
            }
        });

    }
}
