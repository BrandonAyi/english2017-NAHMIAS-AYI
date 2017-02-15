package com.example.brandon.myenglishapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by brandon on 14/02/17.
 */

public class PhrasalVerbsActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.phrasal_verbs);

        try {
            PlayWithRawFiles();
        } catch (IOException e) {
            Toast.makeText(getApplicationContext(),
                    "Problems: " + e.getMessage(), Toast.LENGTH_LONG).show();
        }

    }

    public void PlayWithRawFiles() throws IOException {
        String str="";
        StringBuffer buf = new StringBuffer();

        // Read the file :open a InputStream on it
        InputStream inputStream = getResources().openRawResource(R.raw.phrasal_verbs);

        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        if (inputStream!=null) {
            while ((str = reader.readLine()) != null) {
                buf.append(str + "\n" );
            }
        }
        inputStream.close();

        // First implement the textView
        TextView textViewFile = (TextView) findViewById(R.id.textViewSelectedFile);
        textViewFile.setText(buf.toString());
    }

}
