package com.jmora.knowyourrightsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextClock;
import android.widget.TextView;
import android.widget.Toast;

import com.jmora.knowyourrightsapp.QuestionList;
import com.jmora.knowyourrightsapp.R;

import java.util.ArrayList;
import java.util.List;

public class QuizActivity extends AppCompatActivity {

    private TextView question;
    private TextView questionNumber;
    private AppCompatButton option1, option2, option3, option4;
    private AppCompatButton nextButton;

    private List<QuestionList> questionsList;
    private int currentQuestionPosition = 0;
    private String selectedOptionByUser = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        final ImageView backButton = findViewById(R.id.backButton);
        final TextView selectedTopicName = findViewById(R.id.topicName);

        question = findViewById(R.id.question);
        questionNumber = findViewById(R.id.questionNumber);
        option1 = findViewById(R.id.option1);
        option2 = findViewById(R.id.option2);
        option3 = findViewById(R.id.option3);
        option4 = findViewById(R.id.option4);
        nextButton = findViewById(R.id.nextButton);

        final String getSelectedTopicName = getIntent().getStringExtra("selectedTopic");

        selectedTopicName.setText(getSelectedTopicName);

        questionsList = QuestionBank.getQuestions(getSelectedTopicName);

        //Original
        //question.setText((currentQuestionPosition + 1) + "/" + questionsList.size());
        //questionNumber.setText(questionsList.get(0).getQuestion());

        question.setText(questionsList.get(0).getQuestion());
        questionNumber.setText("Question " + (currentQuestionPosition + 1) + " out of " + questionsList.size());
        option1.setText(questionsList.get(0).getOption1());
        option2.setText(questionsList.get(0).getOption2());
        option3.setText(questionsList.get(0).getOption3());
        option4.setText(questionsList.get(0).getOption4());


        option1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (selectedOptionByUser.isEmpty()) {
                    selectedOptionByUser = option1.getText().toString();
                    option1.setBackgroundResource(R.drawable.roundredback);
                    option1.setTextColor(Color.WHITE);

                    showAnswer();
                    questionsList.get(currentQuestionPosition).setSelectedAnswer(selectedOptionByUser);
                }
            }
        });

        option2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (selectedOptionByUser.isEmpty()) {
                    selectedOptionByUser = option2.getText().toString();
                    option2.setBackgroundResource(R.drawable.roundredback);
                    option2.setTextColor(Color.WHITE);

                    showAnswer();
                    questionsList.get(currentQuestionPosition).setSelectedAnswer(selectedOptionByUser);
                }
            }
        });

        option3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (selectedOptionByUser.isEmpty()) {
                    selectedOptionByUser = option3.getText().toString();
                    option3.setBackgroundResource(R.drawable.roundredback);
                    option3.setTextColor(Color.WHITE);

                    showAnswer();
                    questionsList.get(currentQuestionPosition).setSelectedAnswer(selectedOptionByUser);
                }
            }
        });

        option4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (selectedOptionByUser.isEmpty()) {
                    selectedOptionByUser = option4.getText().toString();
                    option4.setBackgroundResource(R.drawable.roundredback);
                    option4.setTextColor(Color.WHITE);

                    showAnswer();
                    questionsList.get(currentQuestionPosition).setSelectedAnswer(selectedOptionByUser);
                }
            }
        });

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (selectedOptionByUser.isEmpty()) {
                    Toast.makeText(QuizActivity.this, "Select an answer", Toast.LENGTH_SHORT).show();
                } else {
                    nextQuestion();
                }

            }
        });

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(QuizActivity.this, MainActivity.class));
                finish();
            }
        });

    }

    private void nextQuestion() {
        currentQuestionPosition++;
        if ((currentQuestionPosition + 1) == questionsList.size()) {
            nextButton.setText("Submit Quiz");
        }
        if (currentQuestionPosition < questionsList.size()) {
            selectedOptionByUser = "";

            option1.setBackgroundResource(R.drawable.roundwhiteback);
            option1.setTextColor(Color.parseColor("#000000"));

            option2.setBackgroundResource(R.drawable.roundwhiteback);
            option2.setTextColor(Color.parseColor("#000000"));

            option3.setBackgroundResource(R.drawable.roundwhiteback);
            option3.setTextColor(Color.parseColor("#000000"));

            option4.setBackgroundResource(R.drawable.roundwhiteback);
            option4.setTextColor(Color.parseColor("#000000"));

            // Original
            //question.setText((currentQuestionPosition + 1) + "/" + questionsList.size());
            //questionNumber.setText(questionsList.get(currentQuestionPosition).getQuestion());

            question.setText(questionsList.get(currentQuestionPosition).getQuestion());
            questionNumber.setText("Question " + (currentQuestionPosition + 1) + " out of " + questionsList.size());
            option1.setText(questionsList.get(currentQuestionPosition).getOption1());
            option2.setText(questionsList.get(currentQuestionPosition).getOption2());
            option3.setText(questionsList.get(currentQuestionPosition).getOption3());
            option4.setText(questionsList.get(currentQuestionPosition).getOption4());
        } else {
            Intent intent = new Intent(QuizActivity.this, QuizResult.class);
            intent.putExtra("correct", getCorrectAnswers());
            intent.putExtra("incorrect", getIncorrectAnswers());
            startActivity(intent);

            finish();
        }

        //Intent intent = new Intent(QuizActivity.this,QuizResult.class);
        //getIntent().putExtra("correct",getCorrectAnswers());
        //intent.putExtra("incorrect",getIncorrectAnswers());
        //startActivity(intent);

        //finish();
    }

    private int getCorrectAnswers() {
        int correctAnswers = 0;

        for (int i = 0; i < questionsList.size(); i++) {
            final String getSelectedAnswer = questionsList.get(i).getSelectedAnswer();
            final String getAnswer = questionsList.get(i).getAnswer();

            if (getSelectedAnswer.equals(getAnswer)) {
                correctAnswers++;
            }
        }

        return correctAnswers;
    }


    private int getIncorrectAnswers() {
        int correctAnswers = 0;

        for (int i = 0; i < questionsList.size(); i++) {
            final String getSelectedAnswer = questionsList.get(i).getSelectedAnswer();
            final String getAnswer = questionsList.get(i).getAnswer();

            if (!getSelectedAnswer.equals(getAnswer)) {
                correctAnswers++;
            }
        }

        return correctAnswers;
    }


    @Override
    public void onBackPressed() {
        startActivity(new Intent(QuizActivity.this, MainActivity.class));
        finish();
    }

    private void showAnswer() {
        final String getAnswer = questionsList.get(currentQuestionPosition).getAnswer();

        if (option1.getText().toString().equals(getAnswer)) {
            option1.setBackgroundResource(R.drawable.roundgreenback);
            option1.setTextColor(Color.WHITE);
        } else if (option2.getText().toString().equals(getAnswer)) {
            option2.setBackgroundResource(R.drawable.roundgreenback);
            option2.setTextColor(Color.WHITE);
        } else if (option3.getText().toString().equals(getAnswer)) {
            option3.setBackgroundResource(R.drawable.roundgreenback);
            option3.setTextColor(Color.WHITE);
        } else if (option4.getText().toString().equals(getAnswer)) {
            option4.setBackgroundResource(R.drawable.roundgreenback);
            option4.setTextColor(Color.WHITE);
        }
    }


}
