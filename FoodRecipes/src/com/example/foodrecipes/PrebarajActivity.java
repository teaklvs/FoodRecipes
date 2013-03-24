package com.example.foodrecipes;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.AdapterView.OnItemSelectedListener;

public class PrebarajActivity extends Activity {
	
	
	Spinner spinner;
	TextView txtSelected;
	
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_prebaraj);
		
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
			txtSelected.setText(str);

		}

		@Override
		public void onNothingSelected(AdapterView<?> arg0) {
			// TODO Auto-generated method stub

		}

	}


}
