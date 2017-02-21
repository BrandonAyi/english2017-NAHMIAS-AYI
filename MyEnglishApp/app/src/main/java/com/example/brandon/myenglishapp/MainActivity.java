package com.example.brandon.myenglishapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //BOUTON POUR ALLER A LA PAGE DES EXERCICES
        TextView exercicesButton = (TextView) findViewById(R.id.exercices);
        exercicesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ExercicesActivity.class);
                startActivity(intent);
            }
        });

        //BOUTON POUR ALLER A LA PAGE DES LECONS
        TextView lessonsButton = (TextView) findViewById(R.id.lessons);
        lessonsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LessonsActivity.class);
                startActivity(intent);
            }
        });
    }

}

