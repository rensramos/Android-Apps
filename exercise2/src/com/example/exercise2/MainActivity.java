package com.example.exercise2;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
Button save, load;
EditText name, email;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		save =(Button) findViewById(R.id.save);
		load =(Button) findViewById(R.id.load);
		name =(EditText) findViewById(R.id.name);
		email =(EditText) findViewById(R.id.email);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
