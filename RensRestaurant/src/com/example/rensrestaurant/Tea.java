package com.example.rensrestaurant;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class Tea extends Activity {
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tealayout);
		
		//getting Intentname
		Intent name=getIntent();
		final String nametea= name.getStringExtra("name");
		//checkbox
		final CheckBox ck1=(CheckBox)findViewById(R.id.checkBox1);
		final CheckBox ck2=(CheckBox)findViewById(R.id.checkBox2);
		final CheckBox ck3=(CheckBox)findViewById(R.id.checkBox3);
		//etc
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
	
		btn1.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				etorder.setText(etorder.getText()+"1");	
			}
			
		});
		
		btn2.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				etorder.setText(etorder.getText()+"2");	
			}
			
		});
		
		btn3.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				etorder.setText(etorder.getText()+"3");	
			}
			
		});
		
			btn4.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					etorder.setText(etorder.getText()+"4");	
				}
			
		});
		
			btn5.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					etorder.setText(etorder.getText()+"5");	
				}
			
		});
		
			btn6.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					etorder.setText(etorder.getText()+"6");	
				}
			
		});
		
			btn7.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					etorder.setText(etorder.getText()+"7");	
				}
			
		});
		
			btn8.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					etorder.setText(etorder.getText()+"8");	
				}
			
		});
		
			btn9.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					etorder.setText(etorder.getText()+"9");	
				}
			
		});
		
			btn0.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					etorder.setText(etorder.getText()+"0");	
				}
			
		});
		
			btnca.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					etorder.setText("");	
				}
			
		});
		
			btnnext.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					
					
					if(etorder.getText().length()!=0 ){ 
						if(ck1.isChecked()==true || ck2.isChecked()==true || ck3.isChecked()==true){
						String getbill=etorder.getText().toString();
						int ordercon=Integer.parseInt(getbill);
						int bill=0,totalbill=0;
						
						if(ck1.isChecked()){
							bill=bill+200;
						}
						if(ck2.isChecked()){
							bill=bill+170;
						}
						if(ck3.isChecked()){
							bill=bill+150;
						}	
						
						totalbill=bill *ordercon;
						
						String ordertea="Tea";
						String total=totalbill+"";
						Intent teako=new Intent(v.getContext(),Final.class);
						teako.putExtra("total", total);
						teako.putExtra("name", nametea);
						teako.putExtra("order", ordertea);
						startActivityForResult(teako,0);
						}
					}
					else{
						tvtitle.setText("Please complete the form!");
					}
				}
			
		});
		
		
	}

}
