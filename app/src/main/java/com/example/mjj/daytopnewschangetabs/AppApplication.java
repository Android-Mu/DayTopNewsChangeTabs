package com.example.mjj.daytopnewschangetabs;

import android.app.Application;

import com.example.mjj.daytopnewschangetabs.db.SQLHelper;

public class AppApplication extends Application {

    private static AppApplication mAppApplication;
    private SQLHelper sqlHelper;

    @Override
    public void onCreate() {
        super.onCreate();
        mAppApplication = this;
    }

    /**
     * 获取Application
     */
    public static AppApplication getApp() {
        return mAppApplication;
    }

    /**
     * 获取数据库Helper
     */
    public SQLHelper getSQLHelper() {
        if (sqlHelper == null)
            sqlHelper = new SQLHelper(mAppApplication);
        return sqlHelper;
    }

    @Override
    public void onTerminate() {
        if (sqlHelper != null)
            sqlHelper.close();
        super.onTerminate();
        //整体摧毁的时候调用这个方法
    }

}
