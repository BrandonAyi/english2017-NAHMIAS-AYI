package com.example.brandon.myenglishapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
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

        //Tab 1 AVEC LE SCORE ET LES BOUTTONS DE RETOUR AU MENU ET POUR REFAIRE LEXERCICE
        TabHost.TabSpec spec = host.newTabSpec("SCORE");
        spec.setContent(R.id.score);
        spec.setIndicator("SCORE");
        host.addTab(spec);

        //Tab 2 AVEC LA CORRECTION DU QCM
        spec = host.newTabSpec("CORRECTION QCM");
        spec.setContent(R.id.correction1);
        spec.setIndicator("CORRECTION QCM");
        host.addTab(spec);

        //Tab 3 AVEC LA CORRECTION DES IMAGES TESTS
        spec = host.newTabSpec("CORRECTION IMAGE TEST");
        spec.setContent(R.id.correction2);
        spec.setIndicator("CORRECTION IMAGE TEST");
        host.addTab(spec);

        textResult = ((TextView) findViewById(R.id.textViewScore));

        //CAS OU L'EXERCICE ETAIT LE QCM
        if (getIntent().getStringExtra("exercice").equals("QCM")) {

            host.getTabWidget().getChildTabViewAt(2).setEnabled(false); //DESACTIVER L'ONGLET DE LA CORRECTION DE IMAGE TEST

            mark = getIntent().getIntExtra("QCMscore",0);
            textResult.setText("YOUR MARK IS "+mark+"/6");

            returnButton = (Button) findViewById(R.id.returnButton);
            returnButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(ScoreActivity.this, QCMActivity.class);
                    startActivity(intent);
                }
            });

        //CAS OU L'EXERCICE ETAIT LE TEST DES IMAGES
        } else if (getIntent().getStringExtra("exercice").equals("ImageTest")) {

            //LES IMAGES A AFFICHER DANS L'ONGLET CORRECTION IMAGE TEST
            ImageView imageView1 = (ImageView) findViewById(R.id.imageView01);
            imageView1.setImageResource(R.drawable.sample01);

            ImageView imageView5 = (ImageView) findViewById(R.id.imageView05);
            imageView5.setImageResource(R.drawable.sample05);

            host.getTabWidget().getChildTabViewAt(1).setEnabled(false); //DESACTIVER L'ONGLET DE LA CORRECTION DU QCM

            mark = getIntent().getIntExtra("ImageScore",0);
            textResult.setText("YOUR MARK IS "+mark+"/2");

            returnButton = (Button) findViewById(R.id.returnButton);
            returnButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(ScoreActivity.this, ImageTest1.class);
                    startActivity(intent);
                }
            });
        }

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
