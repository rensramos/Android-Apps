package com.example.millionaire;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MillionaireIto extends Activity {
	public static int x=0;
	int v=0;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_millionaire_ito);
		final EditText et=(EditText)findViewById(R.id.editText1);
		v=TheEnder.oo;
		if(v==1){
			et.setText("");
			x=0;
		}
		Button bt=(Button)findViewById(R.id.button1);
		
		
		bt.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View a) {
				// TODO Auto-generated method stub
				String b=et.getText()+"";
				Intent ku=new Intent(a.getContext(), Page1.class);
				ku.putExtra("ValuePass", b);
				startActivityForResult(ku,0);
			}			
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_millionaire_ito, menu);
		return true;
	}

}
