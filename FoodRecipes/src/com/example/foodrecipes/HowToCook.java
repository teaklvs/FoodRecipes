package com.example.foodrecipes;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HowToCook extends Activity {

	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// Get the message from the intent
	    Intent intent = getIntent();
	    String msg1 = intent.getStringExtra(MainActivity.EXTRA_MESSAGE1);
	    String msg2 = intent.getStringExtra(MainActivity.EXTRA_MESSAGE2);
	    String msg3 = intent.getStringExtra(MainActivity.EXTRA_MESSAGE3);



	   TextView txt1=(TextView)findViewById(R.id.textView1);
	   txt1.setText(msg1);
	   TextView txt2=(TextView)findViewById(R.id.textView2);
	   txt1.setText(msg2);
	   TextView txt3=(TextView)findViewById(R.id.textView3);
	   txt1.setText(msg3);
	   

		setContentView(R.layout.activity_how_to_cook);
		// Show the Up button in the action bar.
		setupActionBar();
		

 
	}

    public void prebaraj(View view) {
    	 Intent i = new Intent(this, newActivity.class);
    	 HowToCook.this.startActivity(i);

    }
    
	/**
	 * Set up the {@link android.app.ActionBar}, if the API is available.
	 */
	@TargetApi(Build.VERSION_CODES.HONEYCOMB)
	private void setupActionBar() {
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
			getActionBar().setDisplayHomeAsUpEnabled(true);
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.how_to_cook, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
			// This ID represents the Home or Up button. In the case of this
			// activity, the Up button is shown. Use NavUtils to allow users
			// to navigate up one level in the application structure. For
			// more details, see the Navigation pattern on Android Design:
			//
			// http://developer.android.com/design/patterns/navigation.html#up-vs-back
			//
			NavUtils.navigateUpFromSameTask(this);
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	

}
