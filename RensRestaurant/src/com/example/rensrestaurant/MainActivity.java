package com.example.rensrestaurant;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		final TextView error=(TextView)findViewById(R.id.textView3);
		final EditText etname=(EditText)findViewById(R.id.editText1);
		Button btnpizza =(Button)findViewById(R.id.button1);
		Button btntea =(Button)findViewById(R.id.button2);
		//btnpizza
		
		
		btnpizza.setOnClickListener(new OnClickListener(){
		
			@Override
			public void onClick(View x) {
				
				
				if(etname.getText().length()!=0){ 
			String name =etname.getText().toString();	
			Intent namepizza = new Intent(x.getContext(),Pizza.class);
			namepizza.putExtra("name", name);
			startActivityForResult(namepizza,0);
			
			}
			else{
				error.setText("Please enter your name!");
			}
			
			}
		});
		
		//btntea
		btntea.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View x) {
				// TODO Auto-generated method stub
				
				
				if(etname.getText().length()!=0){ 

				
				String name =etname.getText().toString();	
				Intent nametea = new Intent(x.getContext(),Tea.class);
				nametea.putExtra("name", name);
				startActivityForResult(nametea,0);
				
			}
			else{
				error.setText("Please enter your name!");
			}
			}
		});
			
		

	
	
		

	
	}

	
	
	
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
