package com.xiaor.androidbugly;

import android.app.Application;

import com.xiaor.xrbugly.XRBugly;

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        XRBugly.init(getApplicationContext(), "appid", true);
        XRBugly.autoUpgrade(getApplicationContext(), "更新地址");
    }
}
