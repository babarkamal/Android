package com.example.android.drinks;

import android.app.Application;
import  com.firebase.client.Firebase;

/**
 * Created by SBK on 11-Jan-17.
 */
public class Drinks extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

    Firebase.setAndroidContext(this);



    }
}
