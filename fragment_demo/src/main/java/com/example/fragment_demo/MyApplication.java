package com.example.fragment_demo;

import android.app.Application;

/**
 * Created by lxmisbest on 2017/5/21.
 */

public class MyApplication extends Application {
    public static MyApplication myApplication;
    @Override
    public void onCreate() {
        super.onCreate();
        myApplication = this;
    }
    public static MyApplication getInstantce(){
        return myApplication;
    }
}
