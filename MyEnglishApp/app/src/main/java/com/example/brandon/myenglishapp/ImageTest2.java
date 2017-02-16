package com.example.brandon.myenglishapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

/**
 * Created by brandon on 16/02/17.
 */

public class ImageTest2 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.image_test2);

        ImageView imageView4 = (ImageView) findViewById(R.id.imageView04);
        imageView4.setImageResource(R.drawable.sample04);

        ImageView imageView5 = (ImageView) findViewById(R.id.imageView05);
        imageView5.setImageResource(R.drawable.sample05);

        ImageView imageView6 = (ImageView) findViewById(R.id.imageView06);
        imageView6.setImageResource(R.drawable.sample06);
    }

}
