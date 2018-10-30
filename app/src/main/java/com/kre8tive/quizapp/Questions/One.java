package com.kre8tive.quizapp.Questions;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.kre8tive.quizapp.CorrectActivity;
import com.kre8tive.quizapp.Database.Questions;
import com.kre8tive.quizapp.Database.Result;
import com.kre8tive.quizapp.R;
import com.kre8tive.quizapp.Util.QuizApp;
import com.kre8tive.quizapp.WrongActivity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class One extends AppCompatActivity {

    TextView question;
    Button btn1,btn2,btn3,btn4;
   public static List<Questions> questions;
    List<String> answers;
    String question1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);

        this.overridePendingTransition(R.anim.right_animation,
                R.anim.left_animation);
        QuizApp.getDaoSession().getResultDao().deleteAll();
        answers=new ArrayList<>();
        questions=new ArrayList<>();
        question=(TextView) findViewById(R.id.tv_question);
        btn1=(Button) findViewById(R.id.btn_one);
        btn2=(Button) findViewById(R.id.btn_two);
        btn3=(Button) findViewById(R.id.btn_three);
        btn4=(Button) findViewById(R.id.btn_four);


        //Load questions


         questions = QuizApp.getDaoSession().getQuestionsDao().loadAll();
         Log.d("qqqqq1", String.valueOf(questions));
         Collections.shuffle(questions);
        Log.d("qqqqq2", String.valueOf(questions));

         //Answers
        answers.add(questions.get(0).getCorrect());
        answers.add(questions.get(0).getWrong1());
        answers.add(questions.get(0).getWrong2());
        answers.add(questions.get(0).getWrong3());
        Collections.shuffle(answers);

        btn1.setText(answers.get(0));
        btn2.setText(answers.get(1));
        btn3.setText(answers.get(2));
        btn4.setText(answers.get(3));
        //Question

        question.setText(questions.get(0).getQuestion());
        question1=questions.get(0).getCorrect();

        btn1.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Result result1 = new Result(btn1.getText().toString(), questions.get(0).getId());
                QuizApp.getDaoSession().getResultDao().insert(result1);
                checkAnswer(btn1.getText().toString());



            }
        });
        btn2.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Result result1 = new Result(btn2.getText().toString(), questions.get(0).getId());
                QuizApp.getDaoSession().getResultDao().insert(result1);
                checkAnswer(btn2.getText().toString());

            }
        });
        btn3.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Result result1 = new Result(btn3.getText().toString(), questions.get(0).getId());
                QuizApp.getDaoSession().getResultDao().insert(result1);
                checkAnswer(btn3.getText().toString());

            }
        });
        btn4.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Result result1 = new Result(btn4.getText().toString(), questions.get(0).getId());
                QuizApp.getDaoSession().getResultDao().insert(result1);
                checkAnswer(btn4.getText().toString());


            }
        });




    }

    private void checkAnswer(String btntxt) {
        Bundle bundle=new Bundle();
        bundle.putInt("two",2);
        if(btntxt.equals(question1)){
            Intent intent = new Intent(One.this, CorrectActivity.class);
            intent.putExtras(bundle);
            startActivity(intent);
            finish();

        }else {
            Intent intent = new Intent(One.this, WrongActivity.class);
            intent.putExtras(bundle);
            startActivity(intent);
            finish();
        }

    }


}
