package com.example.foodrecipes;

import android.os.Bundle;
import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class MainActivity extends ListActivity {
	public final static String EXTRA_MESSAGE1 = "com.example.foodrecipes.MESSAGE1";
	public final static String EXTRA_MESSAGE2 = "com.example.foodrecipes.MESSAGE2";
	public final static String EXTRA_MESSAGE3 = "com.example.foodrecipes.MESSAGE3";

	String className[] = { "EasyChocolateCake", "ChocolateCupcakesAndPeanutButterIcing", "Pancakes"};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, className));
				
	}

	@Override
	protected void onListItemClick(ListView lv,View v, int position, long id)
	{
		super.onListItemClick(lv,v,position,id);
		String openClass = className[position];
		try
		{
			Class selected = Class.forName("com.example.foodrecipes."+ openClass);
			Intent selectedIntent = new Intent(this,selected);
			startActivity(selectedIntent);
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
	}
	
	@Override
	protected void onPause()
	{
		super.onPause();
		finish();
	}
	
	public void sendMessage(View view) {
	    Intent intent = new Intent(this, PrebarajActivity.class);
	    startActivity(intent);
	}
}

