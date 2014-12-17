package com.example.activity1final;

import android.os.Bundle;
import android.app.Activity;
import android.view.Gravity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
int counterx=10;
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		Datahandler handler;
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		final EditText etguess =(EditText)findViewById(R.id.editText1);
		final TextView tverror=(TextView)findViewById(R.id.textView2);
		final TextView tvtries=(TextView)findViewById(R.id.textView3);
		final Button btnPause =(Button)findViewById(R.id.button1);
		Button btnExit =(Button)findViewById(R.id.button2);
		Button btnCheck =(Button)findViewById(R.id.button3);
		
		Button btnsave=(Button)findViewById(R.id.button4);
		Button btnload =(Button)findViewById(R.id.button5);
		
		btnCheck.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				
				if(etguess.getText().length()!=0){
				String guesko = etguess.getText()+"";
				int guesme= Integer.parseInt(guesko);
				
				if(counterx==1){
					finish();
				}
				if(counterx>0){
				
				if(guesme==25){
					Toast neg =Toast.makeText(getApplicationContext(), "You Guess it right!", Toast.LENGTH_SHORT);
					neg.setGravity(Gravity.TOP| Gravity.LEFT, 350, 300);
					neg.show();
					etguess.setText("");
					counterx=10;
					tvtries.setText("Tries:"+counterx);
					
				}
				
				if (guesme>25){
					Toast neg =Toast.makeText(getApplicationContext(), "Lower!", Toast.LENGTH_SHORT);
					neg.setGravity(Gravity.TOP| Gravity.LEFT, 350, 300);
					neg.show();
					etguess.setText("");
					counterx-=1;
					tvtries.setText("Tries"+counterx);
				}
				
				if(guesme<25){
					Toast neg =Toast.makeText(getApplicationContext(), "Higher!", Toast.LENGTH_SHORT);
					neg.setGravity(Gravity.TOP| Gravity.LEFT, 350, 300);
					neg.show();
					etguess.setText("");
					counterx-=1;
					tvtries.setText("Tries"+counterx);
				}
				
				}
				}
				
				else{
					tverror.setText("Please Enter a Number!");
				}
				
				
				
			}
			
		});
		
		btnPause.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
			
				if(btnPause.getText().equals("Pause")){
					btnPause.setText("Resume");
					onPause();
				}
				
				else{
					btnPause.setText("Pause");
					onResume();
				}
				
			}
			
		});
		
		btnExit.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				finish();
			}
			
		});
	}
	@Override
	protected void onPause(){
		EditText guess=(EditText)findViewById(R.id.editText1);
		Button p=(Button)findViewById(R.id.button3);
		Button e=(Button)findViewById(R.id.button2);
		guess.setEnabled(false);
		p.setEnabled(false);
		e.setEnabled(false);
	super.onPause();
		
	}
	
	@Override
	protected void onResume(){
		EditText guess=(EditText)findViewById(R.id.editText1);
		Button p=(Button)findViewById(R.id.button3);
		Button e=(Button)findViewById(R.id.button2);
		guess.setEnabled(true);
		p.setEnabled(true);
		e.setEnabled(true);
	super.onResume();
		
	}
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
