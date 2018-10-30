package com.kre8tive.quizapp;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.kre8tive.quizapp.Questions.One;
import com.kre8tive.quizapp.Refresh.Refresh;
import com.kre8tive.quizapp.Util.QuestionGenerator;
import com.kre8tive.quizapp.Util.QuizApp;

public class IntroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                QuizApp.getDaoSession().getQuestionsDao().deleteAll();
                QuestionGenerator.generateQuestions();
                /* Create an Intent that will start the Menu-Activity. */
                Intent intent = new Intent(IntroActivity.this, Refresh.class);
                Bundle bundle=new Bundle();
                bundle.putInt("refresh",1);
                intent.putExtras(bundle);
                startActivity(intent);
                finish();

            }
        }, 7000);
    }
}
