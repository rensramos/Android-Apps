package com.midtermgame;

import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.Window;
import android.view.WindowManager;

public class splash1 extends Activity {
	private static int SPLASH_TIME_OUT = 3000; // 1 second = 1000 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
	
		super.onCreate(savedInstanceState);
			
		  requestWindowFeature(Window.FEATURE_NO_TITLE);
	        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, 
	                                WindowManager.LayoutParams.FLAG_FULLSCREEN);
	    	setContentView(R.layout.activity_ausplash);
	    	 new Handler().postDelayed(new Runnable() {
	    		 @Override
	    		 public void run(){
	    			 Intent i = new Intent(splash1.this, splash2.class);
	    			 startActivity(i);
	    			 finish();
	    			 }
	    		 }
	    	 , SPLASH_TIME_OUT); 
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.splash, menu);
		return true;
	}

}
