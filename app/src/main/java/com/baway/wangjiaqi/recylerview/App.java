package com.baway.wangjiaqi.recylerview;

import android.app.Application;

import org.xutils.x;

/**
 * Created by admin on 2017/8/18.
 */

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        x.Ext.init(this);
        x.Ext.setDebug(true);

    }
}
