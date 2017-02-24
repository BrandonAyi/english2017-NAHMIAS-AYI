package com.example.brandon.myenglishapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.*;



public class TimeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.time);

        TabHost tab = (TabHost) findViewById(R.id.ntm);
        tab.setup();

        TabHost.TabSpec spec1 = tab.newTabSpec("PRESENT");
        spec1.setIndicator("PRESENT");
        spec1.setContent(R.id.Present);
        tab.addTab(spec1);

        TabHost.TabSpec spec2 = tab.newTabSpec("PAST");
        spec1.setIndicator("PAST");
        spec1.setContent(R.id.Past);
        tab.addTab(spec2);

        TabHost.TabSpec spec3 = tab.newTabSpec("FUTURE");
        spec1.setIndicator("FUTURE");
        spec1.setContent(R.id.Future);
        tab.addTab(spec3);
    }

}
