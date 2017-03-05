package com.example.brandon.myenglishapp;

import android.os.Bundle;
import android.widget.Toast;

import java.io.IOException;

/**
 * Created by brandon on 15/02/17.
 */

public class IrregularVerbsActivity extends PhrasalVerbsActivity {

    @Override
    public void onBackPressed()
    {
        IrregularVerbsActivity.this.finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.irregular_verbs);

        try {
            PlayWithRawFiles(R.raw.irregular1,R.id.textViewSelectedFile1);
            PlayWithRawFiles(R.raw.irregular2,R.id.textViewSelectedFile2);
            PlayWithRawFiles(R.raw.irregular3,R.id.textViewSelectedFile3);
            PlayWithRawFiles(R.raw.irregular4,R.id.textViewSelectedFile4);
        } catch (IOException e) {
            Toast.makeText(getApplicationContext(),
                    "Problems: " + e.getMessage(), Toast.LENGTH_LONG).show();
        }
    }
}
