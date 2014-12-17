package com.example.activity;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends Activity{
		int  x=0,ord1=0,ord2=0,total=0,order;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		final EditText ord=(EditText)findViewById(R.id.editText1);
		order=Integer.parseInt(ord.getText()+"");
		
		final CheckBox ch1=(CheckBox)findViewById(R.id.checkBox1);
		final CheckBox ch2=(CheckBox)findViewById(R.id.checkBox2);
		final CheckBox ch3=(CheckBox)findViewById(R.id.checkBox3);
		final CheckBox ch4=(CheckBox)findViewById(R.id.checkBox4);
		
		final RadioButton rb1=(RadioButton)findViewById(R.id.radio0);
	//	final RadioButton rb2=(RadioButton)findViewById(R.id.radio1);
		final RadioButton rx1=(RadioButton)findViewById(R.id.radioButton1);
		final RadioButton rx2=(RadioButton)findViewById(R.id.radioButton2);
		final RadioButton rx3=(RadioButton)findViewById(R.id.radioButton3);
		
		rb1.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0) {
				if(rb1.isChecked()){
					rx1.setText("BigMac (250php)");
					rx2.setText("Reg Burger (150php)");
					rx3.setText("JBurger (400php)");
					ch1.setText("Cheese (10php)");
					ch2.setText("Ham (15php)");
					ch3.setText("Bacon (15php)");
					ch4.setText("Special (20php)");
				}
				
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
