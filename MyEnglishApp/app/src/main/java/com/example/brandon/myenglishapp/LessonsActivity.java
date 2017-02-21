package com.example.brandon.myenglishapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * Created by brandon on 14/02/17.
 */

public class LessonsActivity extends Activity {

    //PAGE OU IL Y A LA LISTE DES LECONS
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lessons_activity);

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
    }
}
