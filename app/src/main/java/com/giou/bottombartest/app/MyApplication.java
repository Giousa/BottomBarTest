package com.giou.bottombartest.app;

import android.app.Application;
import android.content.Context;

/**
 * Description:
 * Author:Giousa
 * Date:2016/12/8
 * Email:65489469@qq.com
 */
public class MyApplication extends Application {

    //全局上下文环境
    private static Context mContext;

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = getApplicationContext();
    }

    public static Context getContext() {
        return mContext;
    }

    public static void setContext(Context mContext) {
        MyApplication.mContext = mContext;
    }
}
