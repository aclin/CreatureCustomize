package com.alin.testcreature;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TestCreature extends Activity implements View.OnClickListener {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        // Set an OnClickListener for the menu button on the main display
        Button button = (Button) findViewById(R.id.config_button);
        button.setOnClickListener(this);
        
    }

	@Override
	public void onClick(View v) {
		Intent intent;
		intent = new Intent().setClass(this, CostumeMenu.class);
		startActivity(intent);
	}
    
}