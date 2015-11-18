package com.example.android.mediabrowserservice.management;

import android.app.Application;

/**
 * Created by gufran on 11/17/15.
 */
public class MediaBrowserApplication extends Application {

    private static MediaBrowserApplication mediaBrowserApplication;


    @Override
    public void onCreate() {
        super.onCreate();
        mediaBrowserApplication = this;
    }


    public static MediaBrowserApplication getInstance() {
        return mediaBrowserApplication;
    }
}
