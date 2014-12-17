package com.example.horoscope;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class YearHoroscope extends Activity {
	String byear1;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ehoroscope);
		
		Intent byear=getIntent();
		byear1=byear.getStringExtra("birth");
		
		Button cat1=(Button)findViewById(R.id.button1);
		cat1.setOnClickListener(new OnClickListener(){
			public void onClick(View v) {
				Intent byear2=new Intent();
				byear2=new Intent(v.getContext(),FinalHosroscope.class);
				byear2.putExtra("birth2", byear1);
				byear2.putExtra("cate","cate1");
				startActivityForResult(byear2,0);
			}
		});
		
		Button cat2=(Button)findViewById(R.id.button2);
		cat2.setOnClickListener(new OnClickListener(){
			public void onClick(View v) {
				Intent byear2=new Intent();
				byear2=new Intent(v.getContext(),FinalHosroscope.class);
				byear2.putExtra("birth2", byear1);
				byear2.putExtra("cate","cate2");
				startActivityForResult(byear2,0);
			}
		});
		
		Button cat3=(Button)findViewById(R.id.button3);
		cat3.setOnClickListener(new OnClickListener(){
			public void onClick(View v) {
				Intent byear2=new Intent();
				byear2=new Intent(v.getContext(),FinalHosroscope.class);
				byear2.putExtra("birth2", byear1);
				byear2.putExtra("cate","cate3");
				startActivityForResult(byear2,0);
			}
			
		});
	}
}
