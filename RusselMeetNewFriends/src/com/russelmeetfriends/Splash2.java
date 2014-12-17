package com.russelmeetfriends;
import android.os.Bundle;
import android.os.Handler;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.View;
//import android.view.Menu;
import android.view.Window;
import android.view.WindowManager;
import android.content.Intent;
import android.view.Menu;

public class Splash2 extends Activity {
	private static int SPLASH_TIME_OUT = 3000; // 1 second = 1000
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash2);
		
	       new Handler().postDelayed(new Runnable() {
		        @Override 
		       public void run(){
		         Intent i = new Intent(Splash2.this, Menus.class);
		         startActivity(i);
		         finish();
		        }
		       }, SPLASH_TIME_OUT);  
		
	}

}
