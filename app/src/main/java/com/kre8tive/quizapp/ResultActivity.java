package com.kre8tive.quizapp;

import android.content.Intent;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import android.widget.TextView;
import android.widget.Toast;


import com.kre8tive.quizapp.Database.Prizes;
import com.kre8tive.quizapp.Database.PrizesDao;
import com.kre8tive.quizapp.Database.Questions;
import com.kre8tive.quizapp.Util.QuizApp;
import com.kre8tive.quizapp.Database.Result;


import org.greenrobot.greendao.query.DeleteQuery;

import java.util.Collections;
import java.util.List;

import static com.kre8tive.quizapp.Questions.One.questions;

public class ResultActivity extends AppCompatActivity {
    int total=0;
    TextView tv_succe;
    ImageView img;
    int i;
    int winCalculation;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        tv_succe=(TextView)findViewById(R.id.tv_success);

        img=(ImageView)findViewById(R.id.tm_gift);
        Button playagain=(Button)findViewById(R.id.retry);



        SharedPreferences prefs = PreferenceManager
                .getDefaultSharedPreferences(this);
        winCalculation=prefs.getInt("time",0);
        if(winCalculation==0||winCalculation==10) {
            for (i = 1; i <= 5; i++) {
                winCalculation=1;
                Prizes prizes = new Prizes(i, "CONGRATULATIONS! YOU HAVE WON A SPECIAL INCENTIVE. LEVERAGE IT.");
                QuizApp.getDaoSession().getPrizesDao().insert(prizes);
            }

            for (i = 6; i <= 8; i++) {
                Prizes prizes = new Prizes(i, "CONGRATULATIONS!  YOU HAVE WON YOURSELF A BONUS. EMPOWER YOURSELF.");
                QuizApp.getDaoSession().getPrizesDao().insert(prizes);
            }

            for (i = 9; i <= 10; i++) {
                Prizes prizes = new Prizes(i, "CONGRATULATIONS! YOU HAVE BEEN RECOGNIZED. CAPITALIZE IT.");
                QuizApp.getDaoSession().getPrizesDao().insert(prizes);
            }
        }else {
            winCalculation=winCalculation+1;
        }






        //
        List<Prizes> prizesList=QuizApp.getDaoSession().getPrizesDao().loadAll();
        Collections.shuffle(prizesList);




        //Animation
        this.overridePendingTransition(R.anim.right_animation,
                R.anim.left_animation);

       // final List<Questions> question = QuizApp.getDaoSession().getQuestionsDao().loadAll();
        final List<Questions> question = questions;
        final List<Result> results= QuizApp.getDaoSession().getResultDao().loadAll();

      //  for(int i=0;i<question.size()-1;i++){
        for(int i=0;i<question.size()-63;i++){       //total 42 questions   so  42-5+1=38           total 67 ques so 67-5+1=63
            String correct=
            question.get(i).getCorrect();
            String answer=results.get(i).getAnswer();
            if(answer.equals(correct)){
                total=total+1;
            }
        }



// if(total+1==question.size()){
            if(total+1==question.size()-62){        // 67-5=62
                    tv_succe.setVisibility(View.VISIBLE);
                   // tv_succe.setText("Congratulations!\n YOU HAVE WON A Special Prize "+ prizesList.get(0).getPrizes());
                tv_succe.setText( prizesList.get(0).getPrizes());
                    img.setVisibility(View.VISIBLE);
                SharedPreferences prefss = PreferenceManager
                        .getDefaultSharedPreferences(this);
                SharedPreferences.Editor edit = prefss.edit();

                edit.putInt("time", winCalculation);
                edit.commit();

                final DeleteQuery<Prizes> tableDeleteQuery = QuizApp.getDaoSession().queryBuilder(Prizes.class)
                        .where(PrizesDao.Properties.Id.eq(prizesList.get(0).getId()))
                        .buildDelete();
                tableDeleteQuery.executeDeleteWithoutDetachingEntities();
                QuizApp.getDaoSession().clear();

            }else {

                tv_succe.setText("YOUR PERFORMANCE CAN BE BETTER.\n" +
                        "SEE YOU AT THE NEXT APPRAISAL.");



            }
        playagain.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ResultActivity.this, IntroActivity.class);
                startActivity(intent);
                finish();
            }


        });


}
}
