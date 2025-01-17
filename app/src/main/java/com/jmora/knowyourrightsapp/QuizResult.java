package com.jmora.knowyourrightsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.jmora.knowyourrightsapp.MainActivity;
import com.jmora.knowyourrightsapp.R;

public class QuizResult extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_result);


        final AppCompatButton startNewButton = findViewById(R.id.startNewQuizButton);
        final TextView correctAnswers = findViewById(R.id.correctAnswers);
        final TextView incorrectAnswers = findViewById(R.id.incorrectAnswers);

        final int getCorrectAnswers = getIntent().getIntExtra("correct",0);
        final int getIncorrectAnswers = getIntent().getIntExtra("incorrect",0);

        correctAnswers.setText(String.valueOf("Correct Answers: " + (getCorrectAnswers)));
        incorrectAnswers.setText(String.valueOf("Incorrect Answers: " + (getIncorrectAnswers)));

        startNewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(QuizResult.this, MainActivity.class));
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(QuizResult.this,MainActivity.class));
        finish();
    }
}
