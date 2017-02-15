package com.example.brandon.myenglishapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

/**
 * Created by brandon on 13/02/17.
 */

public class ImageTest1 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.image_test1);

        ImageView imageView11 = (ImageView) findViewById(R.id.imageView11);
        imageView11.setImageResource(R.drawable.sample01);

        ImageView imageView12 = (ImageView) findViewById(R.id.imageView12);
        imageView12.setImageResource(R.drawable.sample02);

        ImageView imageView14 = (ImageView) findViewById(R.id.imageView14);
        imageView14.setImageResource(R.drawable.sample04);
    }
}
