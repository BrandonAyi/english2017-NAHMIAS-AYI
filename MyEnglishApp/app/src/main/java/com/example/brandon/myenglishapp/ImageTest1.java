package com.example.brandon.myenglishapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by brandon on 13/02/17.
 */

public class ImageTest1 extends Activity {

    static int imageScore=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.image_test1);

        ImageView imageView1 = (ImageView) findViewById(R.id.imageView01);
        imageView1.setImageResource(R.drawable.sample01);

        ImageView imageView2 = (ImageView) findViewById(R.id.imageView02);
        imageView2.setImageResource(R.drawable.sample02);

        ImageView imageView3 = (ImageView) findViewById(R.id.imageView03);
        imageView3.setImageResource(R.drawable.sample03);

        ImageClik(imageView1);
        ImageClik(imageView2);
        ImageClik(imageView3);
    }

    public void ImageClik(final ImageView imageSelected) {
        imageSelected.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (imageSelected.getId() == R.id.imageView01) {
                    imageScore++;
                }
                Intent intent = new Intent(ImageTest1.this, ImageTest2.class);
                //intent.putExtra("score", imageScore);
                startActivity(intent);
            }
        });
    }
}
