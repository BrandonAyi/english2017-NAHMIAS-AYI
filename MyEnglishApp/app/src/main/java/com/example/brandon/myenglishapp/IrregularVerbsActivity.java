package com.example.brandon.myenglishapp;

import android.os.Bundle;
import android.widget.Toast;

import java.io.IOException;

/**
 * Created by brandon on 15/02/17.
 */

public class IrregularVerbsActivity extends PhrasalVerbsActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.irregular_verbs);

        try {
            PlayWithRawFiles(R.raw.irregular_verbs,R.id.textViewSelectedFile1);
        } catch (IOException e) {
            Toast.makeText(getApplicationContext(),
                    "Problems: " + e.getMessage(), Toast.LENGTH_LONG).show();
        }
    }
}
