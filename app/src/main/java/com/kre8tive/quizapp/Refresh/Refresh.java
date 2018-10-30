package com.kre8tive.quizapp.Refresh;

import android.content.Intent;
import android.os.CountDownTimer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.TextView;

import com.kre8tive.quizapp.IntroActivity;
import com.kre8tive.quizapp.Questions.Five;
import com.kre8tive.quizapp.Questions.Four;
import com.kre8tive.quizapp.Questions.One;
import com.kre8tive.quizapp.Questions.Three;
import com.kre8tive.quizapp.Questions.Two;
import com.kre8tive.quizapp.R;

import java.sql.Ref;


public class Refresh extends AppCompatActivity {
    ImageView one, two, three;
    TextView your,game,starts,now;

    int counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_refresh);
        Intent intent = getIntent();

        one = (ImageView) findViewById(R.id.one);
        two = (ImageView) findViewById(R.id.two);
        three = (ImageView) findViewById(R.id.three);
        your=(TextView) findViewById(R.id.your);
        game=(TextView) findViewById(R.id.game);
        starts=(TextView) findViewById(R.id.start);
        now=(TextView) findViewById(R.id.now);

        counter=0;
        new CountDownTimer(4500, 600) {

            public void onTick(long millisUntilFinished) {
                if(counter==0){

                    one.setVisibility(View.GONE);
                    two.setVisibility(View.GONE);
                    three.setVisibility(View.VISIBLE);
                }
                if(counter==1){
                    one.setVisibility(View.GONE);
                    two.setVisibility(View.VISIBLE);
                    three.setVisibility(View.GONE);


                }
                if(counter==2){
                    one.setVisibility(View.VISIBLE);
                    two.setVisibility(View.GONE);
                    three.setVisibility(View.GONE);


                }
                if(counter==3){
                    one.setVisibility(View.GONE);
                    two.setVisibility(View.GONE);
                    three.setVisibility(View.GONE);
                    your.setVisibility(View.VISIBLE);

                }
                if(counter==4){
                    one.setVisibility(View.GONE);
                    two.setVisibility(View.GONE);
                    three.setVisibility(View.GONE);
                    game.setVisibility(View.VISIBLE);

                }
                if(counter==5){
                    one.setVisibility(View.GONE);
                    two.setVisibility(View.GONE);
                    three.setVisibility(View.GONE);
                    starts.setVisibility(View.VISIBLE);

                }
                if(counter==6){
                    one.setVisibility(View.GONE);
                    two.setVisibility(View.GONE);
                    three.setVisibility(View.GONE);
                    now.setVisibility(View.VISIBLE);

                }
                counter++;
                //here you can have your logic to set text to edittext
            }

            public void onFinish() {
                Intent intent = new Intent(Refresh.this, One.class);

                startActivity(intent);
                finish();
            }

        }.start();


    }
}
