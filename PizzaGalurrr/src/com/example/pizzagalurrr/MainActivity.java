package com.example.pizzagalurrr;


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

public class MainActivity extends Activity  {

	int ord=0;
	int order=0;
	int on=0;
	int total=0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		 final Button Compute=(Button)findViewById(R.id.button1);
		 final RadioButton rb1=(RadioButton)findViewById(R.id.radio0);
		 final RadioButton rb2=(RadioButton)findViewById(R.id.radio1);
		 final RadioButton rb3=(RadioButton)findViewById(R.id.radio2);
		 
		 final CheckBox cb1=(CheckBox)findViewById(R.id.checkBox1);
		 final CheckBox cb2=(CheckBox)findViewById(R.id.checkBox2);
		 final CheckBox cb3=(CheckBox)findViewById(R.id.checkBox3);
		 
		 final TextView tv=(TextView)findViewById(R.id.textView4);

		Compute.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				 EditText ev=(EditText)findViewById(R.id.editText1);
					ord=Integer.parseInt(ev.getText()+"");
				if (rb1.isChecked()){			
					order=order+450;
					}
				else if(rb2.isChecked()){	
					order=order+350;
				}
				else if(rb3.isChecked()){	
					order=order+250;
				}
				if(cb1.isChecked()){
					on=on+20;
				}
				if(cb2.isChecked()){
					on=on+10;
				}
				if(cb3.isChecked()){
					on=on+15;
				}
				total=(order+on)*ord;
				tv.setText(total+" "+" Pesos ");
				order=0;
				ord=0;
				on=0;
				total=0;
				
			}
			
			
			
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

	
}
