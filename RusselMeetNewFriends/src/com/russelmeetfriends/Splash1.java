package com.russelmeetfriends;
import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;
import android.content.Intent;

public class Splash1 extends Activity {
	private static int SPLASH_TIME_OUT = 3000; // 1 second = 1000
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);	
		setContentView(R.layout.splash1);
	       new Handler().postDelayed(new Runnable() {
		        @Override 
		       public void run(){
		         Intent i = new Intent(Splash1.this, Splash2.class);
		         startActivity(i);
		         finish();
		        }
		       }, SPLASH_TIME_OUT); 
	   		
	}

	

}

