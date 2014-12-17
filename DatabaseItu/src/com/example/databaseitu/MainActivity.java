package com.example.databaseitu;

import android.os.Bundle;
import android.app.Activity;
import android.database.Cursor;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
	EditText etname;
	EditText etemail;
	Button btsave;
	Button btload;
	Datahandler handler;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		etname = (EditText) findViewById(R.id.name);
		etemail = (EditText) findViewById(R.id.email);
		btsave = (Button) findViewById(R.id.save);
		btload = (Button) findViewById(R.id.load);
		
		btsave.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String name = etname.getText()+"";
				String email = etemail.getText()+"";
				handler = new Datahandler(getBaseContext());
				handler.open();
				handler.insertData(name);
				Toast t = Toast.makeText(getBaseContext(), "Data Inserted", Toast.LENGTH_LONG);
				t.show();
				handler.close();
				
				
			}
	
		});
		
		
		
		
		
		btload.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String name="";
				String email="";
				handler = new Datahandler(getBaseContext());
				handler.open();
				Cursor c =handler.returnData();
				if(c.moveToFirst()){
				do{
					 name = name+"\n"+c.getString(0)+"";
					email =email+"\n"+c.getString(1)+"";
					
					
				}while(c.moveToNext());
				
				
				}
				
				handler.close();
				Toast t =Toast.makeText(getBaseContext(), "Name: "+ name +" Email: "+email, Toast.LENGTH_LONG);
				t.show();
				
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
