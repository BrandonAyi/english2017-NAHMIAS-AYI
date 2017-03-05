package com.example.brandon.myenglishapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

/**
 * Created by brandon on 14/02/17.
 */

public class QCMActivity extends Activity{

    public int score=0;
    RadioGroup radioGroup1 = null;
    RadioGroup radioGroup2 = null;
    RadioGroup radioGroup3 = null;
    RadioGroup radioGroup4 = null;
    RadioGroup radioGroup5 = null;
    RadioGroup radioGroup6 = null;

    @Override
    public void onBackPressed()
    {
        QCMActivity.this.finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.qcm_exercice);

        Button buttonScore = (Button) findViewById(R.id.buttonScore);
        buttonScore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                verifyScore();
                Intent intent = new Intent(QCMActivity.this, ScoreActivity.class);
                intent.putExtra("exercice","QCM");
                intent.putExtra("QCMscore", score);
                score=0;
                startActivity(intent);
            }
        });
    }

    public void verifyScore() {
        radioGroup1 = (RadioGroup)findViewById(R.id.radioGroup1);
        radioGroup2 = (RadioGroup)findViewById(R.id.radioGroup2);
        radioGroup3 = (RadioGroup)findViewById(R.id.radioGroup3);
        radioGroup4 = (RadioGroup)findViewById(R.id.radioGroup4);
        radioGroup5 = (RadioGroup)findViewById(R.id.radioGroup5);
        radioGroup6 = (RadioGroup)findViewById(R.id.radioGroup6);

        if(radioGroup1.getCheckedRadioButtonId() == R.id.radioButton3) {
            score++;
        }

        if(radioGroup2.getCheckedRadioButtonId() == R.id.radioButton6) {
            score++;
        }

        if(radioGroup3.getCheckedRadioButtonId() == R.id.radioButton7) {
            score++;
        }

        if(radioGroup4.getCheckedRadioButtonId() == R.id.radioButton12) {
            score++;
        }

        if(radioGroup5.getCheckedRadioButtonId() == R.id.radioButton14) {
            score++;
        }

        if(radioGroup6.getCheckedRadioButtonId() == R.id.radioButton17) {
            score++;
        }
    }
}
