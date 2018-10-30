package com.kre8tive.quizapp.Refresh;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import com.kre8tive.quizapp.R;

public class CorrectWrong extends AppCompatActivity {

    Button btn_correct,btn_wrong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_correct_wrong);
        btn_correct=(Button)findViewById(R.id.correct);
        btn_wrong=(Button)findViewById(R.id.wrong);



    }
}
