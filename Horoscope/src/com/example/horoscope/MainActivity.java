package com.example.horoscope;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button sub=(Button)findViewById(R.id.button1);
		sub.setOnClickListener(new OnClickListener(){
			public void onClick(View a) {
				EditText dated=(EditText)findViewById(R.id.editText1);
				String dates=dated.getText()+"";
				Intent byear=new Intent(a.getContext(),YearHoroscope.class);
				byear.putExtra("birth",dates);
				startActivityForResult(byear,0);
			}
			
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
