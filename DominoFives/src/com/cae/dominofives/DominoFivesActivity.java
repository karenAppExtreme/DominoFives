package com.cae.dominofives;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class DominoFivesActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_domino_fives);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.domino_fives, menu);
        return true;
    }
    
}
