package com.example.millionaire;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class Page4 extends Activity{
	public static int z=0;
	int i=0;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.quest4);
		final RadioButton ch1=(RadioButton)findViewById(R.id.radio0);
		final RadioButton ch2=(RadioButton)findViewById(R.id.radio1);
		final RadioButton ch3=(RadioButton)findViewById(R.id.radio2);
		final RadioButton ch4=(RadioButton)findViewById(R.id.radioButton1);

		final TextView tv=(TextView)findViewById(R.id.textView3);
		Button bt2=(Button)findViewById(R.id.button1);
		bt2.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View r) {
				// TODO Auto-generated method stub
				if(ch1.isChecked()){
					i=Page3.u;
					z=i+0;
					String x=tv.getText()+"";
					Intent e1=new Intent(r.getContext(), Page5.class);
					e1.putExtra("ValuePass5", x);
					startActivityForResult(e1,0); }
				
				else if(ch2.isChecked()){
					i=Page3.u;
					z=i+5;
					String x=tv.getText()+"";
					Intent e1=new Intent(r.getContext(), Page5.class);
					e1.putExtra("ValuePass5", x);
					startActivityForResult(e1,0);}
				
				else if(ch3.isChecked()){
					i=Page3.u;
					z=i+0;
					String x=tv.getText()+"";
					Intent e1=new Intent(r.getContext(), Page5.class);
					e1.putExtra("ValuePass5", x);
					startActivityForResult(e1,0);}
				
				else if(ch4.isChecked()){
					i=Page3.u;
					z=i+0;
					String x=tv.getText()+"";
					Intent e1=new Intent(r.getContext(), Page5.class);
					e1.putExtra("ValuePass5", x);
					startActivityForResult(e1,0);}
			}
			
		});
	
		Intent max3=getIntent();
		String names3=max3.getStringExtra("ValuePass4");
		TextView tv2=(TextView)findViewById(R.id.textView3);
		tv2.setText(names3);
	
	}
}
