package com.example.jacknpoy;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
	int s=0;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		final Button p1Ch=(Button)findViewById(R.id.button1);
		p1Ch.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0) {
				s=s+1;
				if(s==1){
					p1Ch.setText("Stone");
				}
				else if(s==2){
					p1Ch.setText("Paper");
				}
				else if(s==3){
					p1Ch.setText("Scissor");
				}
				if(s==4){
					s=0;
				}
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
