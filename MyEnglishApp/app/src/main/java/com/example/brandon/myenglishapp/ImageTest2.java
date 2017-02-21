package com.example.brandon.myenglishapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by brandon on 16/02/17.
 */

public class ImageTest2 extends ImageTest1 {

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

        //int imageScore = getIntent().getIntExtra("score",0);

        ImageClik(imageView4);
        ImageClik(imageView5);
        ImageClik(imageView6);
    }

    public void ImageClik(final ImageView imageSelected) {
        imageSelected.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (imageSelected.getId() == R.id.imageView05) {
                    imageScore++;
                }
                Intent intent = new Intent(ImageTest2.this, ScoreActivity.class);
                //System.out.print("le score est" + imageScore);
                intent.putExtra("exercice","ImageTest");
                intent.putExtra("ImageScore", imageScore);
                imageScore=0;
                startActivity(intent);
            }
        });
    }
}
