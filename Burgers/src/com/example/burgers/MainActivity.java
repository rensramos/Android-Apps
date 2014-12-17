package com.example.burgers;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
	int v=0;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		final EditText name=(EditText)findViewById(R.id.editText1);
		
		 v=Page3.oo;
		if(v==1){
			name.setText("");
		}
		
		Button pizza=(Button)findViewById(R.id.button1);
		pizza.setOnClickListener(new OnClickListener(){

			public void onClick(View a) {
				String names=name.getText()+"";
				Intent pass1=new Intent(a.getContext(),Page1.class);
				pass1.putExtra("name1",names);
				startActivityForResult(pass1,0);
				
			}
		});
		
		Button tea=(Button)findViewById(R.id.button2);
		tea.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View b) {
				String names=name.getText()+"";
				Intent pass1=new Intent(b.getContext(),Page2.class);
				pass1.putExtra("name1",names);
				startActivityForResult(pass1,0);
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
