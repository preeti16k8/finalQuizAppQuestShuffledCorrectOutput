package com.kre8tive.quizapp;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.kre8tive.quizapp.Questions.Five;
import com.kre8tive.quizapp.Questions.Four;
import com.kre8tive.quizapp.Questions.Three;
import com.kre8tive.quizapp.Questions.Two;
import com.kre8tive.quizapp.Refresh.Refresh;
import com.kre8tive.quizapp.Util.QuestionGenerator;
import com.kre8tive.quizapp.Util.QuizApp;

public class CorrectActivity extends AppCompatActivity {
    ImageView correct,wrong;
    int i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_correct);
        correct=(ImageView)findViewById(R.id.correct);
        wrong=(ImageView)findViewById(R.id.wrong);
        correct.setVisibility(View.VISIBLE);
        Intent intent=getIntent();
        i=intent.getIntExtra("two",0);
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                Intent intent;
                switch (i) {

                    case 2:

                        intent = new Intent(CorrectActivity.this, Two.class);
                        startActivity(intent);
                        finish();
                        break;
                    case 3:
                        intent = new Intent(CorrectActivity.this, Three.class);
                        startActivity(intent);
                        finish();

                        break;
                    case 4:
                        intent = new Intent(CorrectActivity.this, Four.class);
                        startActivity(intent);
                        finish();
                        break;
                    case 5:

                        intent = new Intent(CorrectActivity.this, Five.class);
                        startActivity(intent);
                        finish();
                        break;
                    case 6:

                        intent = new Intent(CorrectActivity.this, ResultActivity.class);
                        startActivity(intent);
                        finish();
                        break;
                }



            }
        }, 400);


    }
}

