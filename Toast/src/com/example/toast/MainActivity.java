package com.example.toast;

import android.os.Bundle;
import android.app.Activity;
import android.view.Gravity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity  {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button btnToast=(Button)findViewById(R.id.button1);
		final Button btnPause=(Button)findViewById(R.id.button2);
		Button btnExit=(Button)findViewById(R.id.button3);
		
		btnToast.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				Toast negneg=Toast.makeText(getApplicationContext(), "Hello NegNeg hehey", Toast.LENGTH_LONG);
				negneg.setGravity(Gravity.TOP|Gravity.LEFT, 350, 300);
				negneg.show();
				
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
	Button t =(Button)findViewById(R.id.button1);
	Button e =(Button)findViewById(R.id.button3);
	t.setEnabled(false);
	e.setEnabled(false);
	super.onPause();
}

@Override
protected void onResume(){
	
	Button t =(Button)findViewById(R.id.button1);
	Button e =(Button)findViewById(R.id.button3);
	t.setEnabled(true);
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
