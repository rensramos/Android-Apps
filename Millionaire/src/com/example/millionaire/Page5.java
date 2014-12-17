package com.example.millionaire;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class Page5 extends Activity{
public static int t=0;
int g=0;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.quest5);
		final RadioButton ch1=(RadioButton)findViewById(R.id.radio0);
		final RadioButton ch2=(RadioButton)findViewById(R.id.radio1);
		final RadioButton ch3=(RadioButton)findViewById(R.id.radio2);
		final RadioButton ch4=(RadioButton)findViewById(R.id.radioButton1);

		final TextView tv=(TextView)findViewById(R.id.textView3);
		Button bt2=(Button)findViewById(R.id.button1);
		bt2.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View d) {
				// TODO Auto-generated method stub
				if(ch1.isChecked()){
					g=Page4.z;
					t=g+5;
					String x=tv.getText()+"";
					Intent e1=new Intent(d.getContext(), TheEnder.class);
					e1.putExtra("ValuePass6", x);
					startActivityForResult(e1,0); }
				
				else if(ch2.isChecked()){
					g=Page4.z;
					t=g+0;
					String x=tv.getText()+"";
					Intent e1=new Intent(d.getContext(), TheEnder.class);
					e1.putExtra("ValuePass6", x);
					startActivityForResult(e1,0);}
				
				else if(ch3.isChecked()){
					g=Page4.z;
					t=g+0;
					String x=tv.getText()+"";
					Intent e1=new Intent(d.getContext(), TheEnder.class);
					e1.putExtra("ValuePass6", x);
					startActivityForResult(e1,0);}
				
				else if(ch4.isChecked()){
					g=Page4.z;
					t=g+0;
					String x=tv.getText()+"";
					Intent e1=new Intent(d.getContext(), TheEnder.class);
					e1.putExtra("ValuePass6", x);
					startActivityForResult(e1,0);}
			}
			
		});
	
		Intent max3=getIntent();
		String names3=max3.getStringExtra("ValuePass5");
		TextView tv2=(TextView)findViewById(R.id.textView3);
		tv2.setText(names3);
	}
}
