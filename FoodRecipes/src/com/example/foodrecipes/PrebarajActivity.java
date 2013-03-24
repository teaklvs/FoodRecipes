package com.example.foodrecipes;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class PrebarajActivity extends Activity {
	
	
	Spinner spinner;
	TextView txtSelected;
	
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_prebaraj);
		
		Button backButton = (Button) findViewById(R.id.btnBack);
		backButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent myInt= new Intent(v.getContext(),MainActivity.class);
				v.getContext().startActivity(myInt);
				
			}
		});
		
		
		spinner =(Spinner)findViewById(R.id.selSpinner);
		txtSelected=(TextView)findViewById(R.id.txtSpinner);
		
		ArrayAdapter<CharSequence>adapter=ArrayAdapter.createFromResource(this, R.array.spinnerarray, android.R.layout.simple_spinner_item);
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spinner.setAdapter(adapter);
		spinner.setOnItemSelectedListener(new selectedFunction());
	}
	
	public class selectedFunction implements OnItemSelectedListener {

		@Override
		public void onItemSelected(AdapterView<?> parent, View arg1, int pos, long id) {
			
			String str = parent.getItemAtPosition(pos).toString();
			
			if(str.equalsIgnoreCase("select"))
			{
				txtSelected.setText(R.string.select);				
			}
			else if(str.equalsIgnoreCase("chocolate"))
			{
				txtSelected.setText(R.string.chocolate);
			}
			else if(str.equalsIgnoreCase("chocolatecream"))
			{
				txtSelected.setText(R.string.chocolatecream);
			}
			else if(str.equalsIgnoreCase("peanuts"))
			{
				txtSelected.setText(R.string.peanuts);
			}
			else if(str.equalsIgnoreCase("coffee"))
			{
				txtSelected.setText(R.string.coffee);
			}
			//za makedonski
			/* <item >избери</item>
		        <item >чоколада</item>
		        <item >чоколаден крем</item>
		        <item >кикирики</item>
		        <item >кафе</item>*/
			else if(str.equalsIgnoreCase("избери"))
			{
				txtSelected.setText(R.string.select);				
			}
			else if(str.equalsIgnoreCase("чоколада"))
			{
				txtSelected.setText(R.string.chocolate);
			}
			else if(str.equalsIgnoreCase("чоколаден крем"))
			{
				txtSelected.setText(R.string.chocolatecream);
			}
			else if(str.equalsIgnoreCase("кикирики"))
			{
				txtSelected.setText(R.string.peanuts);
			}
			else if(str.equalsIgnoreCase("кафе"))
			{
				txtSelected.setText(R.string.coffee);
			}
			else
			{
				txtSelected.setText("");
			}
		}
		
		@Override
		public void onNothingSelected(AdapterView<?> arg0) {
			// TODO Auto-generated method stub

		}

	}
	
	public void sendMessage(View view) {
	    Intent intent = new Intent(this, PrebarajActivity.class);
	    startActivity(intent);
	}


}
