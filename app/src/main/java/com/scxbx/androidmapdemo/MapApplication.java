package com.scxbx.androidmapdemo;

import android.app.Application;

import com.baidu.mapapi.CoordType;
import com.baidu.mapapi.SDKInitializer;

public class MapApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        SDKInitializer.setCoordType(CoordType.BD09LL);
        SDKInitializer.initialize(this);
    }
}
