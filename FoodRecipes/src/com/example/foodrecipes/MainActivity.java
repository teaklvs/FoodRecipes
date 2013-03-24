package com.example.foodrecipes;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
//import android.view.Menu;
import android.view.View;
//import android.widget.AdapterView;
//import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemSelectedListener;

public class MainActivity extends Activity {
	
	public final static String EXTRA_MESSAGE1 = "com.example.foodrecipes.MESSAGE1";
	public final static String EXTRA_MESSAGE2 = "com.example.foodrecipes.MESSAGE2";
	public final static String EXTRA_MESSAGE3 = "com.example.foodrecipes.MESSAGE3";
	public final static String EXTRA_MESSAGE4 = "com.example.foodrecipes.MESSAGE4";
	
	ListView listView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {	
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		ListView listView = (ListView) findViewById(R.id.mylist);
		String[] values = new String[] { "Easy chocolate cake", "Chocolate Cupcakes and Peanut Butter Icing", "Pancakes"};
		
		// Define a new Adapter
		// First parameter - Context
		// Second parameter - Layout for the row
		// Third parameter - ID of the TextView to which the data is written
		// Forth - the Array of data
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, android.R.id.text1, values);
		listView.setAdapter(adapter);
		
		listView.setOnItemSelectedListener(new selectedFunction());
	}
	
	public class selectedFunction implements OnItemSelectedListener {

		@Override
		public void onItemSelected(AdapterView<?> av, View v, int position,long id) 
		{
			
			String selectedNumber = "";
			if(position==0)
			{
				selectedNumber="0";
			}
			else if(position==1)
			{
				selectedNumber="1";
			}
			else if(position==2)
			{
				selectedNumber="2";
			}
			//ne mozev nikako da ja koregiram greskava !!!
			//Intent intent = new Intent(this, HowToCook.class);
			//intent.putExtra(EXTRA_MESSAGE4, selectedNumber);
			
			//startActivity(intent);
			
		}

		@Override
		public void onNothingSelected(AdapterView<?> arg0)
		{
			// TODO Auto-generated method stub

		}

	}

	
	public void sendMessage(View view) {
	    Intent intent = new Intent(this, PrebarajActivity.class);
	    startActivity(intent);
	}


	
}