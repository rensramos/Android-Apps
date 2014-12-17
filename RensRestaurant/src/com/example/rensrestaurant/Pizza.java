package com.example.rensrestaurant;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class Pizza extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.pizzalayout);
		//getting name of the Customer
		
		Intent name=getIntent();
		final String namepizza= name.getStringExtra("name");
		final EditText etorder=(EditText)findViewById(R.id.editText1);
		final TextView tvtitle=(TextView)findViewById(R.id.textView1);
		etorder.setEnabled(false);
		//buttons
		Button btn1=(Button)findViewById(R.id.button1);
		Button btn2=(Button)findViewById(R.id.button2);
		Button btn3=(Button)findViewById(R.id.button3);
		Button btn4=(Button)findViewById(R.id.button4);
		Button btn5=(Button)findViewById(R.id.button5);
		Button btn6=(Button)findViewById(R.id.button6);
		Button btn7=(Button)findViewById(R.id.button7);
		Button btn8=(Button)findViewById(R.id.button8);
		Button btn9=(Button)findViewById(R.id.button9);
		Button btn0=(Button)findViewById(R.id.button10);
		Button btnca=(Button)findViewById(R.id.button11);
		Button btnnext=(Button)findViewById(R.id.button12);
		
		//radiobutton
		final RadioButton rbtn1=(RadioButton)findViewById(R.id.radio0);
		final RadioButton rbtn2=(RadioButton)findViewById(R.id.radio1);
		final RadioButton rbtn3=(RadioButton)findViewById(R.id.radio2);
		btn1.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
			etorder.setText(etorder.getText()+"1");	
				
			}
			
		});
		
		btn2.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				etorder.setText(etorder.getText()+"2");
				
			}
			
		});
		
		btn3.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				
				etorder.setText(etorder.getText()+"3");
			}
			
		});
		
		btn4.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				etorder.setText(etorder.getText()+"4");
				
			}
			
		});
		
		btn5.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				etorder.setText(etorder.getText()+"5");
				
			}
			
			
		});
		
		btn6.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				etorder.setText(etorder.getText()+"6");
				
			}
			
		});
		
		btn7.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				etorder.setText(etorder.getText()+"7");
				
			}
			
		});
		
		
		
		btn8.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				etorder.setText(etorder.getText()+"8");
				
			}
			
		});
		
		btn9.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				etorder.setText(etorder.getText()+"9");
				
			}
			
		});
						
		btn0.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				etorder.setText(etorder.getText()+"0");
				
			}
			
		});
								
		btnca.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
	
				etorder.setText("");
			}
			
		});
		
		btnnext.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				
				//getting customername from main
				if(etorder.getText().length()!=0){ 
				
				String getbill=etorder.getText().toString();
				int ordercon=Integer.parseInt(getbill);
				int bill=0,totalbill=0;
			
			//conditions
			if(rbtn1.isChecked()){
			bill=bill+350;
			}
			
			if(rbtn2.isChecked()){
				bill=bill+250;
			}

			if(rbtn3.isChecked()){
				bill=bill+220;
			}
			//passing intent
			totalbill=bill *ordercon;
			
			String orderpizza="Pizza";
			String total=totalbill+"";
			Intent pizzako=new Intent(v.getContext(),Final.class);
			pizzako.putExtra("total", total);
			pizzako.putExtra("name", namepizza);
			pizzako.putExtra("order", orderpizza);
			startActivityForResult(pizzako,0);
			
			
			}
				else{
					tvtitle.setText("Please enter # of Orders!");
				}
				
			}
		});
				
				
				
				
	}
}
