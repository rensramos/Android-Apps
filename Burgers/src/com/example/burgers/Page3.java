package com.example.burgers;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Page3 extends Activity{
	public static int oo=0;
	int total=0;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.bill);
		
		Intent pass3=getIntent();
		 String name=pass3.getStringExtra("name2");
		 String orders=pass3.getStringExtra("order1");
		 String choiced=pass3.getStringExtra("choices");
		
		 String p1=pass3.getStringExtra("price1");
		 
		 int x=Integer.parseInt(p1);
		 int order=Integer.parseInt(orders);
	
		 	total=x*order;
		
		TextView trylang=(TextView)findViewById(R.id.textView6);
		TextView trylang2=(TextView)findViewById(R.id.textView7);
		TextView trylang3=(TextView)findViewById(R.id.textView8);
		TextView trylang4=(TextView)findViewById(R.id.textView9);
		
		trylang.setText(" "+name);
		trylang2.setText(" "+choiced);
		trylang3.setText(" "+order);
		trylang4.setText(" "+total);
		
		Button return1=(Button)findViewById(R.id.button1);
		return1.setOnClickListener(new OnClickListener(){
			public void onClick(View g) {
				oo=0;
				Intent cv=new Intent(g.getContext(),MainActivity.class);
				startActivityForResult(cv,0);
			}
			
			
		});

	}
}
