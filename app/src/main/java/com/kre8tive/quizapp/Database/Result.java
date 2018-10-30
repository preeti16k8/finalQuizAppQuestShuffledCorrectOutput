package com.kre8tive.quizapp.Database;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by Ashet on 04-11-2017.
 */
@Entity
public class Result {

    String answer;
    int id;
    @Generated(hash = 118432161)
    public Result(String answer, int id) {
        this.answer = answer;
        this.id = id;
    }
    @Generated(hash = 1176609929)
    public Result() {
    }
    public String getAnswer() {
        return this.answer;
    }
    public void setAnswer(String answer) {
        this.answer = answer;
    }
    public int getId() {
        return this.id;
    }
    public void setId(int id) {
        this.id = id;
    }


}
