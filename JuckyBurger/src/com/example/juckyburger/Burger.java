package com.example.juckyburger;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class Burger extends Activity {
int x=0,ord1=0,add=0,order=0,t=0;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_burger);
		final Button comp=(Button)findViewById(R.id.button1);
		final Button reset=(Button)findViewById(R.id.button2);
		final RadioButton cv1= (RadioButton) findViewById(R.id.radio0);
		final RadioButton cv2= (RadioButton) findViewById(R.id.radio1);
		final RadioButton cx1= (RadioButton) findViewById(R.id.radioButton1);
		final RadioButton cx2= (RadioButton) findViewById(R.id.radioButton2);
		final RadioButton cx3= (RadioButton) findViewById(R.id.radioButton3);
		
		
		final CheckBox ch1=(CheckBox)findViewById(R.id.checkBox1);
		final CheckBox ch2=(CheckBox)findViewById(R.id.checkBox2);
		final CheckBox ch3=(CheckBox)findViewById(R.id.checkBox3);
		final CheckBox ch4=(CheckBox)findViewById(R.id.checkBox4);
		final TextView total=(TextView)findViewById(R.id.textView5);
		reset.setEnabled(false);
	
		cv1.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				cx1.setText("BigMac 200php");
				cx2.setText("CheeseBurger 150php");
				cx3.setText("JBurger 400php");
				
				ch1.setText("Cheese 10php");
				ch2.setText("Bacon 15php");
				ch3.setText("Ham 15php");
				ch4.setText("Egg 10php");
				x=1;
			}	
		});
		cv2.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				cx1.setText("Milk Tea 80php");
				cx2.setText("Yogart Tea 90php");
				cx3.setText("Jucky Tea 120php");
				
				ch1.setText("Sagu 10php");
				ch2.setText("Sugar 15php");
				ch3.setText("Pearl 25php");
				ch4.setText("Jelly 15php");
				x=2;
			}	
		});
		comp.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				 EditText ord=(EditText)findViewById(R.id.editText1);
				order=Integer.parseInt(ord.getText()+"");
				if(x==1){
					if(cx1.isChecked()){//for Bigmac
						ord1=ord1+200;
					}
					else if(cx2.isChecked()){//for Cheeseburger
						ord1=ord1+150;
					}
					else if(cx3.isChecked()){//for JBurger
						ord1=ord1+400;
					}
					
					if(ch1.isChecked()){//for adds on in Burger 1st
						add=add+10;	
					}
					if(ch2.isChecked()){//for adds on 2nd
						add=add+15;
					}
					if(ch3.isChecked()){//for adds on 3rd
						add=add+15;
					}
					if(ch4.isChecked()){//for adds on 4th
						add=add+10;
					}
				}
				if(x==2){//when the costumer choose the tea category
					if(cx1.isChecked()){//for Milk tea
						ord1=ord1+80;
					}
					else if(cx2.isChecked()){//for yogart tea
						ord1=ord1+90;
					}
					else if(cx3.isChecked()){//for Jucky tea
						ord1=ord1+120;
					}
					
					if(ch1.isChecked()){//for adds on in  tea 1st
						add=add+10;	
					}
					if(ch2.isChecked()){//for adds on 2nd
						add=add+15;
					}
					if(ch3.isChecked()){//for adds on 3rd
						add=add+25;
					}
					if(ch4.isChecked()){//for adds on 4th
						add=add+15;
					}
				}
				
				t=(add+ord1)*order;
				total.setText(t+" "+"php");
				ord1=0;
				t=0;
				add=0;
			}		
		});
		reset.setOnClickListener(new OnClickListener(){//for reset
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				cx1.setChecked(false);
				cx2.setChecked(false);
				cx3.setChecked(false);
				
				ch1.setChecked(false);
				ch2.setChecked(false);
				ch3.setChecked(false);
				ch4.setChecked(false);
				
				EditText ord=(EditText)findViewById(R.id.editText1);
				ord.setText("");
				
				x=0;
				ord1=0;
				t=0;
				add=0;
				total.setText("-----");
			}	
		});
												//LezardV@leth......

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_burger, menu);
		return true;
	}

}
