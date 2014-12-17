package com.example.tapthepath;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Front extends Activity  {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.front);
		final Button btnplay=(Button)findViewById(R.id.button1);
		final Button btnhelp=(Button)findViewById(R.id.button2);
		final TextView tverror=(TextView)findViewById(R.id.textView5);
		btnplay.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
					Intent frontpage = new Intent(v.getContext(),MainActivity.class);
					startActivityForResult(frontpage,0);
					finish();}
		});
		
		btnhelp.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				Intent play=new Intent(v.getContext(),Help.class);
				startActivityForResult(play,0);
				finish();}	
		});}}
