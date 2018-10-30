package com.kre8tive.quizapp.Util;

import android.app.Application;

import com.facebook.stetho.Stetho;
import com.kre8tive.quizapp.Database.DaoMaster;
import com.kre8tive.quizapp.Database.DaoSession;

import org.greenrobot.greendao.database.Database;

/**
 * Created by Ravi on 13/05/15.
 */

public class QuizApp extends Application {

    public static final String TAG = QuizApp.class
            .getSimpleName();



    private static QuizApp mInstance;
    private static DaoSession daoSession;


    @Override
    public void onCreate() {
        super.onCreate();

        mInstance = this;
        //DAO
        DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(this, "Quiz");
        Database db = helper.getWritableDb();
        daoSession = new DaoMaster(db).newSession();
        Stetho.initializeWithDefaults(this);



    }
    public static DaoSession getDaoSession() {
        return daoSession;
    }

    public static QuizApp getInstance()
    {
        return mInstance;
    }


}