package com.example.brandon.myenglishapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by brandon on 05/03/17.
 */

public class QCM2Activity extends Activity {

    int score=0;

    @Override
    public void onBackPressed()
    {
        QCM2Activity.this.finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.qcm2);

        Button buttonScore = (Button) findViewById(R.id.buttonScore);
        buttonScore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                verifyScore();
                Intent intent = new Intent(QCM2Activity.this, ScoreActivity.class);
                intent.putExtra("exercice","QCM2");
                intent.putExtra("QCMscore", score);
                score=0;
                startActivity(intent);
            }
        });
    }

    private void verifyScore() {
        EditText edit1 = (EditText) findViewById(R.id.editText);
        EditText edit2 = (EditText) findViewById(R.id.editText2);
        EditText edit3 = (EditText) findViewById(R.id.editText3);
        EditText edit4 = (EditText) findViewById(R.id.editText4);
        EditText edit5 = (EditText) findViewById(R.id.editText5);
        EditText edit6 = (EditText) findViewById(R.id.editText6);

        if (edit1.getText().toString().equals("A")) {
            score++;
        }
        if (edit2.getText().toString().equals("B")) {
            score++;
        }
        if (edit3.getText().toString().equals("D")) {
            score++;
        }
        if (edit4.getText().toString().equals("D")) {
            score++;
        }
        if (edit5.getText().toString().equals("C")) {
            score++;
        }
        if (edit6.getText().toString().equals("C")) {
            score++;
        }
    }
}
