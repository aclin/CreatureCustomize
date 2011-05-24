package com.alin.testcreature;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class TestCreature extends Activity implements View.OnClickListener {
	private static final String TAG = "Monster";
	
	private static Button menu_button;
	private static Button armour_button;
	private static Button helmet_button;
	private static Button weapon_button;
	private static Button footgear_button;
	
	public AnimationDrawable waveAnimation;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        // Set an OnClickListener for the menu button on the main display
        menu_button = (Button) findViewById(R.id.config_button);
        menu_button.setOnClickListener(this);
        
        ImageView monsterImage = (ImageView) findViewById(R.id.creature);
        monsterImage.setBackgroundResource(R.drawable.monster_wave);
        waveAnimation = (AnimationDrawable) monsterImage.getBackground();
        
        Log.i(TAG, "Activity created");
    }
    
    @Override
    public void onStart() {
    	super.onStart();
    	Log.i(TAG, "Activity started");
    }
    
    @Override
    public void onResume() {
    	super.onResume();
    	
    	Button armour_button = (Button) findViewById(R.id.config_button_armour);
    	Button helmet_button = (Button) findViewById(R.id.config_button_helmet);
    	Button weapon_button = (Button) findViewById(R.id.config_button_weapon);
    	Button footgear_button = (Button) findViewById(R.id.config_button_footgear);
    	
    	armour_button.setOnClickListener(this);
    	helmet_button.setOnClickListener(this);
    	weapon_button.setOnClickListener(this);
    	footgear_button.setOnClickListener(this);
    	
    	Log.i(TAG, "Idle animation starting...");
    }
    
    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
    	waveAnimation.start();
    }
    
	@Override
	public void onClick(View view) {
		switch (view.getId()) {
		case R.id.config_button:
			Intent i_config = new Intent().setClass(this, ConfigMenu.class);
			startActivity(i_config);
			/*
			RelativeLayout rl = (RelativeLayout) findViewById(R.id.menu);
			if (rl.getVisibility() == View.VISIBLE) {
				rl.setVisibility(View.INVISIBLE);
			} else {
				rl.setVisibility(View.VISIBLE);
			}
			*/
			break;
		case R.id.config_button_armour:
			Intent i_armour = new Intent().setClass(this, CostumeMenu.class);
			startActivity(i_armour);
			break;
		case R.id.config_button_helmet:
		case R.id.config_button_weapon:
		case R.id.config_button_footgear:
		default:
		}
	}
    
	@Override
	public void onPause() {
		super.onPause();
		Log.i(TAG, "Activity paused");
	}
	
	@Override
	public void onStop() {
		super.onStop();
		Log.i(TAG, "Activity stopped");
	}
	
	@Override
	public void onDestroy() {
		super.onDestroy();
		Log.i(TAG, "Activity destroyed");
	}
}