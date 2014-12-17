package com.example.goldrush;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Game extends Activity   {
int remain=20;
String value="";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.game);
		
		final Button btn1=(Button)findViewById(R.id.Button1);
		final Button btn2=(Button)findViewById(R.id.Button2);
		final Button btn3=(Button)findViewById(R.id.Button3);
		final Button btn4=(Button)findViewById(R.id.Button4);
		final Button btn5=(Button)findViewById(R.id.Button5);
		final Button btn6=(Button)findViewById(R.id.Button6);
		final Button btn7=(Button)findViewById(R.id.Button7);
		final Button btn8=(Button)findViewById(R.id.Button8);
		final Button btn9=(Button)findViewById(R.id.Button9);
		final Button btn10=(Button)findViewById(R.id.Button10);
		final Button btn11=(Button)findViewById(R.id.Button11);
		final Button btn12=(Button)findViewById(R.id.Button12);
		final Button btn13=(Button)findViewById(R.id.Button13);
		final Button btn14=(Button)findViewById(R.id.Button14);
		final Button btn15=(Button)findViewById(R.id.Button15);
		final Button btn16=(Button)findViewById(R.id.Button16);
		final Button btn17=(Button)findViewById(R.id.Button17);
		final Button btn18=(Button)findViewById(R.id.Button18);
		final Button btn19=(Button)findViewById(R.id.Button19);
		final Button btn20=(Button)findViewById(R.id.Button20);
		final Button btn21=(Button)findViewById(R.id.Button21);
		final Button btn22=(Button)findViewById(R.id.Button22);
		final Button btn23=(Button)findViewById(R.id.Button23);
		final Button btn24=(Button)findViewById(R.id.Button24);
		final Button btn25=(Button)findViewById(R.id.Button25);
		final Button btn26=(Button)findViewById(R.id.Button26);
		final Button btn27=(Button)findViewById(R.id.Button27);
		final Button btn28=(Button)findViewById(R.id.Button28);
		final Button btn29=(Button)findViewById(R.id.Button29);
		final Button btn30=(Button)findViewById(R.id.Button30);
		final Button btn31=(Button)findViewById(R.id.Button31);
		final Button btn32=(Button)findViewById(R.id.Button32);
		final Button btn33=(Button)findViewById(R.id.Button33);
		final Button btn34=(Button)findViewById(R.id.Button34);
		final Button btn35=(Button)findViewById(R.id.Button35);
		final TextView txtremain=(TextView)findViewById(R.id.textView1);
		
		btn1.setEnabled(false);
		btn3.setEnabled(false);
		btn4.setEnabled(false);
		btn5.setEnabled(false);
		btn8.setEnabled(false);
		btn9.setEnabled(false);
		btn10.setEnabled(false);
		btn11.setEnabled(false);
		btn12.setEnabled(false);
		btn13.setEnabled(false);
		btn14.setEnabled(false);
		btn15.setEnabled(false);
		btn16.setEnabled(false);
		btn17.setEnabled(false);
		btn18.setEnabled(false);
		btn19.setEnabled(false);
		btn20.setEnabled(false);
		btn21.setEnabled(false);
		btn22.setEnabled(false);
		btn23.setEnabled(false);
		btn24.setEnabled(false);
		btn25.setEnabled(false);
		btn26.setEnabled(false);
		btn27.setEnabled(false);
		btn28.setEnabled(false);
		btn29.setEnabled(false);
		btn30.setEnabled(false);
		btn31.setEnabled(false);
		btn32.setEnabled(false);
		btn33.setEnabled(false);
		btn34.setEnabled(false);
		btn35.setEnabled(false);
		
		
		 
		btn1.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				btn1.setEnabled(false);
				
				btn1.setBackgroundResource(R.drawable.crash);
				remain-=1;
			    value=remain+"";
				txtremain.setText("Steps Remaining:"+value);
				
			}
			
		});
		
		
		btn2.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				btn1.setBackgroundResource(R.drawable.crash);
				btn2.setBackgroundResource(R.drawable.crash);
				btn2.setEnabled(false);
				btn4.setEnabled(false);
				btn12.setEnabled(false);
				btn13.setEnabled(false);
				btn14.setEnabled(false);
				btn15.setEnabled(false);
				btn16.setEnabled(false);
				btn17.setEnabled(false);
				btn18.setEnabled(false);
				btn19.setEnabled(false);
				btn20.setEnabled(false);
				btn21.setEnabled(false);
				btn22.setEnabled(false);
				btn23.setEnabled(false);
				btn24.setEnabled(false);
				btn25.setEnabled(false);
				btn26.setEnabled(false);
				btn27.setEnabled(false);
				btn28.setEnabled(false);
				btn29.setEnabled(false);
				btn30.setEnabled(false);
				btn31.setEnabled(false);
				btn32.setEnabled(false);
				btn33.setEnabled(false);
				btn34.setEnabled(false);
				btn35.setEnabled(false);
				remain-=1;
			    value=remain+"";
				txtremain.setText("Steps Remaining:"+value);
			}
			
			
		});
		
		btn3.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {

				
				btn2.setEnabled(false);
				btn3.setEnabled(false);
				btn5.setEnabled(false);
				btn7.setEnabled(false);
				btn8.setEnabled(false);
				btn9.setEnabled(false);
				btn13.setEnabled(false);
				btn14.setEnabled(false);
				btn15.setEnabled(false);
				btn16.setEnabled(false);
				btn17.setEnabled(false);
				btn18.setEnabled(false);
				btn19.setEnabled(false);
				btn20.setEnabled(false);
				btn21.setEnabled(false);
				btn22.setEnabled(false);
				btn23.setEnabled(false);
				btn24.setEnabled(false);
				btn25.setEnabled(false);
				btn26.setEnabled(false);
				btn27.setEnabled(false);
				btn28.setEnabled(false);
				btn29.setEnabled(false);
				btn30.setEnabled(false);
				btn31.setEnabled(false);
				btn32.setEnabled(false);
				btn33.setEnabled(false);
				btn34.setEnabled(false);
				btn35.setEnabled(false);
				
			}
			
			});
		
		
	
		
		btn4.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
			
			
		});

		btn5.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		btn6.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		btn7.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		btn8.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		btn9.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		btn10.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		btn11.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		btn12.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		btn13.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		
		btn14.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		btn15.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		btn16.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		btn17.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		btn18.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		btn19.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		btn20.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		btn21.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		btn22.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		btn23.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		btn24.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		btn25.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		btn26.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
			
		});
		btn27.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
			
		});
		btn28.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		btn29.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
		
		});
		
		btn30.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		btn31.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		btn32.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}

		});
		btn33.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		btn34.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		btn35.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
			
	});
		
}
	
}