package com.example.foodrecipes;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {
	public final static String EXTRA_MESSAGE1 = "com.example.foodrecipes.MESSAGE1";
	public final static String EXTRA_MESSAGE2 = "com.example.foodrecipes.MESSAGE2";
	public final static String EXTRA_MESSAGE3 = "com.example.foodrecipes.MESSAGE3";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void sendMessage(View view) {
	    Intent intent = new Intent(this, PrebarajActivity.class);
	    startActivity(intent);
	}

}
