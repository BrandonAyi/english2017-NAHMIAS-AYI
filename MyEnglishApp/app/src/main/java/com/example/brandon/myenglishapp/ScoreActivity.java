package com.example.brandon.myenglishapp;

import android.app.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by brandon on 09/02/17.
 */

public class ScoreActivity extends Activity {

    private TextView textResult;
    int mark=0;
    Button returnButton;
    Button homeMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.score_print);

        textResult = ( (TextView) findViewById(R.id.textView) );
        mark = getIntent().getIntExtra("score",0);
        textResult.setText("YOUR MARK IS "+mark+"/6");

        returnButton = (Button) findViewById(R.id.returnButton);
        returnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ScoreActivity.this, QCMActivity.class);
                startActivity(intent);
            }
        });

        homeMenu = (Button) findViewById(R.id.homeButton);
        homeMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ScoreActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

}
