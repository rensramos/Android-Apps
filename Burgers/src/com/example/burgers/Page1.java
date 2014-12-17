package com.example.burgers;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class Page1  extends Activity{
	String price,order;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.pizza);
		
		Intent pass2=getIntent();
		String name=pass2.getStringExtra("name1");
		
		final TextView txtname=(TextView)findViewById(R.id.textView3);
		txtname.setText(name);
		
		final RadioButton ch1=(RadioButton)findViewById(R.id.radio0);
		final RadioButton ch2=(RadioButton)findViewById(R.id.radio2);
		final EditText ord=(EditText)findViewById(R.id.editText1);
		

		
		Button bt1=(Button)findViewById(R.id.button1);
		bt1.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0) {
				ord.setText(ord.getText()+"1");	
			}
		});
		
		Button bt2=(Button)findViewById(R.id.button3);
		bt2.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0) {
				ord.setText(ord.getText()+"2");	
							}
		});
		
		Button bt3=(Button)findViewById(R.id.button4);
		bt3.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0) {
				ord.setText(ord.getText()+"3");	
							}
		});
		
		Button bt4=(Button)findViewById(R.id.button2);
		bt4.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0) {
				ord.setText(ord.getText()+"4");	
							}
		});
		
		Button bt5=(Button)findViewById(R.id.button5);
		bt5.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0) {
				ord.setText(ord.getText()+"5");	
							}
		});
		
		Button bt6=(Button)findViewById(R.id.button6);
		bt6.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0) {
				ord.setText(ord.getText()+"6");	
							}
		});
		
		Button bt7=(Button)findViewById(R.id.button7);
		bt7.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0) {
				ord.setText(ord.getText()+"7");	
							}
		});
		
		Button bt8=(Button)findViewById(R.id.button8);
		bt8.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0) {
				ord.setText(ord.getText()+"8");	
							}
		});
		
		Button bt9=(Button)findViewById(R.id.button9);
		bt9.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0) {
				ord.setText(ord.getText()+"9");	
							}
		});
		
		Button bt10=(Button)findViewById(R.id.button11);
		bt10.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0) {
				ord.setText(ord.getText()+"0");	
							}
		});
		
		Button ac=(Button)findViewById(R.id.button10);
		ac.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0) {
				ord.setText("");
				
			}
			
		});
		

		
		
		Button submit=(Button)findViewById(R.id.button13);
		submit.setOnClickListener(new OnClickListener(){
			public void onClick(View b) {
				if(ch1.isChecked()){
					price="60";
				}
				else if(ch2.isChecked()){
					price="80";
				}

			String choice="burger";
			String names=txtname.getText()+"";
			order=ord.getText()+"";
			Intent pass2=new Intent(b.getContext(),Page3.class);
			pass2.putExtra("name2", names);
			pass2.putExtra("choices", choice);
			pass2.putExtra("price1", price);
			pass2.putExtra("order1",order);
			startActivityForResult(pass2,0);
			}
		});
		
		
	}
}
