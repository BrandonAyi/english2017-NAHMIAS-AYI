package com.example.brandon.myenglishapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by brandon on 14/02/17.
 */

public class ExercicesActivity extends Activity {

    @Override
    public void onBackPressed()
    {
        ExercicesActivity.this.finish();
    }

    //PAGE OU IL Y A LA LISTE DES EXERCICES
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exercices_activiy);

        ImageView imageView1 = (ImageView) findViewById(R.id.exoImage);
        imageView1.setImageResource(R.drawable.exercises);

        TextView QCM = (TextView) findViewById(R.id.qcm);
        QCM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ExercicesActivity.this, QCMActivity.class);
                startActivity(intent);
            }
        });

        TextView imageTest = (TextView) findViewById(R.id.imageTest);
        imageTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ExercicesActivity.this, ImageTest1.class);
                startActivity(intent);
            }
        });

        TextView correctTense = (TextView) findViewById(R.id.correctTense);
        correctTense.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ExercicesActivity.this, CorrectTenseActivity.class);
                startActivity(intent);
            }
        });

        TextView QCM2 = (TextView) findViewById(R.id.QCM2);
        QCM2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ExercicesActivity.this, QCM2Activity.class);
                startActivity(intent);
            }
        });
    }
}
