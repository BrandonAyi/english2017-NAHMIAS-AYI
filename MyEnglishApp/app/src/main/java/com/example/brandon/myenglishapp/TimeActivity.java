package com.example.brandon.myenglishapp;

import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.widget.*;



public class TimeActivity extends Activity {

    @Override
    public void onBackPressed()
    {
        TimeActivity.this.finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.time);

        TabHost tab = (TabHost) findViewById(R.id.ntm);
        tab.setup();

        TabHost.TabSpec spec1 = tab.newTabSpec("PRESENT");
        spec1.setIndicator("PRESENT");
        spec1.setContent(R.id.Present);
        tab.addTab(spec1);

        TabHost.TabSpec spec2 = tab.newTabSpec("PAST");
        spec2.setIndicator("PAST");
        spec2.setContent(R.id.Past);
        tab.addTab(spec2);

        TabHost.TabSpec spec3 = tab.newTabSpec("FUTURE");
        spec3.setIndicator("FUTURE");
        spec3.setContent(R.id.Future);
        tab.addTab(spec3);

        TextView t1 =(TextView) findViewById(R.id.textView90);
        String present = "<h1>QUAND LES UTILISER :</h1>  \n \n  \n <h4>PRESENT SIMPLE :</h4> \n \n \t Le présent simple est le temps de la <b>vérité générale</b>. Il désigne donc une action qui se répète dans le temps (I go there every Sunday) ou qui est toujours vraie (water boils at 100°C). \n \n <h4>PRESENT CONTINUS</h4> : \n \n \t Le présent continu correspond tout d’abord à notre « être en train de faire », il désigne donc une <b>action qui se produit au moment où l’on parle</b> et qui n’est donc pas terminée. \n \n <h4>PERFECT SIMPLE :</h4> \n \n \t  Le passé composé anglais s’emploie pour décrire une <b>action passée qui a un impact sur le temps présent.</b> \n \n <h4>PERFECT CONTINUOUS :</h4> \n \n \t Décris une action du passé qui se poursuit de nos jours.";
        t1.setText(Html.fromHtml(present));

        TextView t2 =(TextView) findViewById(R.id.textView91);
        String passe = "<h1>QUAND LES UTILISER : </h1>  \n \n \n <h4>PAST SIMPLE</h4> : \n \n \t Il permet de décrire une <b>action passée et terminée</b>, qui s’est déroulée dans un contexte bien défini qui la rattache au passé. \n \n <h4>PAST CONTINOUS</h4> : \n \n \t Il permet de décrire une <b>action qui s’est produite à un moment du passé</b>, en insistant sur la <b>durée</b>. \n \n <h4>PAST PERFECT SIMPLE :</h4>\n \n \t Comme notre plus-que-parfait, ce temps permet de décrire une <b>action qui s’est déroulée dans le passé, avant une autre plus récente</b>. \n \n <h4>PAST PERFECT CONTINUOUS :</h4> \n \n \t <i>I had been playing for five hours when they arrived</i> \n(j’avais joué pendant cinq heures lorsqu’ils arrivèrent) \n Ici, l’action a commencé dans le passé (il y a huit ans) et se poursuit encore de nos jours.";
        t2.setText(Html.fromHtml(passe));

        TextView t3 =(TextView) findViewById(R.id.textView92);
        String future ="<h1>QUAND LES UTILISER :</h1> \n \n \n <h4>FUTURE SIMPLE :</h4> \n \n \t Prédiction, événement futur qui se produira probablement \n \n <h4>PRESENT SIMPLE :</h4> \n \n \t Action planifiée et dont la réalisation est quasiment certaine, qui aura lieu à un moment très précis du futur :\n <i>The train leaves tomorrow at 4:30</i>\n (le train partira demain à 4h30). \n \n <h4>PRESENT CONTINUOUS :</h4> \n \n \t Action planifiée dans le futur : \n <i>Tonight I’m going to the cinema</i> \n(ce soir je vais au cinéma).\n <b>Attention</b> à la nuance avec la forme précédente : ici, il s’agit plutôt d’une intention que d’une vérité générale. \n \n <h4>GOING TO :</h4> \n \n \t Cette forme permet d’exprimer une intention dans un <b>futur proche</b> : \n <i>I’m going to buy a new car </i>\n(je vais bientôt m’acheter une nouvelle voiture).";
        t3.setText(Html.fromHtml(future));

    }

}
