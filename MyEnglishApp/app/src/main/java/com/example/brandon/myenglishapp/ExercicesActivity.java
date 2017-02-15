package com.example.brandon.myenglishapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by brandon on 14/02/17.
 */

public class ExercicesActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exercices_activiy);

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
    }
}
