package com.kre8tive.quizapp.Questions;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.kre8tive.quizapp.CorrectActivity;
import com.kre8tive.quizapp.Database.Questions;
import com.kre8tive.quizapp.Database.Result;
import com.kre8tive.quizapp.R;
import com.kre8tive.quizapp.Refresh.Refresh;
import com.kre8tive.quizapp.Util.QuizApp;
import com.kre8tive.quizapp.WrongActivity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static com.kre8tive.quizapp.Questions.One.questions;

public class Three extends AppCompatActivity {

    TextView question;
    Button btn1,btn2,btn3,btn4;
    List<Questions> questionsthree;
    List<String> answers;
    String question1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);

        this.overridePendingTransition(R.anim.right_animation,
                R.anim.left_animation);

        answers=new ArrayList<>();
        questionsthree=new ArrayList<>();
        question=(TextView) findViewById(R.id.tv_question);
        btn1=(Button) findViewById(R.id.btn_one);
        btn2=(Button) findViewById(R.id.btn_two);
        btn3=(Button) findViewById(R.id.btn_three);
        btn4=(Button) findViewById(R.id.btn_four);

        //Load questions

       // questions = QuizApp.getDaoSession().getQuestionsDao().loadAll();
        questionsthree=questions;

        //Answers
        answers.add(questionsthree.get(2).getCorrect());
        answers.add(questionsthree.get(2).getWrong1());
        answers.add(questionsthree.get(2).getWrong2());
        answers.add(questionsthree.get(2).getWrong3());
        Collections.shuffle(answers);

        btn1.setText(answers.get(0));
        btn2.setText(answers.get(1));
        btn3.setText(answers.get(2));
        btn4.setText(answers.get(3));
        //Question

        question.setText(questionsthree.get(2).getQuestion());
        question1=questionsthree.get(2).getCorrect();



        btn1.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Result result1 = new Result(btn1.getText().toString(), questionsthree.get(2).getId());
                QuizApp.getDaoSession().getResultDao().insert(result1);
                checkAnswer(btn1.getText().toString());

            }
        });
        btn2.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Result result1 = new Result(btn2.getText().toString(), questionsthree.get(2).getId());
                QuizApp.getDaoSession().getResultDao().insert(result1);
                checkAnswer(btn2.getText().toString());

            }
        });
        btn3.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Result result1 = new Result(btn3.getText().toString(), questionsthree.get(2).getId());
                QuizApp.getDaoSession().getResultDao().insert(result1);
                checkAnswer(btn3.getText().toString());

            }
        });
        btn4.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Result result1 = new Result(btn4.getText().toString(), questionsthree.get(2).getId());
                QuizApp.getDaoSession().getResultDao().insert(result1);
                checkAnswer(btn4.getText().toString());

            }
        });




    }
    private void checkAnswer(String btntxt) {
        Bundle bundle=new Bundle();
        bundle.putInt("two",4);
        if(btntxt.equals(question1)){
            Intent intent = new Intent(Three.this, CorrectActivity.class);
            intent.putExtras(bundle);
            startActivity(intent);
            finish();

        }else {
            Intent intent = new Intent(Three.this, WrongActivity.class);
            intent.putExtras(bundle);
            startActivity(intent);
            finish();
        }

    }
}
