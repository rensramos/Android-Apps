package com.example.millionaire;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class Page1 extends Activity{
String sc;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.quest1);
		final RadioButton ch1=(RadioButton)findViewById(R.id.radio0);
		final RadioButton ch2=(RadioButton)findViewById(R.id.radio1);
		final RadioButton ch3=(RadioButton)findViewById(R.id.radio2);
		final RadioButton ch4=(RadioButton)findViewById(R.id.radioButton1);
		//final EditText et1=(EditText)findViewById(R.id.editText1);
		final TextView tv=(TextView)findViewById(R.id.textView3);
		
		Button bt1=(Button)findViewById(R.id.button1);
		bt1.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View b) {
				// TODO Auto-generated method stub
				if(ch1.isChecked()){
					MillionaireIto.x=0+5;
					String x=tv.getText()+"";
					Intent e=new Intent(b.getContext(), Page2.class);
					e.putExtra("ValuePass1", x);
					
					Intent score=new Intent(b.getContext(),Page2.class);
					score.putExtra("xs1", sc);
					startActivityForResult(score,0);
					startActivityForResult(e,0); }
				
				else if(ch2.isChecked()){
					MillionaireIto.x=0+0;
					String x=tv.getText()+"";
					Intent e=new Intent(b.getContext(), Page2.class);
					e.putExtra("ValuePass1", x);
					startActivityForResult(e,0);}
				
				else if(ch3.isChecked()){
					MillionaireIto.x=0+0;
					String x=tv.getText()+"";
					Intent e=new Intent(b.getContext(), Page2.class);
					e.putExtra("ValuePass1", x);
					startActivityForResult(e,0);}
				
				else if(ch4.isChecked()){
					MillionaireIto.x=0+0;
					String x=tv.getText()+"";
					Intent e=new Intent(b.getContext(), Page2.class);
					e.putExtra("ValuePass1", x);
					startActivityForResult(e,0);}
				
			
			}
			
		});
		
		Intent max1=getIntent();
		String names1=max1.getStringExtra("ValuePass");
		TextView tv2=(TextView)findViewById(R.id.textView3);
		tv2.setText("Welcome"+" "+names1+",");
		
	
	}
}
