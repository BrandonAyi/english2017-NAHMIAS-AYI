package com.example.brandon.myenglishapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by brandon on 18/02/17.
 */

public class CorrectTenseActivity extends Activity implements OnItemSelectedListener {

    public int score=0;

    // Spinner element
    Spinner spinner1;
    Spinner spinner2;
    Spinner spinner3;
    Spinner spinner4;
    Spinner spinner5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.correct_tense);

        Button buttonScore = (Button) findViewById(R.id.buttonScore);
        buttonScore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                verifyScore();
                Intent intent = new Intent(CorrectTenseActivity.this, ScoreActivity.class);
                intent.putExtra("exercice","correctTense");
                intent.putExtra("correctTenseScore", score);
                score=0;
                startActivity(intent);
            }
        });

        spinner1 = (Spinner) findViewById(R.id.spinner1);
        spinner2 = (Spinner) findViewById(R.id.spinner2);
        spinner3 = (Spinner) findViewById(R.id.spinner3);
        spinner4 = (Spinner) findViewById(R.id.spinner4);
        spinner5 = (Spinner) findViewById(R.id.spinner5);

        // Spinner click listener
        spinner1.setOnItemSelectedListener(this);
        // Spinner Drop down elements
        List<String> categories1 = new ArrayList<String>();
        categories1.add("has been appearing");
        categories1.add("has appeared");
        categories1.add("appeared");
        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories1);
        // Drop down layout style - list view with radio button
        dataAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(dataAdapter1);


        spinner2.setOnItemSelectedListener(this);
        List<String> categories2 = new ArrayList<String>();
        categories2.add("spilt");
        categories2.add("have been spilling");
        categories2.add("have spilt");
        ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories2);
        dataAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(dataAdapter2);


        spinner3.setOnItemSelectedListener(this);
        List<String> categories3 = new ArrayList<String>();
        categories3.add("tried");
        categories3.add("have tried");
        categories3.add("have been trying");
        ArrayAdapter<String> dataAdapter3 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories3);
        dataAdapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner3.setAdapter(dataAdapter3);

        spinner4.setOnItemSelectedListener(this);
        List<String> categories4 = new ArrayList<String>();
        categories4.add("have applied");
        categories4.add("have been applying");
        categories4.add("applied");
        ArrayAdapter<String> dataAdapter4 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories4);
        dataAdapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner4.setAdapter(dataAdapter4);

        spinner5.setOnItemSelectedListener(this);
        List<String> categories5 = new ArrayList<String>();
        categories5.add("have been boiling");
        categories5.add("have boiled");
        categories5.add("boiled");
        ArrayAdapter<String> dataAdapter5 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories5);
        dataAdapter5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner5.setAdapter(dataAdapter5);

    }

    public void verifyScore() {
        if (spinner1.getSelectedItem().toString().equals("appeared"))
            score++;
        if (spinner2.getSelectedItem().toString().equals("have spilt"))
            score++;
        if (spinner3.getSelectedItem().toString().equals("have been trying"))
            score++;
        if (spinner4.getSelectedItem().toString().equals("applied"))
            score++;
        if (spinner5.getSelectedItem().toString().equals("have been boiling"))
            score++;
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        // On selecting a spinner item
        //String item = parent.getItemAtPosition(position).toString();

        // Showing selected spinner item
        //Toast.makeText(parent.getContext(), "Selected: " + item, Toast.LENGTH_LONG).show();
    }
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub
    }

}
