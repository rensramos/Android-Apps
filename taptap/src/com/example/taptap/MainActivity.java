package com.example.taptap;

import android.os.Bundle;
import android.app.Activity;
import android.database.Cursor;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity{
int count=0;
Datahandler handlers;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		final Button btnleft=(Button)findViewById(R.id.button1);
		final Button btnright=(Button)findViewById(R.id.button2);
		final Button btnendgame=(Button)findViewById(R.id.button3);
		final Button btnexit=(Button)findViewById(R.id.button4);
		final Button btnscore=(Button)findViewById(R.id.button5);
		final Button btnrestart=(Button)findViewById(R.id.button6);
		final TextView tvnum=(TextView)findViewById(R.id.textView1);
	
		btnright.setEnabled(false);
		btnscore.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String finalscores="";
				handlers=new Datahandler(getBaseContext());
				handlers.open();
				Cursor n=handlers.returnData();
				if(n.moveToFirst()){
					do{
						finalscores=finalscores+"\n"+n.getString(0);}
					while(n.moveToNext());}//end of if curly brace
				handlers.close();
				Toast neg=Toast.makeText(getBaseContext(), "Score Board:"+finalscores,Toast.LENGTH_LONG);
				neg.show();
				
			}
			
		});
		
		btnendgame.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				handlers=new Datahandler(getBaseContext());
				handlers.open();
				handlers.insertData(count+"");
				handlers.close();
			}
			
		});
		
btnrestart.setOnClickListener(new OnClickListener(){

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		onRestart();
	}
	
});
		
		
		btnleft.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				count+=1;
				btnleft.setEnabled(false);
				btnleft.setText("Click Me");
				btnright.setEnabled(true);
				tvnum.setText(count+"");
			}
			
		});
		
		btnright.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				count+=1;
				btnright.setEnabled(false);
				btnright.setText("Click Me");
				btnleft.setEnabled(true);
				tvnum.setText(count+"");
				
			}
			
		});
	}
	
	@Override
	protected void onRestart(){
		TextView tvnum=(TextView)findViewById(R.id.textView1);
		Button btnleft=(Button)findViewById(R.id.button1);
		Button btnright=(Button)findViewById(R.id.button2);
	btnleft.setEnabled(true);
	btnright.setEnabled(false);
		tvnum.setText("0");
		count=0;
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
