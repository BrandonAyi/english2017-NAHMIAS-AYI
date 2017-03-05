package com.example.brandon.myenglishapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by brandon on 01/03/17.
 */

public class AsLikeLessonActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.as_like);

        Button asLike = (Button) findViewById(R.id.asLikeButton);
        asLike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AsLikeLessonActivity.this, AsLikeExerciceActivity.class);
                startActivity(intent);
            }
        });
    }
}
