package com.example.database;

import android.os.Bundle;
import org.apache.cordova.DroidGap;
import android.app.Activity;
import android.view.Menu;

public class Database extends DroidGap {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
		super.loadUrl("file:///android_asset/www/index.html");
		//super.loadUrl("http://jmellor.net/mobileapps/phptest/index.html");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_database, menu);
        return true;
    }
}
