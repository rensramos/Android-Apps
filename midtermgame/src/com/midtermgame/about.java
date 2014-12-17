package com.midtermgame;
import android.os.Bundle;
import android.app.Activity;
//import android.view.Menu;
import android.view.Window;
import android.view.WindowManager;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class about extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		  requestWindowFeature(Window.FEATURE_NO_TITLE);
		  getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		  getWindow().setFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON, WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON); 
		setContentView(R.layout.about);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.splash, menu);
		return true;
	}

}
