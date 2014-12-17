package com.example.actebete;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      final  Button next=(Button)findViewById(R.id.button1);
       final EditText et=(EditText)findViewById(R.id.et1);
      final  RadioButton r1=(RadioButton)findViewById(R.id.pizza);
      final  RadioButton r2=(RadioButton)findViewById(R.id.tea);
     next.setOnClickListener(new OnClickListener(){

		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
	
			
			if(r1.isChecked()){
				Intent intent1=new Intent(arg0.getContext(),pizza.class);
				String name=et.getText()+"";
				intent1.putExtra("name",name);
				startActivityForResult(intent1,0);
				
			}
			if(r2.isChecked()){
				Intent intent1=new Intent(arg0.getContext(),tea.class);
				String name=et.getText()+"";
				intent1.putExtra("name",name);
				startActivityForResult(intent1,0);
				
				
			}
		}

     });   
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
