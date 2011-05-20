package com.alin.testcreature;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class TestCreature extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        /*
        Intent intent;
        
        intent = new Intent().setClass(this, CostumeMenu.class);
        startActivity(intent);
        */
    }
    
}