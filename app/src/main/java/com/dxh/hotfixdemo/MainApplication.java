package com.dxh.hotfixdemo;

import android.app.Application;

import com.dxh.hotfixdemo.util.FixDexUtil;

/**
 * Created by XHD on 2022/07/09
 */
public class MainApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        FixDexUtil.startRepair( getApplicationContext());//开启热修复
    }
}
