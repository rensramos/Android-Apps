package com.example.tapthepath;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Outmoves extends Activity  {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.outmoves);
		
		Button main=(Button)findViewById(R.id.button1);
		Button exit=(Button)findViewById(R.id.button2);
		main.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				Intent play=new Intent(v.getContext(),MainActivity.class);
				startActivityForResult(play,0);
				finish();
				}	
		});
		
		
		exit.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Intent.ACTION_MAIN);
				intent.addCategory(Intent.CATEGORY_HOME);
				startActivity(intent);
				finish();
			}
		});	
	}}