package com.russelmeetfriends;
import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
//import android.view.Menu;
import android.view.Window;
import android.view.WindowManager;
import android.view.Menu;

@SuppressLint("NewApi")
public class Menus extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.menu);
	}	
		public void showAbout(View clickedButton) {
			   Intent activityIntent = new Intent(this, About.class);
			   startActivity(activityIntent);
			  } 
		
	
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.splash1, menu);
		return true;
	}

}
