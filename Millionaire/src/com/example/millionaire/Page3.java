package com.example.millionaire;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class Page3 extends Activity{
	public static int u=0;
	int d=0;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.quest3);
		final RadioButton ch1=(RadioButton)findViewById(R.id.radio0);
		final RadioButton ch2=(RadioButton)findViewById(R.id.radio1);
		final RadioButton ch3=(RadioButton)findViewById(R.id.radio2);
		final RadioButton ch4=(RadioButton)findViewById(R.id.radioButton1);

		final TextView tv=(TextView)findViewById(R.id.textView3);
		Button bt2=(Button)findViewById(R.id.button1);
		bt2.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View c) {
				// TODO Auto-generated method stub
				if(ch1.isChecked()){
					d=Page2.s;
					u=d+0;
					String x=tv.getText()+"";
					Intent e1=new Intent(c.getContext(), Page4.class);
					e1.putExtra("ValuePass4", x);
					startActivityForResult(e1,0); }
				
				else if(ch2.isChecked()){
					d=Page2.s;
					u=d+0;
					String x=tv.getText()+"";
					Intent e1=new Intent(c.getContext(), Page4.class);
					e1.putExtra("ValuePass4", x);
					startActivityForResult(e1,0);}
				
				else if(ch3.isChecked()){
					d=Page2.s;
					u=d+0;
					String x=tv.getText()+"";
					Intent e1=new Intent(c.getContext(), Page4.class);
					e1.putExtra("ValuePass4", x);
					startActivityForResult(e1,0);}
				
				else if(ch4.isChecked()){
					d=Page2.s;
					u=d+5;
					String x=tv.getText()+"";
					Intent e1=new Intent(c.getContext(), Page4.class);
					e1.putExtra("ValuePass4", x);
					startActivityForResult(e1,0);}
			}
			
		});
	
		Intent max2=getIntent();
		String names2=max2.getStringExtra("ValuePass3");
		TextView tv2=(TextView)findViewById(R.id.textView3);
		tv2.setText(names2);
	}
	
}
