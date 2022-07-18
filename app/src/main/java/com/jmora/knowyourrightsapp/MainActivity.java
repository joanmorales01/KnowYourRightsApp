package com.jmora.knowyourrightsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.jmora.knowyourrightsapp.R;

public class MainActivity extends AppCompatActivity {

    private String selectedTopicName = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final LinearLayout lawEnforcement = findViewById(R.id.lawEnforcementLayout);
        final LinearLayout immigrants = findViewById(R.id.immigrantsLayout);
        final LinearLayout medical = findViewById(R.id.medicalLayout);
        final LinearLayout workers = findViewById(R.id.workersLayout);

        final Button quizMeButton = findViewById(R.id.quizMeButton);

        lawEnforcement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopicName = "Law Enforcement";
                lawEnforcement.setBackgroundResource(R.drawable.roundyellowstroke);

                immigrants.setBackgroundResource(R.drawable.roundwhiteback);
                medical.setBackgroundResource(R.drawable.roundwhiteback);
                workers.setBackgroundResource(R.drawable.roundwhiteback);
            }
        });


        immigrants.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopicName = "Immigrants";
                immigrants.setBackgroundResource(R.drawable.roundyellowstroke);

                lawEnforcement.setBackgroundResource(R.drawable.roundwhiteback);
                medical.setBackgroundResource(R.drawable.roundwhiteback);
                workers.setBackgroundResource(R.drawable.roundwhiteback);
            }
        });


        medical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopicName = "Medical";
                medical.setBackgroundResource(R.drawable.roundyellowstroke);

                lawEnforcement.setBackgroundResource(R.drawable.roundwhiteback);
                immigrants.setBackgroundResource(R.drawable.roundwhiteback);
                workers.setBackgroundResource(R.drawable.roundwhiteback);
            }
        });


        workers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopicName = "Workers";
                workers.setBackgroundResource(R.drawable.roundyellowstroke);

                lawEnforcement.setBackgroundResource(R.drawable.roundwhiteback);
                immigrants.setBackgroundResource(R.drawable.roundwhiteback);
                medical.setBackgroundResource(R.drawable.roundwhiteback);
            }
        });

        quizMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(selectedTopicName.isEmpty()){
                    Toast.makeText(MainActivity.this, "Select a topic to continue", Toast.LENGTH_SHORT).show();
                }
                else{
                    Intent intent = new Intent(MainActivity.this,QuizActivity.class);
                    intent.putExtra("selectedTopic", selectedTopicName);
                    startActivity(intent);
                }
            }
        });


    }
}