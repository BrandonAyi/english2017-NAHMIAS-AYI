package com.example.brandon.myenglishapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TabHost;
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

        //PERMET DE GERER DES ONGLETS POUR LA CORRECTION DES EXERCICES
        TabHost host = (TabHost)findViewById(R.id.tabHost);
        host.setup();

        //Tab 1
        TabHost.TabSpec spec = host.newTabSpec("SCORE");
        spec.setContent(R.id.score);
        spec.setIndicator("SCORE");
        host.addTab(spec);

        //Tab 2
        spec = host.newTabSpec("CORRECTION");
        spec.setContent(R.id.correction);
        spec.setIndicator("CORRECTION");
        host.addTab(spec);

        textResult = ((TextView) findViewById(R.id.textViewScore));
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
