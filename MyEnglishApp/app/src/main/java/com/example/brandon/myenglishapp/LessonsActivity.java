package com.example.brandon.myenglishapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;



public class LessonsActivity extends Activity {

    @Override
    public void onBackPressed()
    {
        LessonsActivity.this.finish();
    }

    //PAGE OU IL Y A LA LISTE DES LECONS
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lessons_activity);

        ImageView imageView1 = (ImageView) findViewById(R.id.imageView2);
        imageView1.setImageResource(R.drawable.lessons);

        TextView phrasalVerbs = (TextView) findViewById(R.id.phrasalVerbs);
        phrasalVerbs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LessonsActivity.this, PhrasalVerbsActivity.class);
                startActivity(intent);
            }
        });

        TextView irregularVerbs = (TextView) findViewById(R.id.irregularVerbs);
        irregularVerbs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LessonsActivity.this, IrregularVerbsActivity.class);
                startActivity(intent);
            }
        });

        TextView time = (TextView) findViewById(R.id.time);
        time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LessonsActivity.this, TimeActivity.class);
                startActivity(intent);
            }
        });

        TextView asLike = (TextView) findViewById(R.id.asLike);
        asLike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LessonsActivity.this, AsLikeLessonActivity.class);
                startActivity(intent);
            }
        });

    }
}
