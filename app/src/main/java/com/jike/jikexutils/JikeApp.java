package com.jike.jikexutils;

import android.app.Application;

import org.xutils.x;

/**
 * Created by MaiBenBen on 2016/7/7.
 */
public class JikeApp extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        x.Ext.init(this);
    }
}
