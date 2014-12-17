package com.example.burgers;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class Page2 extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tea);
		Intent pass2=getIntent();
		String name=pass2.getStringExtra("name1");
		
		final TextView txtname=(TextView)findViewById(R.id.textView3);
		txtname.setText(name);
		
		final CheckBox ch1=(CheckBox)findViewById(R.id.checkBox1);
		final CheckBox ch2=(CheckBox)findViewById(R.id.checkBox2);
		final CheckBox ch3=(CheckBox)findViewById(R.id.checkBox3);
		
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
			
	
			public void onClick(View c) {
				int price=0;
			if(ch1.isChecked()){
				price=price+60;
			}
			if(ch2.isChecked()){
				price=price+55;
			}
			if(ch3.isChecked()){
				price=price+75;
			}
			
			String choice="tea";
			String names=txtname.getText()+"";
			String order=ord.getText()+"";
			String pr=price+"";
			Intent pass2=new Intent(c.getContext(),Page3.class);
			pass2.putExtra("name2", names);
			pass2.putExtra("choices", choice);
			pass2.putExtra("price1", pr);
			pass2.putExtra("order1",order);
			startActivityForResult(pass2,0);
			}
			
		});
	}
}
