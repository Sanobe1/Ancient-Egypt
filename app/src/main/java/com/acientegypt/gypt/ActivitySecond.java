package com.acientegypt.gypt;


import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class ActivitySecond extends AppCompatActivity {
    private String[] questions = {"Kleopatra VII ruled Egypt for 22 years?", "Tutankhamun ruled 1332 - 1323 BC",
            "Ra the ancient Egyptian god of sausage?", "Ra the ancient Egyptian god of sun?", "Anubis ancient Egyptian god of funeral rituals and mummification?"};
    private boolean[] answers = {true, true, false, true, true};
    private int index = 0;
    int score = 0;
    Button trueBtn;
    Button falseBtn;
    TextView question;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_screen);

        trueBtn = findViewById(R.id.True);
        falseBtn = findViewById(R.id.False);
        question = findViewById(R.id.question);
        question.setText(questions[index]);


        trueBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (index <= questions.length - 1) {
                    if (answers[index]) {
                        score++;
                    }
                    index++;
                    if (index <= questions.length - 1) {
                        question.setText(questions[index]);
                    } else {
                        Toast.makeText(ActivitySecond.this, "Your score is: " + score, Toast.LENGTH_LONG).show();
                    }

                } else {
                    Toast.makeText(ActivitySecond.this, "Tap Menu", Toast.LENGTH_LONG).show();
                }


            }
        });
        falseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (index <= questions.length - 1) {
                    if (!answers[index]) {
                        score++;
                    }
                    index++;
                    if (index <= questions.length - 1) {
                        question.setText(questions[index]);
                    } else {
                        Toast.makeText(ActivitySecond.this, "Your score is: " + score, Toast.LENGTH_LONG).show();
                    }

                }
            }
        });




        }

    public void onClickBackToMenu(View view) {
        startActivity(new Intent(this, ActivityMenu.class));
        finish();
    }
}











