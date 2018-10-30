package com.kre8tive.quizapp;
import android.content.Context;
import android.content.Intent;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.kre8tive.quizapp.Util.QuestionGenerator;
import com.kre8tive.quizapp.Database.Questions;
import com.kre8tive.quizapp.Util.QuizApp;
import com.kre8tive.quizapp.Database.Result;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class MainActivity extends AppCompatActivity {

    private RadioGroup radioGroup;
    private TextView tv_question;
    private RelativeLayout relativeLayout;
    private Button next;
    int counter=0;
    String answer,wrongrbid;
    int count;
    List<String> answers;
    private List<Result> result;


    private RadioButton rb1,rb2,rb3,rb4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        relativeLayout=(RelativeLayout)findViewById(R.id.layout_main);
        radioGroup=(RadioGroup) findViewById(R.id.radioGroup);
        rb1=(RadioButton)findViewById(R.id.radioButton1);
        rb2=(RadioButton)findViewById(R.id.radioButton2);
        rb3=(RadioButton)findViewById(R.id.radioButton3);
        rb4=(RadioButton)findViewById(R.id.radioButton4);
        ///
        this.overridePendingTransition(R.anim.right_animation,
                R.anim.left_animation);
        tv_question=(TextView)findViewById((R.id.tv_question));
        next=(Button)findViewById(R.id.btn_next);
        answers=new ArrayList<>();
        QuizApp.getDaoSession().getResultDao().deleteAll();
        QuizApp.getDaoSession().getQuestionsDao().deleteAll();
       QuestionGenerator.generateQuestions();

        final List<Questions> question = QuizApp.getDaoSession().getQuestionsDao().loadAll();
        count=question.size();
        Log.d("count",""+count);


        ///Radio Logic
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton rb = (RadioButton) group.findViewById(checkedId);
                if (radioGroup.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(MainActivity.this, "again", Toast.LENGTH_SHORT).show();


                }else if(!rb.getText().equals(wrongrbid)&&!wrongrbid.equals("a")){

                    Vibrator vibs = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                    vibs.vibrate(200);

                    Toast.makeText(MainActivity.this, "incorrect", Toast.LENGTH_SHORT).show();


                }



            }
        });

        setquestion(0,question);
        counter=1;



        next.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                RadioButton rb = (RadioButton) radioGroup.findViewById(radioGroup.getCheckedRadioButtonId());


                if (radioGroup.getCheckedRadioButtonId() == -1)
                {
                    Toast.makeText(MainActivity.this, "Please select one answer", Toast.LENGTH_SHORT).show();
                }else {
                    answer=rb.getText().toString();

                    if (counter== count) {
                        Result result1 = new Result(answer, question.get(counter-1).getId());
                        QuizApp.getDaoSession().getResultDao().insert(result1);
                        counter = 0;
                        Intent intent = new Intent(MainActivity.this, ResultActivity.class);
                        startActivity(intent);
                        finish();


                    } else {

                        wrongrbid="a";

                        setquestion(counter, question);
                        Result result1 = new Result(answer, question.get(counter-1).getId());
                        QuizApp.getDaoSession().getResultDao().insert(result1);
                        counter++;

                        }

                    }


                    onClear(v);
                }


        });


    }



    private void setquestion(int i,List<Questions> question) {
        TranslateAnimation animObj= new TranslateAnimation(0,tv_question.getWidth(), 0, 0);
        animObj.setDuration(200);
        answers.add(question.get(i).getCorrect());
        answers.add(question.get(i).getWrong1());
        answers.add(question.get(i).getWrong2());
        answers.add(question.get(i).getWrong3());
        Collections.shuffle(answers);



        tv_question.startAnimation(animObj);
        tv_question.setText(question.get(i).getQuestion());
        rb1.setText(answers.get(0));
        if (answers.get(0).equals(question.get(i).getCorrect())){
            wrongrbid="1";
        }
        rb2.setText(answers.get(1));
        if (answers.get(1).equals(question.get(i).getCorrect())){
            wrongrbid="2";
        }
        rb3.setText(answers.get(2));
        if (answers.get(2).equals(question.get(i).getCorrect())){
            wrongrbid="3";
        }
        rb4.setText(answers.get(3));
        if (answers.get(3).equals(question.get(i).getCorrect())){
            wrongrbid="4";
        }
        wrongrbid=question.get(i).getCorrect();
        answers.clear();
    }

    public void onClear(View v) {
        /* Clears all selected radio buttons to default */
        radioGroup.clearCheck();
    }

    public void onSubmit(View v) {
        RadioButton rb = (RadioButton) radioGroup.findViewById(radioGroup.getCheckedRadioButtonId());
        Toast.makeText(MainActivity.this, rb.getText(), Toast.LENGTH_SHORT).show();
    }

        //


    }

