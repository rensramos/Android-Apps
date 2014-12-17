package com.example.tapthepath;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity  {
	Datahandler handlers;
int countx=0;
int values1 =0, values2=0, values3=0, values4=0, values5=0, values6=0, values7=0
, values8=0, values9=0, values10=0, values11=0, values12=0, values13=0, values14=0
, values15=0, values16=0, values17=0, values18=0, values19=0, values20=0, values21=0
, values22=0, values23=0, values24=0, values25=0, values26=0, values27=0, values28=0
, values29=0, values30=0, values31=0, values32=0, values33=0, values34=0, values35=0
, valuesend=0;
int countbtn=1;

Button btnend;
	@Override
		protected void onCreate(Bundle savedInstanceState) {
	
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		final Button btnstart=(Button)findViewById(R.id.button1);
		final Button btn2=(Button)findViewById(R.id.button2);
		final Button btn3=(Button)findViewById(R.id.button3);
		final Button btn4=(Button)findViewById(R.id.button4);
		final Button btn5=(Button)findViewById(R.id.button5);
		final Button btn6=(Button)findViewById(R.id.button6);
		final Button btn7=(Button)findViewById(R.id.button7);
		final Button btn8=(Button)findViewById(R.id.button8);
		final Button btn9=(Button)findViewById(R.id.button9);
		final Button btn10=(Button)findViewById(R.id.button10);
		final Button btn11=(Button)findViewById(R.id.button11);
		final Button btn12=(Button)findViewById(R.id.button12);
		final Button btn13=(Button)findViewById(R.id.button13);
		final Button btn14=(Button)findViewById(R.id.button14);
		final Button btn15=(Button)findViewById(R.id.button15);
		final Button btn16=(Button)findViewById(R.id.button16);
		final Button btn17=(Button)findViewById(R.id.button17);
		final Button btn18=(Button)findViewById(R.id.button18);
		final Button btn19=(Button)findViewById(R.id.button19);
		final Button btn20=(Button)findViewById(R.id.button20);
		final Button btn21=(Button)findViewById(R.id.button21);
		final Button btn22=(Button)findViewById(R.id.button22);
		final Button btn23=(Button)findViewById(R.id.button23);
		final Button btn24=(Button)findViewById(R.id.button24);
		final Button btn25=(Button)findViewById(R.id.button25);
		final Button btn26=(Button)findViewById(R.id.button26);
		final Button btn27=(Button)findViewById(R.id.button27);
		final Button btn28=(Button)findViewById(R.id.button28);
		final Button btn29=(Button)findViewById(R.id.button29);
		final Button btn30=(Button)findViewById(R.id.button30);
		final Button btn31=(Button)findViewById(R.id.button31);
		final Button btn32=(Button)findViewById(R.id.button32);
		final Button btn33=(Button)findViewById(R.id.button33);
		final Button btn34=(Button)findViewById(R.id.button34);
		final Button btn35=(Button)findViewById(R.id.button35);
		btnend=(Button)findViewById(R.id.button36);
		final TextView tvnum=(TextView)findViewById(R.id.textView1);
		
		btn2.setEnabled(false);
		btn3.setEnabled(false);
		btn4.setEnabled(false);
		btn5.setEnabled(false);
		btn6.setEnabled(false);
		btn7.setEnabled(false);
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
		btnend.setEnabled(false);
		
		btnstart.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				btnstart.setEnabled(false);
				btn2.setEnabled(true);
				btn7.setEnabled(true);
				btn8.setEnabled(true);
				countbtn+=1;
				 btnstart.setBackgroundResource(R.drawable.first);
			}	
			
		});
		
		btn2.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				
				if(values7==1){
					btn7.setEnabled(false);
				btn7.setBackgroundResource(R.drawable.crash);}
				if(values8==1){
					btn8.setEnabled(false);
				btn8.setBackgroundResource(R.drawable.crash);}
				if(values9==1){
					btn9.setEnabled(false);
				btn9.setBackgroundResource(R.drawable.crash);}
				if(values3==1){
					btn3.setEnabled(false);
				btn3.setBackgroundResource(R.drawable.crash);}
				if (values7==0){
					btn7.setEnabled(true);}
				if (values8==0){
					btn8.setEnabled(true);}
				if (values9==0){
					btn9.setEnabled(true);}
				if (values3==0){
					btn3.setEnabled(true);}
					
				btn2.setBackgroundResource(R.drawable.tap);
				btnstart.setBackgroundResource(R.drawable.crash);
				btn2.setEnabled(false);
				btn4.setEnabled(false);
				btn5.setEnabled(false);
				btn6.setEnabled(false);
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
				btnend.setEnabled(false);
				values2+=1;
				countbtn+=1;
				if(values7==1 && values8==1 && values9==1 && values3==1){
					Intent error=new Intent(v.getContext(),Outmoves.class);
					startActivityForResult(error,0);
					finish();
					
			}	
			}
			});
		
		btn3.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
			
			if(values2==1){
				btn2.setEnabled(false);
				btn2.setBackgroundResource(R.drawable.crash);}
			if(values8==1){
				btn8.setEnabled(false);
				btn8.setBackgroundResource(R.drawable.crash);}
			if(values9==1){
				btn9.setEnabled(false);
				btn9.setBackgroundResource(R.drawable.crash);}
			if(values10==1){
				btn10.setEnabled(false);
				btn10.setBackgroundResource(R.drawable.crash);}
			if(values4==1){
				btn4.setEnabled(false);
				btn4.setBackgroundResource(R.drawable.crash);}
			if(values2==0){
				btn2.setEnabled(true);}
			if(values8==0){
				btn8.setEnabled(true);}
			if(values9==0){
				btn9.setEnabled(true);}
			if(values10==0){
				btn10.setEnabled(true);}
			if(values4==0){
				btn4.setEnabled(true);}
		
			btnstart.setBackgroundResource(R.drawable.crash);
			btn3.setBackgroundResource(R.drawable.tap);
			btn3.setEnabled(false);
			btn5.setEnabled(false);
			btn6.setEnabled(false);
			btn7.setEnabled(false);
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
			btnend.setEnabled(false);
			values3+=1;
			countbtn+=1;
			if(values2==1 && values4==1 && values8==1 && values9==1 && values10==1){
				Intent error=new Intent(v.getContext(),Outmoves.class);
				startActivityForResult(error,0);
				finish();
				
			}
			}
			
		});
		
btn4.setOnClickListener(new OnClickListener(){

	@Override
	public void onClick(View v) {
	
		
	if(values3==1){
		btn3.setEnabled(false);
		btn3.setBackgroundResource(R.drawable.crash);}
	if(values9==1){
		btn9.setEnabled(false);
		btn9.setBackgroundResource(R.drawable.crash);}
	if(values10==1){
		btn10.setEnabled(false);
		btn10.setBackgroundResource(R.drawable.crash);}
	if(values11==1){
		btn11.setEnabled(false);
		btn11.setBackgroundResource(R.drawable.crash);}
	if(values5==1){
		btn5.setEnabled(false);
		btn5.setBackgroundResource(R.drawable.crash);}
	if(values3==0){
		btn3.setEnabled(true);}
	if(values9==0){
		btn9.setEnabled(true);}
	if(values10==0){
		btn10.setEnabled(true);}
	if(values11==0){
		btn11.setEnabled(true);}
	if(values5==0){
		btn5.setEnabled(true);}
	btn4.setBackgroundResource(R.drawable.tap);
	btn4.setEnabled(false);
	btn6.setEnabled(false);
	btn2.setEnabled(false);
	btn7.setEnabled(false);
	btn8.setEnabled(false);
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
	btnend.setEnabled(false);
	values4+=1;
	countbtn+=1;
	if(values3==1 && values11==1 && values5==1 && values9==1 && values10==1){
		Intent error=new Intent(v.getContext(),Outmoves.class);
		startActivityForResult(error,0);
		finish();}}
			
		});

btn5.setOnClickListener(new OnClickListener(){

	@Override
	public void onClick(View v) {	
		if(values4==1){
			btn4.setEnabled(false);
			btn4.setBackgroundResource(R.drawable.crash);
		}
		if(values10==1){
			btn10.setEnabled(false);
			btn10.setBackgroundResource(R.drawable.crash);
		}
		if(values11==1){
			btn11.setEnabled(false);
			btn11.setBackgroundResource(R.drawable.crash);
			
		}
		if(values12==1){
			btn12.setEnabled(false);
			btn12.setBackgroundResource(R.drawable.crash);
		}
		if(values6==1){
			btn6.setEnabled(false);
			btn6.setBackgroundResource(R.drawable.crash);
		}

		if(values4==0){
			btn4.setEnabled(true);
		}
		if(values10==0){
			btn10.setEnabled(true);
		}
		if(values11==0){
			btn11.setEnabled(true);
		}
		if(values12==0){
			btn12.setEnabled(true);
		}
		if(values6==0){
			btn6.setEnabled(true);
		}
		
		
		btn5.setBackgroundResource(R.drawable.tap);
		btn5.setEnabled(false);
		btn2.setEnabled(false);
		btn3.setEnabled(false);
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
		btnend.setEnabled(false);
		values5+=1;
		countbtn+=1;
		if(values4==1 && values11==1 && values12==1 && values6==1 && values10==1){
			Intent error=new Intent(v.getContext(),Outmoves.class);
			startActivityForResult(error,0);
			finish();}}
	});

btn6.setOnClickListener(new OnClickListener(){

	@Override
	public void onClick(View v) {
			
		if(values5==1){
			btn5.setEnabled(false);
			btn5.setBackgroundResource(R.drawable.crash);
		}
		if(values11==1){
			btn11.setEnabled(false);
			btn11.setBackgroundResource(R.drawable.crash);
		}
		if(values12==1){
			btn12.setEnabled(false);
			btn12.setBackgroundResource(R.drawable.crash);
		}

		if(values5==0){
			btn5.setEnabled(true);
		}
		if(values11==0){
			btn11.setEnabled(true);
		}
		if(values12==0){
			btn12.setEnabled(true);
		}
		
		btn6.setBackgroundResource(R.drawable.tap);
		btn2.setEnabled(false);
		btn3.setEnabled(false);
		btn4.setEnabled(false);
		btn6.setEnabled(false);
		btn7.setEnabled(false);
		btn8.setEnabled(false);
		btn9.setEnabled(false);
		btn10.setEnabled(false);
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
		btnend.setEnabled(false);
		values6+=1;
		countbtn+=1;
		if(values5==1 && values11==1 && values12==1){
			Intent error=new Intent(v.getContext(),Outmoves.class);
			startActivityForResult(error,0);
			finish();}}
	
});

btn7.setOnClickListener(new OnClickListener(){

	@Override
	public void onClick(View v) {
		if(values2==1){
			btn2.setEnabled(false);
			btn2.setBackgroundResource(R.drawable.crash);}
		if(values13==1){
			btn13.setEnabled(false);
			btn13.setBackgroundResource(R.drawable.crash);}
		if(values14==1){
			btn14.setEnabled(false);
			btn14.setBackgroundResource(R.drawable.crash);}
		if(values8==1){
			btn8.setEnabled(false);
			btn8.setBackgroundResource(R.drawable.crash);}

		if(values2==0){
			btn2.setEnabled(true);}
		if(values13==0){
			btn13.setEnabled(true);}
		if(values14==0){
			btn14.setEnabled(true);}
		if(values8==0){
			btn8.setEnabled(true);}
		
		btnstart.setBackgroundResource(R.drawable.crash);
		btn7.setBackgroundResource(R.drawable.tap);
		btn7.setEnabled(false);
		btn3.setEnabled(false);
		btn4.setEnabled(false);
		btn5.setEnabled(false);
		btn6.setEnabled(false);
		btn9.setEnabled(false);
		btn10.setEnabled(false);
		btn11.setEnabled(false);
		btn12.setEnabled(false);
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
		btnend.setEnabled(false);
		values7+=1;
		countbtn+=1;
		
		if(values2==1 && values13==1 && values14==1 && values8==1){
			Intent error=new Intent(v.getContext(),Outmoves.class);
			startActivityForResult(error,0);
			finish();}}
});

btn8.setOnClickListener(new OnClickListener(){

	@Override
	public void onClick(View v) {
		if(values2==1){
			btn2.setEnabled(false);
			btn2.setBackgroundResource(R.drawable.crash);}
		if(values13==1){
			btn13.setEnabled(false);
			btn13.setBackgroundResource(R.drawable.crash);}
		if(values14==1){
			btn14.setEnabled(false);
			btn14.setBackgroundResource(R.drawable.crash);}
		if(values7==1){
			btn7.setEnabled(false);
			btn7.setBackgroundResource(R.drawable.crash);}
		if(values15==1){
			btn15.setEnabled(false);
			btn15.setBackgroundResource(R.drawable.crash);}
		if(values9==1){
			btn9.setEnabled(false);
			btn9.setBackgroundResource(R.drawable.crash);}
		if(values3==1){
			btn3.setEnabled(false);
			btn3.setBackgroundResource(R.drawable.crash);}

		if(values2==0){
			btn2.setEnabled(true);}
		if(values13==0){
			btn13.setEnabled(true);}
		if(values14==0){
			btn14.setEnabled(true);}
		if(values7==0){
			btn7.setEnabled(true);}
		if(values15==0){
			btn15.setEnabled(true);}
		if(values9==0){
			btn9.setEnabled(true);}
		if(values3==0){
			btn3.setEnabled(true);}
		btnstart.setBackgroundResource(R.drawable.crash);
		btn8.setBackgroundResource(R.drawable.tap);
		btn8.setEnabled(false);
		btn4.setEnabled(false);
		btn5.setEnabled(false);
		btn6.setEnabled(false);
		btn10.setEnabled(false);
		btn11.setEnabled(false);
		btn12.setEnabled(false);
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
		btnend.setEnabled(false);
		values8+=1;
		countbtn+=1;
		if(values2==1 && values13==1 && values14==1 && values7==1 && values15==1&& values9==1&& values3==1){
			Intent error=new Intent(v.getContext(),Outmoves.class);
			startActivityForResult(error,0);
			finish();}}
	
});

btn9.setOnClickListener(new OnClickListener(){

	@Override
	public void onClick(View v) {
		
		if(values2==1){
			btn2.setEnabled(false);
			btn2.setBackgroundResource(R.drawable.crash);}
		if(values8==1){
			btn8.setEnabled(false);
			btn8.setBackgroundResource(R.drawable.crash);}
		if(values14==1){
			btn14.setEnabled(false);
			btn14.setBackgroundResource(R.drawable.crash);}
		if(values15==1){
			btn15.setEnabled(false);
			btn15.setBackgroundResource(R.drawable.crash);}
		if(values16==1){
			btn16.setEnabled(false);
			btn16.setBackgroundResource(R.drawable.crash);}
		if(values10==1){
			btn10.setEnabled(false);
			btn10.setBackgroundResource(R.drawable.crash);}
		if(values4==1){
			btn4.setEnabled(false);
			btn4.setBackgroundResource(R.drawable.crash);}
		if(values3==1){
			btn3.setEnabled(false);
			btn3.setBackgroundResource(R.drawable.crash);}
	
		if(values2==0){
			btn2.setEnabled(true);}
		if(values8==0){
			btn8.setEnabled(true);}
		if(values14==0){
			btn14.setEnabled(true);}
		if(values15==0){
			btn15.setEnabled(true);}
		if(values16==0){
			btn16.setEnabled(true);}
		if(values10==0){
			btn10.setEnabled(true);}
		if(values4==0){
			btn4.setEnabled(true);}
		if(values3==0){
			btn3.setEnabled(true);}
		
		btn9.setBackgroundResource(R.drawable.tap);
		btn9.setEnabled(false);
		btn5.setEnabled(false);
		btn6.setEnabled(false);
		btn7.setEnabled(false);
		btn11.setEnabled(false);
		btn12.setEnabled(false);
		btn13.setEnabled(false);
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
		btnend.setEnabled(false);
		values9+=1;
		countbtn+=1;
		if(values2==1 && values8==1 && values14==1 && values15==1
				&& values16==1&& values10==1
				&& values4==1&& values3==1){
			Intent error=new Intent(v.getContext(),Outmoves.class);
			startActivityForResult(error,0);
			finish();}}
	
});

btn10.setOnClickListener(new OnClickListener(){

	@Override
	public void onClick(View v) {
		if(values3==1){
			btn3.setEnabled(false);
			btn3.setBackgroundResource(R.drawable.crash);}
		if(values9==1){
			btn9.setEnabled(false);
			btn9.setBackgroundResource(R.drawable.crash);}
		if(values15==1){
			btn15.setEnabled(false);
			btn15.setBackgroundResource(R.drawable.crash);}
		if(values16==1){
			btn16.setEnabled(false);
			btn16.setBackgroundResource(R.drawable.crash);}
		if(values17==1){
			btn17.setEnabled(false);
			btn17.setBackgroundResource(R.drawable.crash);}
		if(values11==1){
			btn11.setEnabled(false);
			btn11.setBackgroundResource(R.drawable.crash);}
		if(values5==1){
			btn5.setEnabled(false);
			btn5.setBackgroundResource(R.drawable.crash);}
		if(values4==1){
			btn4.setEnabled(false);
			btn4.setBackgroundResource(R.drawable.crash);}
	
		if(values3==0){
			btn3.setEnabled(true);}
		if(values9==0){
			btn9.setEnabled(true);}
		if(values15==0){
			btn15.setEnabled(true);}
		if(values16==0){
			btn16.setEnabled(true);}
		if(values17==0){
			btn17.setEnabled(true);}
		if(values11==0){
			btn11.setEnabled(true);}
		if(values5==0){
			btn5.setEnabled(true);}
		if(values4==0){
			btn4.setEnabled(true);}
	
		btn10.setBackgroundResource(R.drawable.tap);
		btn10.setEnabled(false);	
		btn2.setEnabled(false);
		btn6.setEnabled(false);
		btn7.setEnabled(false);
		btn8.setEnabled(false);
		btn12.setEnabled(false);
		btn13.setEnabled(false);
		btn14.setEnabled(false);
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
		btnend.setEnabled(false);
		values10+=1;
		countbtn+=1;
		if(values3==1 && values9==1 && values15==1 && values16==1
				&& values17==1&& values11==1&& values5==1
				&& values4==1){
			Intent error=new Intent(v.getContext(),Outmoves.class);
			startActivityForResult(error,0);
			finish();}}
});

btn11.setOnClickListener(new OnClickListener(){

	@Override
	public void onClick(View v) {
		if(values4==1){
			btn4.setEnabled(false);
			btn4.setBackgroundResource(R.drawable.crash);}
		if(values10==1){
			btn10.setEnabled(false);
			btn10.setBackgroundResource(R.drawable.crash);}
		if(values16==1){
			btn16.setEnabled(false);
			btn16.setBackgroundResource(R.drawable.crash);}
		if(values17==1){
			btn17.setEnabled(false);
			btn17.setBackgroundResource(R.drawable.crash);}
		if(values18==1){
			btn18.setEnabled(false);
			btn18.setBackgroundResource(R.drawable.crash);}
		if(values12==1){
			btn12.setEnabled(false);
			btn12.setBackgroundResource(R.drawable.crash);}
		if(values6==1){
			btn6.setEnabled(false);
			btn6.setBackgroundResource(R.drawable.crash);}
		if(values5==1){
			btn5.setEnabled(false);
			btn5.setBackgroundResource(R.drawable.crash);}
	
		if(values4==0){
			btn4.setEnabled(true);}
		if(values10==0){
			btn10.setEnabled(true);}
		if(values16==0){
			btn16.setEnabled(true);}
		if(values17==0){
			btn17.setEnabled(true);}
		if(values18==0){
			btn18.setEnabled(true);}
		if(values12==0){
			btn12.setEnabled(true);}
		if(values6==0){
			btn6.setEnabled(true);}
		if(values5==0){
			btn5.setEnabled(true);}
		
		btn11.setBackgroundResource(R.drawable.tap);
		btn11.setEnabled(false);
		btn2.setEnabled(false);
		btn3.setEnabled(false);
		btn7.setEnabled(false);
		btn8.setEnabled(false);
		btn9.setEnabled(false);
		btn13.setEnabled(false);
		btn14.setEnabled(false);
		btn15.setEnabled(false);
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
		btnend.setEnabled(false);
		values11+=1;
		countx+=1;
		countbtn+=1;
		if(values4==1 && values10==1 && values16==1 && values17==1
				&& values18==1&& values12==1&& values6==1
				&& values5==1){
			Intent error=new Intent(v.getContext(),Outmoves.class);
			startActivityForResult(error,0);
		finish();}}
	
});

btn12.setOnClickListener(new OnClickListener(){

	@Override
	public void onClick(View v) {
		if(values5==1){
			btn5.setEnabled(false);
			btn5.setBackgroundResource(R.drawable.crash);}
		if(values11==1){
			btn11.setEnabled(false);
			btn11.setBackgroundResource(R.drawable.crash);}
		if(values17==1){
			btn17.setEnabled(false);
			btn17.setBackgroundResource(R.drawable.crash);}
		if(values18==1){
			btn18.setEnabled(false);
			btn18.setBackgroundResource(R.drawable.crash);}
		if(values6==1){
			btn6.setEnabled(false);
			btn6.setBackgroundResource(R.drawable.crash);}
	
		if(values5==0){
			btn5.setEnabled(true);}
		if(values11==0){
			btn11.setEnabled(true);}
		if(values17==0){
			btn17.setEnabled(true);}
		if(values18==0){
			btn18.setEnabled(true);}
		if(values6==0){
			btn6.setEnabled(true);}
		
		btn12.setBackgroundResource(R.drawable.tap);
		btn12.setEnabled(false);
		btn2.setEnabled(false);
		btn3.setEnabled(false);
		btn4.setEnabled(false);
		btn9.setEnabled(false);
		btn10.setEnabled(false);
		btn13.setEnabled(false);
		btn14.setEnabled(false);
		btn15.setEnabled(false);
		btn16.setEnabled(false);
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
		btnend.setEnabled(false);
		values12+=1;
		countbtn+=1;
		if(values5==1 && values6==1 && values11==1 && values18==1
				&& values18==1){
			Intent error=new Intent(v.getContext(),Outmoves.class);
			startActivityForResult(error,0);
			finish();}}
	
});

btn13.setOnClickListener(new OnClickListener(){

	@Override
	public void onClick(View v) {
		if(values7==1){
			btn7.setEnabled(false);
			btn7.setBackgroundResource(R.drawable.crash);}
		if(values8==1){
			btn8.setEnabled(false);
			btn8.setBackgroundResource(R.drawable.crash);}
		if(values14==1){
			btn14.setEnabled(false);
			btn14.setBackgroundResource(R.drawable.crash);}
		if(values19==1){
			btn19.setEnabled(false);
			btn19.setBackgroundResource(R.drawable.crash);}
		if(values20==1){
			btn20.setEnabled(false);
			btn20.setBackgroundResource(R.drawable.crash);}
	
		if(values7==0){
			btn7.setEnabled(true);}
		if(values8==0){
			btn8.setEnabled(true);}
		if(values14==0){
			btn14.setEnabled(true);}
		if(values19==0){
			btn19.setEnabled(true);}
		if(values20==0){
			btn20.setEnabled(true);}
		
		
		values13+=1;
		btn13.setBackgroundResource(R.drawable.tap);
		btn13.setEnabled(false);
		btn12.setEnabled(false);
		btn2.setEnabled(false);
		btn3.setEnabled(false);
		btn4.setEnabled(false);
		btn5.setEnabled(false);
		btn6.setEnabled(false);
		btn9.setEnabled(false);
		btn10.setEnabled(false);
		btn11.setEnabled(false);
		btn12.setEnabled(false);
		btn15.setEnabled(false);
		btn16.setEnabled(false);
		btn17.setEnabled(false);
		btn18.setEnabled(false);
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
		btnend.setEnabled(false);
		countbtn+=1;
		if(values7==1 && values8==1 && values14==1 && values19==1
				&& values20==1){
			Intent error=new Intent(v.getContext(),Outmoves.class);
			startActivityForResult(error,0);	
			finish();}}
	
});

btn14.setOnClickListener(new OnClickListener(){

	@Override
	public void onClick(View v) {
		if(values7==1){
			btn7.setEnabled(false);
			btn7.setBackgroundResource(R.drawable.crash);}
		if(values8==1){
			btn8.setEnabled(false);
			btn8.setBackgroundResource(R.drawable.crash);}
		if(values9==1){
			btn9.setEnabled(false);
			btn9.setBackgroundResource(R.drawable.crash);}
		if(values13==1){
			btn13.setEnabled(false);
			btn13.setBackgroundResource(R.drawable.crash);}
		if(values15==1){
			btn15.setEnabled(false);
			btn15.setBackgroundResource(R.drawable.crash);}
		if(values19==1){
			btn19.setEnabled(false);
			btn19.setBackgroundResource(R.drawable.crash);}
		if(values20==1){
			btn20.setEnabled(false);
			btn20.setBackgroundResource(R.drawable.crash);}
		if(values21==1){
			btn21.setEnabled(false);
			btn21.setBackgroundResource(R.drawable.crash);}
	
		if(values7==0){
			btn7.setEnabled(true);}
		if(values8==0){
			btn8.setEnabled(true);}
		if(values9==0){
			btn9.setEnabled(true);}
		if(values13==0){
			btn13.setEnabled(true);}
		if(values15==0){
			btn15.setEnabled(true);}
		if(values19==0){
			btn19.setEnabled(true);}
		if(values20==0){
			btn20.setEnabled(true);}
		if(values21==0){
			btn21.setEnabled(true);}
		
		btn14.setEnabled(false);
		btn14.setBackgroundResource(R.drawable.tap);
		values14+=1;
		btn2.setEnabled(false);
		btn3.setEnabled(false);
		btn4.setEnabled(false);
		btn5.setEnabled(false);
		btn6.setEnabled(false);
		btn10.setEnabled(false);
		btn11.setEnabled(false);
		btn12.setEnabled(false);
		btn16.setEnabled(false);
		btn17.setEnabled(false);
		btn18.setEnabled(false);
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
		btnend.setEnabled(false);
		countbtn+=1;
		
		if(values7==1 && values9==1 && values8==1 && values16==1
				&& values15==1&& values19==1&& values20==1
				&& values21==1){
			Intent error=new Intent(v.getContext(),Outmoves.class);
			startActivityForResult(error,0);
			finish();}}
	
});

btn15.setOnClickListener(new OnClickListener(){

	@Override
	public void onClick(View v) {
		if(values8==1){
			btn8.setEnabled(false);
			btn8.setBackgroundResource(R.drawable.crash);}
		if(values9==1){
			btn9.setEnabled(false);
			btn9.setBackgroundResource(R.drawable.crash);}
		if(values10==1){
			btn10.setEnabled(false);
			btn10.setBackgroundResource(R.drawable.crash);}
		if(values14==1){
			btn14.setEnabled(false);
			btn14.setBackgroundResource(R.drawable.crash);}
		if(values16==1){
			btn16.setEnabled(false);
			btn16.setBackgroundResource(R.drawable.crash);}
		if(values20==1){
			btn20.setEnabled(false);
			btn20.setBackgroundResource(R.drawable.crash);}
		if(values21==1){
			btn21.setEnabled(false);
			btn21.setBackgroundResource(R.drawable.crash);}
		if(values22==1){
			btn22.setEnabled(false);
			btn22.setBackgroundResource(R.drawable.crash);}
		
	
		if(values8==0){
			btn8.setEnabled(true);}
		if(values9==0){
			btn9.setEnabled(true);}
		if(values10==0){
			btn10.setEnabled(true);}
		if(values14==0){
			btn14.setEnabled(true);}
		if(values16==0){
			btn16.setEnabled(true);}
		if(values20==0){
			btn20.setEnabled(true);}
		if(values21==0){
			btn21.setEnabled(true);}
		if(values22==0){
			btn22.setEnabled(true);}
		
		
		values15+=1;
		btn15.setEnabled(false);
		btn15.setBackgroundResource(R.drawable.tap);
		btn2.setEnabled(false);
		btn3.setEnabled(false);
		btn4.setEnabled(false);
		btn5.setEnabled(false);
		btn6.setEnabled(false);
		btn7.setEnabled(false);
		btn11.setEnabled(false);
		btn12.setEnabled(false);
		btn13.setEnabled(false);
		btn17.setEnabled(false);
		btn18.setEnabled(false);
		btn19.setEnabled(false);
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
		btnend.setEnabled(false);
		countbtn+=1;
		
		if(values8==1 && values9==1 && values10==1 && values14==1
				&& values16==1&& values20==1&& values21==1
				&& values22==1){
			Intent error=new Intent(v.getContext(),Outmoves.class);
			startActivityForResult(error,0);
			finish();}}
	
});

btn16.setOnClickListener(new OnClickListener(){

	@Override
	public void onClick(View v) {
		if(values11==1){
			btn11.setEnabled(false);
			btn11.setBackgroundResource(R.drawable.crash);}
		if(values9==1){
			btn9.setEnabled(false);
			btn9.setBackgroundResource(R.drawable.crash);}
		if(values10==1){
			btn10.setEnabled(false);
			btn10.setBackgroundResource(R.drawable.crash);}
		if(values15==1){
			btn15.setEnabled(false);
			btn15.setBackgroundResource(R.drawable.crash);}
		if(values17==1){
			btn17.setEnabled(false);
			btn17.setBackgroundResource(R.drawable.crash);}
		if(values23==1){
			btn23.setEnabled(false);
			btn23.setBackgroundResource(R.drawable.crash);}
		if(values21==1){
			btn21.setEnabled(false);
			btn21.setBackgroundResource(R.drawable.crash);}
		if(values22==1){
			btn22.setEnabled(false);
			btn22.setBackgroundResource(R.drawable.crash);}
		
	
		if(values11==0){
			btn11.setEnabled(true);}
		if(values9==0){
			btn9.setEnabled(true);}
		if(values10==0){
			btn10.setEnabled(true);}
		if(values15==0){
			btn15.setEnabled(true);}
		if(values17==0){
			btn17.setEnabled(true);}
		if(values23==0){
			btn23.setEnabled(true);}
		if(values21==0){
			btn21.setEnabled(true);}
		if(values22==0){
			btn22.setEnabled(true);}
		
		values16+=1;
		btn16.setEnabled(false);
		btn16.setBackgroundResource(R.drawable.tap);
		btn2.setEnabled(false);
		btn3.setEnabled(false);
		btn4.setEnabled(false);
		btn5.setEnabled(false);
		btn6.setEnabled(false);
		btn7.setEnabled(false);
		btn8.setEnabled(false);
		btn12.setEnabled(false);
		btn13.setEnabled(false);
		btn14.setEnabled(false);
		btn18.setEnabled(false);
		btn19.setEnabled(false);
		btn20.setEnabled(false);
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
		btnend.setEnabled(false);
		countbtn+=1;
		
		if(values9==1 && values10==1 && values11==1 && values15==1
				&& values17==1&& values21==1&& values22==1
				&& values23==1){
			Intent error=new Intent(v.getContext(),Outmoves.class);
			startActivityForResult(error,0);
			finish();}}
	
});

btn17.setOnClickListener(new OnClickListener(){

	@Override
	public void onClick(View v) {
		if(values11==1){
			btn11.setEnabled(false);
			btn11.setBackgroundResource(R.drawable.crash);}
		if(values12==1){
			btn12.setEnabled(false);
			btn12.setBackgroundResource(R.drawable.crash);}
		if(values10==1){
			btn10.setEnabled(false);
			btn10.setBackgroundResource(R.drawable.crash);}
		if(values16==1){
			btn16.setEnabled(false);
			btn16.setBackgroundResource(R.drawable.crash);}
		if(values18==1){
			btn18.setEnabled(false);
			btn18.setBackgroundResource(R.drawable.crash);}
		if(values23==1){
			btn23.setEnabled(false);
			btn23.setBackgroundResource(R.drawable.crash);}
		if(values24==1){
			btn24.setEnabled(false);
			btn24.setBackgroundResource(R.drawable.crash);}
		if(values22==1){
			btn22.setEnabled(false);
			btn22.setBackgroundResource(R.drawable.crash);}
		
	
		if(values11==0){
			btn11.setEnabled(true);}
		if(values12==0){
			btn12.setEnabled(true);}
		if(values10==0){
			btn10.setEnabled(true);}
		if(values16==0){
			btn16.setEnabled(true);}
		if(values18==0){
			btn18.setEnabled(true);}
		if(values23==0){
			btn23.setEnabled(true);}
		if(values24==0){
			btn24.setEnabled(true);}
		if(values22==0){
			btn22.setEnabled(true);}
		
		values17+=1;
		btn17.setBackgroundResource(R.drawable.tap);
		btn17.setEnabled(false);
		btn2.setEnabled(false);
		btn3.setEnabled(false);
		btn4.setEnabled(false);
		btn5.setEnabled(false);
		btn6.setEnabled(false);
		btn7.setEnabled(false);
		btn8.setEnabled(false);
		btn9.setEnabled(false);
		btn13.setEnabled(false);
		btn14.setEnabled(false);
		btn15.setEnabled(false);
		btn19.setEnabled(false);
		btn20.setEnabled(false);
		btn21.setEnabled(false);
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
		btnend.setEnabled(false);
		countbtn+=1;
		if(values10==1 && values11==1 && values12==1 && values16==1
				&& values18==1&& values22==1&& values23==1
				&& values24==1){
			Intent error=new Intent(v.getContext(),Outmoves.class);
			startActivityForResult(error,0);
			finish();}}
	
});

btn18.setOnClickListener(new OnClickListener(){

	@Override
	public void onClick(View v) {
		if(values11==1){
			btn11.setEnabled(false);
			btn11.setBackgroundResource(R.drawable.crash);}
		if(values12==1){
			btn12.setEnabled(false);
			btn12.setBackgroundResource(R.drawable.crash);}
		if(values17==1){
			btn17.setEnabled(false);
			btn17.setBackgroundResource(R.drawable.crash);}
		if(values23==1){
			btn23.setEnabled(false);
			btn23.setBackgroundResource(R.drawable.crash);}
		if(values24==1){
			btn24.setEnabled(false);
			btn24.setBackgroundResource(R.drawable.crash);}
	
		if(values11==0){
			btn11.setEnabled(true);}
		if(values12==0){
			btn12.setEnabled(true);}
		if(values17==0){
			btn17.setEnabled(true);}
		if(values23==0){
			btn23.setEnabled(true);}
		if(values24==0){
			btn24.setEnabled(true);}
	
		values18+=1;
		btn18.setEnabled(false);
		btn18.setBackgroundResource(R.drawable.tap);
		btn2.setEnabled(false);
		btn3.setEnabled(false);
		btn4.setEnabled(false);
		btn9.setEnabled(false);
		btn10.setEnabled(false);
		btn13.setEnabled(false);
		btn14.setEnabled(false);
		btn15.setEnabled(false);
		btn16.setEnabled(false);
		btn19.setEnabled(false);
		btn20.setEnabled(false);
		btn21.setEnabled(false);
		btn22.setEnabled(false);
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
		btnend.setEnabled(false);
		countbtn+=1;
		if(values11==1 && values12==1 && values17==1 &&
		 values23==1&& values24==1){
			Intent error=new Intent(v.getContext(),Outmoves.class);
			startActivityForResult(error,0);
			finish();}}
	
});

btn19.setOnClickListener(new OnClickListener(){

	@Override
	public void onClick(View v) {
		if(values13==1){
			btn13.setEnabled(false);
			btn13.setBackgroundResource(R.drawable.crash);}
		if(values14==1){
			btn14.setEnabled(false);
			btn14.setBackgroundResource(R.drawable.crash);}
		if(values20==1){
			btn20.setEnabled(false);
			btn20.setBackgroundResource(R.drawable.crash);}
		if(values25==1){
			btn25.setEnabled(false);
			btn25.setBackgroundResource(R.drawable.crash);}
		if(values26==1){
			btn26.setEnabled(false);
			btn26.setBackgroundResource(R.drawable.crash);}
	
		if(values13==0){
			btn13.setEnabled(true);}
		if(values14==0){
			btn14.setEnabled(true);}
		if(values20==0){
			btn20.setEnabled(true);}
		if(values25==0){
			btn25.setEnabled(true);}
		if(values26==0){
			btn26.setEnabled(true);}
		
		values19+=1;
		btn19.setBackgroundResource(R.drawable.tap);
		btn19.setEnabled(false);
		btn2.setEnabled(false);
		btn3.setEnabled(false);
		btn4.setEnabled(false);
		btn5.setEnabled(false);
		btn6.setEnabled(false);
		btn7.setEnabled(false);
		btn8.setEnabled(false);
		btn9.setEnabled(false);
		btn10.setEnabled(false);
		btn11.setEnabled(false);
		btn12.setEnabled(false);
		btn15.setEnabled(false);
		btn16.setEnabled(false);
		btn17.setEnabled(false);
		btn18.setEnabled(false);
		btn21.setEnabled(false);
		btn22.setEnabled(false);
		btn23.setEnabled(false);
		btn24.setEnabled(false);
		btn27.setEnabled(false);
		btn28.setEnabled(false);
		btn29.setEnabled(false);
		btn30.setEnabled(false);
		btn31.setEnabled(false);
		btn32.setEnabled(false);
		btn33.setEnabled(false);
		btn34.setEnabled(false);
		btn35.setEnabled(false);
		btnend.setEnabled(false);
		countbtn+=1;
		if(values13==1 && values14==1 && values20==1 && values25==1
				&& values26==1){
			Intent error=new Intent(v.getContext(),Outmoves.class);
			startActivityForResult(error,0);
			finish();}}
	
});

btn20.setOnClickListener(new OnClickListener(){

	@Override
	public void onClick(View v) {
		if(values13==1){
			btn13.setEnabled(false);
			btn13.setBackgroundResource(R.drawable.crash);}
		if(values14==1){
			btn14.setEnabled(false);
			btn14.setBackgroundResource(R.drawable.crash);}
		if(values15==1){
			btn15.setEnabled(false);
			btn15.setBackgroundResource(R.drawable.crash);}
		if(values19==1){
			btn19.setEnabled(false);
			btn19.setBackgroundResource(R.drawable.crash);}
		if(values21==1){
			btn21.setEnabled(false);
			btn21.setBackgroundResource(R.drawable.crash);}
		if(values25==1){
			btn25.setEnabled(false);
			btn25.setBackgroundResource(R.drawable.crash);}
		if(values26==1){
			btn26.setEnabled(false);
			btn26.setBackgroundResource(R.drawable.crash);}
		if(values27==1){
			btn27.setEnabled(false);
			btn27.setBackgroundResource(R.drawable.crash);}
	
		if(values13==0){
			btn13.setEnabled(true);}
		if(values14==0){
			btn14.setEnabled(true);}
		if(values15==0){
			btn15.setEnabled(true);}
		if(values19==0){
			btn19.setEnabled(true);}
		if(values21==0){
			btn21.setEnabled(true);}
		if(values25==0){
			btn25.setEnabled(true);}
		if(values26==0){
			btn26.setEnabled(true);}
		if(values27==0){
			btn27.setEnabled(true);}
		
		values20=+1;
		btn20.setBackgroundResource(R.drawable.tap);
		btn20.setEnabled(false);
		btn2.setEnabled(false);
		btn3.setEnabled(false);
		btn4.setEnabled(false);
		btn5.setEnabled(false);
		btn6.setEnabled(false);
		btn7.setEnabled(false);
		btn8.setEnabled(false);
		btn9.setEnabled(false);
		btn10.setEnabled(false);
		btn11.setEnabled(false);
		btn12.setEnabled(false);
		btn16.setEnabled(false);
		btn17.setEnabled(false);
		btn18.setEnabled(false);
		btn22.setEnabled(false);
		btn23.setEnabled(false);
		btn24.setEnabled(false);
		btn28.setEnabled(false);
		btn29.setEnabled(false);
		btn30.setEnabled(false);
		btn31.setEnabled(false);
		btn32.setEnabled(false);
		btn33.setEnabled(false);
		btn34.setEnabled(false);
		btn35.setEnabled(false);
		btnend.setEnabled(false);
		
	
		countx+=1;
		countbtn+=1;
		if(values13==1 && values14==1 && values15==1 && values19==1
				&& values21==1&& values25==1&& values26==1
				&& values27==1){
			Intent error=new Intent(v.getContext(),Outmoves.class);
			startActivityForResult(error,0);
			finish();}}
	
});

btn21.setOnClickListener(new OnClickListener(){

	@Override
	public void onClick(View v) {
		if(values16==1){
			btn16.setEnabled(false);
			btn16.setBackgroundResource(R.drawable.crash);}
		if(values14==1){
			btn14.setEnabled(false);
			btn14.setBackgroundResource(R.drawable.crash);}
		if(values15==1){
			btn15.setEnabled(false);
			btn15.setBackgroundResource(R.drawable.crash);}
		if(values20==1){
			btn20.setEnabled(false);
			btn20.setBackgroundResource(R.drawable.crash);}
		if(values22==1){
			btn22.setEnabled(false);
			btn22.setBackgroundResource(R.drawable.crash);}
		if(values28==1){
			btn28.setEnabled(false);
			btn28.setBackgroundResource(R.drawable.crash);}
		if(values26==1){
			btn26.setEnabled(false);
			btn26.setBackgroundResource(R.drawable.crash);}
		if(values27==1){
			btn27.setEnabled(false);
			btn27.setBackgroundResource(R.drawable.crash);}
	
		if(values16==0){
			btn16.setEnabled(true);}
		if(values14==0){
			btn14.setEnabled(true);}
		if(values15==0){
			btn15.setEnabled(true);}
		if(values20==0){
			btn20.setEnabled(true);}
		if(values22==0){
			btn22.setEnabled(true);}
		if(values28==0){
			btn28.setEnabled(true);}
		if(values26==0){
			btn26.setEnabled(true);}
		if(values27==0){
			btn27.setEnabled(true);}
		
		values21=+1;
		btn21.setEnabled(false);
		btn21.setBackgroundResource(R.drawable.tap);
		btn2.setEnabled(false);
		btn3.setEnabled(false);
		btn4.setEnabled(false);
		btn5.setEnabled(false);
		btn6.setEnabled(false);
		btn7.setEnabled(false);
		btn8.setEnabled(false);
		btn9.setEnabled(false);
		btn10.setEnabled(false);
		btn11.setEnabled(false);
		btn12.setEnabled(false);
		btn13.setEnabled(false);
		btn17.setEnabled(false);
		btn18.setEnabled(false);
		btn19.setEnabled(false);
		btn23.setEnabled(false);
		btn24.setEnabled(false);
		btn25.setEnabled(false);
		btn29.setEnabled(false);
		btn30.setEnabled(false);
		btn31.setEnabled(false);
		btn32.setEnabled(false);
		btn33.setEnabled(false);
		btn34.setEnabled(false);
		btn35.setEnabled(false);
		btnend.setEnabled(false);
		countbtn+=1;
		
		if(values14==1 && values15==1 && values16==1 && values20==1
				&& values22==1&& values28==1&& values26==1
				&& values27==1){
			Intent error=new Intent(v.getContext(),Outmoves.class);
			startActivityForResult(error,0);
			finish();}}
	
});

btn22.setOnClickListener(new OnClickListener(){

	@Override
	public void onClick(View v) {
		if(values16==1){
			btn16.setEnabled(false);
			btn16.setBackgroundResource(R.drawable.crash);}
		if(values17==1){
			btn17.setEnabled(false);
			btn17.setBackgroundResource(R.drawable.crash);}
		if(values15==1){
			btn15.setEnabled(false);
			btn15.setBackgroundResource(R.drawable.crash);}
		if(values21==1){
			btn21.setEnabled(false);
			btn21.setBackgroundResource(R.drawable.crash);}
		if(values23==1){
			btn23.setEnabled(false);
			btn23.setBackgroundResource(R.drawable.crash);}
		if(values28==1){
			btn28.setEnabled(false);
			btn28.setBackgroundResource(R.drawable.crash);}
		if(values29==1){
			btn29.setEnabled(false);
			btn29.setBackgroundResource(R.drawable.crash);}
		if(values27==1){
			btn27.setEnabled(false);
			btn27.setBackgroundResource(R.drawable.crash);}
	
		if(values16==0){
			btn16.setEnabled(true);}
		if(values17==0){
			btn17.setEnabled(true);}
		if(values15==0){
			btn15.setEnabled(true);}
		if(values21==0){
			btn21.setEnabled(true);}
		if(values23==0){
			btn23.setEnabled(true);}
		if(values28==0){
			btn28.setEnabled(true);}
		if(values29==0){
			btn29.setEnabled(true);}
		if(values27==0){
			btn27.setEnabled(true);}
		
		values22=+1;
		btn22.setEnabled(false);
		btn22.setBackgroundResource(R.drawable.tap);
		btn2.setEnabled(false);
		btn3.setEnabled(false);
		btn4.setEnabled(false);
		btn5.setEnabled(false);
		btn6.setEnabled(false);
		btn7.setEnabled(false);
		btn8.setEnabled(false);
		btn9.setEnabled(false);
		btn10.setEnabled(false);
		btn11.setEnabled(false);
		btn12.setEnabled(false);
		btn13.setEnabled(false);
		btn14.setEnabled(false);
		btn18.setEnabled(false);
		btn19.setEnabled(false);
		btn20.setEnabled(false);
		btn24.setEnabled(false);
		btn25.setEnabled(false);
		btn26.setEnabled(false);
		btn30.setEnabled(false);
		btn31.setEnabled(false);
		btn32.setEnabled(false);
		btn33.setEnabled(false);
		btn34.setEnabled(false);
		btn35.setEnabled(false);
		btnend.setEnabled(false);
		countbtn+=1;
		
		if(values15==1 && values16==1 && values17==1 && values21==1
				&& values23==1&& values28==1&& values29==1
				&& values27==1){
			Intent error=new Intent(v.getContext(),Outmoves.class);
			startActivityForResult(error,0);
			finish();}}	
});

btn23.setOnClickListener(new OnClickListener(){

	@Override
	public void onClick(View v) {
		if(values16==1){
			btn16.setEnabled(false);
			btn16.setBackgroundResource(R.drawable.crash);}
		if(values17==1){
			btn17.setEnabled(false);
			btn17.setBackgroundResource(R.drawable.crash);}
		if(values18==1){
			btn18.setEnabled(false);
			btn18.setBackgroundResource(R.drawable.crash);}
		if(values22==1){
			btn22.setEnabled(false);
			btn22.setBackgroundResource(R.drawable.crash);}
		if(values24==1){
			btn24.setEnabled(false);
			btn24.setBackgroundResource(R.drawable.crash);}
		if(values28==1){
			btn28.setEnabled(false);
			btn28.setBackgroundResource(R.drawable.crash);}
		if(values29==1){
			btn29.setEnabled(false);
			btn29.setBackgroundResource(R.drawable.crash);}
		if(values30==1){
			btn30.setEnabled(false);
			btn30.setBackgroundResource(R.drawable.crash);}
	
		if(values16==0){
			btn16.setEnabled(true);}
		if(values17==0){
			btn17.setEnabled(true);}
		if(values18==0){
			btn18.setEnabled(true);}
		if(values22==0){
			btn22.setEnabled(true);}
		if(values24==0){
			btn24.setEnabled(true);}
		if(values28==0){
			btn28.setEnabled(true);}
		if(values29==0){
			btn29.setEnabled(true);}
		if(values30==0){
			btn30.setEnabled(true);}
		
		values23=+1;
		btn23.setEnabled(false);
		btnend.setBackgroundResource(R.drawable.block);
		btn23.setBackgroundResource(R.drawable.tap);
		btn2.setEnabled(false);
		btn3.setEnabled(false);
		btn4.setEnabled(false);
		btn5.setEnabled(false);
		btn6.setEnabled(false);
		btn7.setEnabled(false);
		btn8.setEnabled(false);
		btn9.setEnabled(false);
		btn10.setEnabled(false);
		btn11.setEnabled(false);
		btn12.setEnabled(false);
		btn13.setEnabled(false);
		btn14.setEnabled(false);
		btn15.setEnabled(false);
		btn19.setEnabled(false);
		btn20.setEnabled(false);
		btn21.setEnabled(false);
		btn25.setEnabled(false);
		btn26.setEnabled(false);
		btn27.setEnabled(false);
		btn31.setEnabled(false);
		btn32.setEnabled(false);
		btn33.setEnabled(false);
		btn34.setEnabled(false);
		btn35.setEnabled(false);
		btnend.setEnabled(false);
		countbtn+=1;
		
		if(values16==1 && values17==1 && values18==1 && values22==1
				&& values24==1&& values28==1&& values29==1
				&& values30==1){
			Intent error=new Intent(v.getContext(),Outmoves.class);
			startActivityForResult(error,0);
			finish();}}
	
});

btn24.setOnClickListener(new OnClickListener(){

	@Override
	public void onClick(View v) {
		if(values23==1){
			btn23.setEnabled(false);
			btn23.setBackgroundResource(R.drawable.crash);}
		if(values17==1){
			btn17.setEnabled(false);
			btn17.setBackgroundResource(R.drawable.crash);}
		if(values18==1){
			btn18.setEnabled(false);
			btn18.setBackgroundResource(R.drawable.crash);}
		if(values29==1){
			btn29.setEnabled(false);
			btn29.setBackgroundResource(R.drawable.crash);}
		if(values30==1){
			btn30.setEnabled(false);
			btn30.setBackgroundResource(R.drawable.crash);}
	
		if(values23==0){
			btn23.setEnabled(true);}
		if(values17==0){
			btn17.setEnabled(true);}
		if(values18==0){
			btn18.setEnabled(true);}
		if(values29==0){
			btn29.setEnabled(true);}
		if(values30==0){
			btn30.setEnabled(true);}
		
		values24=+1;
		btnend.setBackgroundResource(R.drawable.block);
		btn24.setBackgroundResource(R.drawable.tap);
		btn24.setEnabled(false);
		btn2.setEnabled(false);
		btn3.setEnabled(false);
		btn4.setEnabled(false);
		btn5.setEnabled(false);
		btn6.setEnabled(false);
		btn7.setEnabled(false);
		btn8.setEnabled(false);
		btn9.setEnabled(false);
		btn10.setEnabled(false);
		btn11.setEnabled(false);
		btn12.setEnabled(false);
		btn13.setEnabled(false);
		btn14.setEnabled(false);
		btn15.setEnabled(false);
		btn16.setEnabled(false);
		btn19.setEnabled(false);
		btn20.setEnabled(false);
		btn21.setEnabled(false);
		btn22.setEnabled(false);
		btn25.setEnabled(false);
		btn26.setEnabled(false);
		btn27.setEnabled(false);
		btn28.setEnabled(false);
		btn31.setEnabled(false);
		btn32.setEnabled(false);
		btn33.setEnabled(false);
		btn34.setEnabled(false);
		btn35.setEnabled(false);
		btnend.setEnabled(false);
		countbtn+=1;
		if(values17==1 && values18==1 && values23==1 && values29==1
				&& values30==1){
			Intent error=new Intent(v.getContext(),Outmoves.class);
			startActivityForResult(error,0);
			finish();}}
});

btn25.setOnClickListener(new OnClickListener(){

	@Override
	public void onClick(View v) {
		if(values19==1){
			btn19.setEnabled(false);
			btn19.setBackgroundResource(R.drawable.crash);}
		if(values20==1){
			btn20.setEnabled(false);
			btn20.setBackgroundResource(R.drawable.crash);}
		if(values26==1){
			btn26.setEnabled(false);
			btn26.setBackgroundResource(R.drawable.crash);}
		if(values31==1){
			btn31.setEnabled(false);
			btn31.setBackgroundResource(R.drawable.crash);}
		if(values32==1){
			btn32.setEnabled(false);
			btn32.setBackgroundResource(R.drawable.crash);}
	
		if(values19==0){
			btn19.setEnabled(true);}
		if(values20==0){
			btn20.setEnabled(true);}
		if(values26==0){
			btn26.setEnabled(true);}
		if(values31==0){
			btn31.setEnabled(true);}
		if(values32==0){
			btn32.setEnabled(true);}
		
		values25=+1;
		btn25.setBackgroundResource(R.drawable.tap);
		btn25.setEnabled(false);
		btn2.setEnabled(false);
		btn3.setEnabled(false);
		btn4.setEnabled(false);
		btn5.setEnabled(false);
		btn6.setEnabled(false);
		btn7.setEnabled(false);
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
		btn21.setEnabled(false);
		btn22.setEnabled(false);
		btn23.setEnabled(false);
		btn24.setEnabled(false);
		btn27.setEnabled(false);
		btn28.setEnabled(false);
		btn29.setEnabled(false);
		btn30.setEnabled(false);
		btn33.setEnabled(false);
		btn34.setEnabled(false);
		btn35.setEnabled(false);
		btnend.setEnabled(false);
		countbtn+=1;
		
		if(values19==1 && values20==1 && values26==1 && values31==1
				&& values32==1){
			Intent error=new Intent(v.getContext(),Outmoves.class);
			startActivityForResult(error,0);
			finish();}}
	
});

btn26.setOnClickListener(new OnClickListener(){

	@Override
	public void onClick(View v) {
		if(values19==1){
			btn19.setEnabled(false);
			btn19.setBackgroundResource(R.drawable.crash);}
		if(values20==1){
			btn20.setEnabled(false);
			btn20.setBackgroundResource(R.drawable.crash);}
		if(values25==1){
			btn25.setEnabled(false);
			btn25.setBackgroundResource(R.drawable.crash);}
		if(values27==1){
			btn27.setEnabled(false);
			btn27.setBackgroundResource(R.drawable.crash);}
		if(values31==1){
			btn31.setEnabled(false);
			btn31.setBackgroundResource(R.drawable.crash);}
		if(values32==1){
			btn32.setEnabled(false);
			btn32.setBackgroundResource(R.drawable.crash);}
		if(values33==1){
			btn33.setEnabled(false);
			btn33.setBackgroundResource(R.drawable.crash);}
		if(values21==1){
			btn21.setEnabled(false);
			btn21.setBackgroundResource(R.drawable.crash);}
	
		if(values19==0){
			btn19.setEnabled(true);}
		if(values20==0){
			btn20.setEnabled(true);}
		if(values25==0){
			btn25.setEnabled(true);}
		if(values27==0){
			btn27.setEnabled(true);}
		if(values31==0){
			btn31.setEnabled(true);}
		if(values32==0){
			btn32.setEnabled(true);}
		if(values33==0){
			btn33.setEnabled(true);}
		if(values21==0){
			btn21.setEnabled(true);}
		
		values26+=1;
		btn26.setEnabled(false);
		btn26.setBackgroundResource(R.drawable.tap);
		btn2.setEnabled(false);
		btn3.setEnabled(false);
		btn4.setEnabled(false);
		btn5.setEnabled(false);
		btn6.setEnabled(false);
		btn7.setEnabled(false);
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
		btn22.setEnabled(false);
		btn23.setEnabled(false);
		btn24.setEnabled(false);
		btn28.setEnabled(false);
		btn29.setEnabled(false);
		btn30.setEnabled(false);
		btn34.setEnabled(false);
		btn35.setEnabled(false);
		btnend.setEnabled(false);
		countbtn+=1;
		
		if(values19==1 && values20==1 && values21==1 && values25==1
				&& values27==1&& values31==1&& values32==1
				&& values33==1){
			Intent error=new Intent(v.getContext(),Outmoves.class);
			startActivityForResult(error,0);
			finish();}}
	
});

btn27.setOnClickListener(new OnClickListener(){

	@Override
	public void onClick(View v) {
		if(values20==1){
			btn20.setEnabled(false);
			btn20.setBackgroundResource(R.drawable.crash);}
		if(values21==1){
			btn21.setEnabled(false);
			btn21.setBackgroundResource(R.drawable.crash);}
		if(values22==1){
			btn22.setEnabled(false);
			btn22.setBackgroundResource(R.drawable.crash);}
		if(values26==1){
			btn26.setEnabled(false);
			btn26.setBackgroundResource(R.drawable.crash);}
		if(values28==1){
			btn28.setEnabled(false);
			btn28.setBackgroundResource(R.drawable.crash);}
		if(values32==1){
			btn32.setEnabled(false);
			btn32.setBackgroundResource(R.drawable.crash);}
		if(values33==1){
			btn33.setEnabled(false);
			btn33.setBackgroundResource(R.drawable.crash);}
		if(values34==1){
			btn34.setEnabled(false);
			btn34.setBackgroundResource(R.drawable.crash);}
	
		if(values20==0){
			btn20.setEnabled(true);}
		if(values21==0){
			btn21.setEnabled(true);}
		if(values22==0){
			btn22.setEnabled(true);}
		if(values26==0){
			btn26.setEnabled(true);}
		if(values28==0){
			btn28.setEnabled(true);}
		if(values32==0){
			btn32.setEnabled(true);}
		if(values33==0){
			btn33.setEnabled(true);}
		if(values34==0){
			btn34.setEnabled(true);}

		values27+=1;
		btn27.setEnabled(false);
		btn27.setBackgroundResource(R.drawable.tap);
		btn2.setEnabled(false);
		btn3.setEnabled(false);
		btn4.setEnabled(false);
		btn5.setEnabled(false);
		btn6.setEnabled(false);
		btn7.setEnabled(false);
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
		btn23.setEnabled(false);
		btn24.setEnabled(false);
		btn25.setEnabled(false);
		btn29.setEnabled(false);
		btn30.setEnabled(false);
		btn31.setEnabled(false);
		btn35.setEnabled(false);
		btnend.setEnabled(false);
		countbtn+=1;
		
		if(values20==1 && values21==1 && values22==1 && values26==1
				&& values28==1&& values32==1&& values33==1
				&& values34==1){
			Intent error=new Intent(v.getContext(),Outmoves.class);
			startActivityForResult(error,0);
			finish();}}
	
});

btn28.setOnClickListener(new OnClickListener(){

	@Override
	public void onClick(View v) {
		if(values23==1){
			btn23.setEnabled(false);
			btn23.setBackgroundResource(R.drawable.crash);}
		if(values21==1){
			btn21.setEnabled(false);
			btn21.setBackgroundResource(R.drawable.crash);}
		if(values22==1){
			btn22.setEnabled(false);
			btn22.setBackgroundResource(R.drawable.crash);}
		if(values27==1){
			btn27.setEnabled(false);
			btn27.setBackgroundResource(R.drawable.crash);}
		if(values29==1){
			btn29.setEnabled(false);
			btn29.setBackgroundResource(R.drawable.crash);}
		if(values35==1){
			btn35.setEnabled(false);
			btn35.setBackgroundResource(R.drawable.crash);}
		if(values33==1){
			btn33.setEnabled(false);
			btn33.setBackgroundResource(R.drawable.crash);}
		if(values34==1){
			btn34.setEnabled(false);
			btn34.setBackgroundResource(R.drawable.crash);}
	
		if(values23==0){
			btn23.setEnabled(true);}
		if(values21==0){
			btn21.setEnabled(true);}
		if(values22==0){
			btn22.setEnabled(true);}
		if(values27==0){
			btn27.setEnabled(true);}
		if(values29==0){
			btn29.setEnabled(true);}
		if(values35==0){
			btn35.setEnabled(true);}
		if(values33==0){
			btn33.setEnabled(true);}
		if(values34==0){
			btn34.setEnabled(true);}

		values28=+1;
		btn28.setEnabled(false);
		btn28.setBackgroundResource(R.drawable.tap);
		btn2.setEnabled(false);
		btn3.setEnabled(false);
		btn4.setEnabled(false);
		btn5.setEnabled(false);
		btn6.setEnabled(false);
		btn7.setEnabled(false);
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
		btn24.setEnabled(false);
		btn25.setEnabled(false);
		btn26.setEnabled(false);
		btn30.setEnabled(false);
		btn31.setEnabled(false);
		btn32.setEnabled(false);
		btnend.setEnabled(false);
		countbtn+=1;
		
		if(values21==1 && values22==1 && values23==1 && values27==1
				&& values29==1&& values33==1&& values34==1
				&& values35==1){
			Intent error=new Intent(v.getContext(),Outmoves.class);
			startActivityForResult(error,0);
			finish();}}
	
});

btn29.setOnClickListener(new OnClickListener(){

	@Override
	public void onClick(View v) {
		if(values23==1){
			btn23.setEnabled(false);
			btn23.setBackgroundResource(R.drawable.crash);}
		if(values24==1){
			btn24.setEnabled(false);
			btn24.setBackgroundResource(R.drawable.crash);}
		if(values22==1){
			btn22.setEnabled(false);
			btn22.setBackgroundResource(R.drawable.crash);}
		if(values28==1){
			btn28.setEnabled(false);
			btn28.setBackgroundResource(R.drawable.crash);}
		if(values30==1){
			btn30.setEnabled(false);
			btn30.setBackgroundResource(R.drawable.crash);}
		if(values34==1){
			btn34.setEnabled(false);
			btn34.setBackgroundResource(R.drawable.crash);}
		if(values35==1){
			btn35.setEnabled(false);
			btn35.setBackgroundResource(R.drawable.crash);}
	
		if(values23==0){
			btn23.setEnabled(true);}
		if(values24==0){
			btn24.setEnabled(true);}
		if(values22==0){
			btn22.setEnabled(true);}
		if(values28==0){
			btn28.setEnabled(true);}
		if(values30==0){
			btn30.setEnabled(true);}
		if(values34==0){
			btn34.setEnabled(true);}
		if(values35==0){
			btn35.setEnabled(true);}

		btn29.setBackgroundResource(R.drawable.tap);
		values29+=1;
		btn29.setEnabled(false);
		btn2.setEnabled(false);
		btn3.setEnabled(false);
		btn4.setEnabled(false);
		btn5.setEnabled(false);
		btn6.setEnabled(false);
		btn7.setEnabled(false);
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
		btn25.setEnabled(false);
		btn26.setEnabled(false);
		btn27.setEnabled(false);
		btn31.setEnabled(false);
		btn32.setEnabled(false);
		btn33.setEnabled(false);
		
		countbtn+=1;
		valuesend+=1;
		if(values22==1 && values23==1 && values24==1 && values28==1
				&& values30==1&& values34==1&& values35==1){
			if(valuesend==1 || valuesend==2){
			Intent error=new Intent(v.getContext(),Outmoves.class);
			startActivityForResult(error,0);
			finish();}
			if(countx==0){
				Intent error=new Intent(v.getContext(),Outmoves.class);
				startActivityForResult(error,0);
				finish();
			}
			if(countx==1){
				Intent error=new Intent(v.getContext(),Outmoves.class);
				startActivityForResult(error,0);
				finish();
			}
			if(countx==2){
				Intent error=new Intent(v.getContext(),Outmoves.class);
				startActivityForResult(error,0);
				finish();
			}
	
		}
		if(countx==3){
			btnend.setEnabled(true);
			btnend.setBackgroundResource(R.drawable.castle);
		}
		
		
	}
	
});

btn30.setOnClickListener(new OnClickListener(){

	@Override
	public void onClick(View v) {
		if(values23==1){
			btn23.setEnabled(false);
			btn23.setBackgroundResource(R.drawable.crash);}
		if(values24==1){
			btn24.setEnabled(false);
			btn24.setBackgroundResource(R.drawable.crash);}
		if(values29==1){
			btn29.setEnabled(false);
			btn29.setBackgroundResource(R.drawable.crash);}
		if(values35==1){
			btn35.setEnabled(false);
			btn35.setBackgroundResource(R.drawable.crash);}
	
		if(values23==0){
			btn23.setEnabled(true);}
		if(values24==0){
			btn24.setEnabled(true);}
		if(values29==0){
			btn29.setEnabled(true);}
		if(values35==0){
			btn35.setEnabled(true);}
		
		values30+=1;
		btn30.setBackgroundResource(R.drawable.tap);
		btn30.setEnabled(false);
		btn2.setEnabled(false);
		btn3.setEnabled(false);
		btn4.setEnabled(false);
		btn5.setEnabled(false);
		btn6.setEnabled(false);
		btn7.setEnabled(false);
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
		btn25.setEnabled(false);
		btn26.setEnabled(false);
		btn27.setEnabled(false);
		btn28.setEnabled(false);
		btn31.setEnabled(false);
		btn32.setEnabled(false);
		btn33.setEnabled(false);
		btn34.setEnabled(false);
		
		countbtn+=1;
		valuesend+=1;
		if(values23==1 && values24==1 && values29==1 && values35==1){
			if(valuesend==1 || valuesend==2 ){
			Intent error=new Intent(v.getContext(),Outmoves.class);
			startActivityForResult(error,0);
			finish();}
			if(countx==0){
				Intent error=new Intent(v.getContext(),Outmoves.class);
				startActivityForResult(error,0);
				finish();
			}
			if(countx==1){
				Intent error=new Intent(v.getContext(),Outmoves.class);
				startActivityForResult(error,0);
				finish();
			}
			if(countx==2){
				Intent error=new Intent(v.getContext(),Outmoves.class);
				startActivityForResult(error,0);
				finish();
				
				
			}		}
			if(countx==3){
				btnend.setEnabled(true);
				btnend.setBackgroundResource(R.drawable.castle);
			}
		
	}
	
});

btn31.setOnClickListener(new OnClickListener(){

	@Override
	public void onClick(View v) {
		if(values25==1){
			btn25.setEnabled(false);
			btn25.setBackgroundResource(R.drawable.crash);}
		if(values26==1){
			btn26.setEnabled(false);
			btn26.setBackgroundResource(R.drawable.crash);}
		if(values32==1){
			btn32.setEnabled(false);
			btn32.setBackgroundResource(R.drawable.crash);}
	
		if(values25==0){
			btn25.setEnabled(true);}
		if(values26==0){
			btn26.setEnabled(true);}
		if(values32==0){
			btn32.setEnabled(true);}
		
		values31+=1;
		btn31.setEnabled(false);
		btn31.setBackgroundResource(R.drawable.tap);
		btn2.setEnabled(false);
		btn3.setEnabled(false);
		btn4.setEnabled(false);
		btn5.setEnabled(false);
		btn6.setEnabled(false);
		btn7.setEnabled(false);
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
		btn27.setEnabled(false);
		btn28.setEnabled(false);
		btn29.setEnabled(false);
		btn30.setEnabled(false);
		btn33.setEnabled(false);
		btn34.setEnabled(false);
		btn35.setEnabled(false);
		btnend.setEnabled(false);
		countbtn+=1;
		
		if(values25==1 && values26==1 && values32==1){
			Intent error=new Intent(v.getContext(),Outmoves.class);
			startActivityForResult(error,0);
			finish();}}
	
});

btn32.setOnClickListener(new OnClickListener(){

	@Override
	public void onClick(View v) {
		if(values25==1){
			btn25.setEnabled(false);
			btn25.setBackgroundResource(R.drawable.crash);}
		if(values26==1){
			btn26.setEnabled(false);
			btn26.setBackgroundResource(R.drawable.crash);}
		if(values27==1){
			btn27.setEnabled(false);
			btn27.setBackgroundResource(R.drawable.crash);}
		if(values31==1){
			btn31.setEnabled(false);
			btn31.setBackgroundResource(R.drawable.crash);}
		if(values33==1){
			btn33.setEnabled(false);
			btn33.setBackgroundResource(R.drawable.crash);}
	
		if(values25==0){
			btn25.setEnabled(true);}
		if(values26==0){
			btn26.setEnabled(true);}
		if(values27==0){
			btn27.setEnabled(true);}
		if(values31==0){
			btn31.setEnabled(true);}
		if(values33==0){
			btn33.setEnabled(true);}

		values32+=1;
		btn32.setBackgroundResource(R.drawable.tap);
		btn32.setEnabled(false);
		btn2.setEnabled(false);
		btn3.setEnabled(false);
		btn4.setEnabled(false);
		btn5.setEnabled(false);
		btn6.setEnabled(false);
		btn7.setEnabled(false);
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
		btn28.setEnabled(false);
		btn29.setEnabled(false);
		btn30.setEnabled(false);
		btn34.setEnabled(false);
		btn35.setEnabled(false);
		btnend.setEnabled(false);
		countbtn+=1;
		if(values25==1 && values26==1 && values27==1 && values31==1
				&& values33==1){
			Intent error=new Intent(v.getContext(),Outmoves.class);
			startActivityForResult(error,0);
			finish();}}
	
});
btn33.setOnClickListener(new OnClickListener(){

	@Override
	public void onClick(View v) {
		if(values28==1){
			btn28.setEnabled(false);
			btn28.setBackgroundResource(R.drawable.crash);}
		if(values26==1){
			btn26.setEnabled(false);
			btn26.setBackgroundResource(R.drawable.crash);}
		if(values27==1){
			btn27.setEnabled(false);
			btn27.setBackgroundResource(R.drawable.crash);}
		if(values32==1){
			btn32.setEnabled(false);
			btn32.setBackgroundResource(R.drawable.crash);}
		if(values34==1){
			btn34.setEnabled(false);
			btn34.setBackgroundResource(R.drawable.crash);}
	
		if(values28==0){
			btn28.setEnabled(true);}
		if(values26==0){
			btn26.setEnabled(true);}
		if(values27==0){
			btn27.setEnabled(true);}
		if(values32==0){
			btn32.setEnabled(true);}
		if(values34==0){
			btn34.setEnabled(true);}

		values33+=1;
		btn33.setEnabled(false);
		btn33.setBackgroundResource(R.drawable.tap);
		btn2.setEnabled(false);
		btn3.setEnabled(false);
		btn4.setEnabled(false);
		btn5.setEnabled(false);
		btn6.setEnabled(false);
		btn7.setEnabled(false);
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
		btn29.setEnabled(false);
		btn30.setEnabled(false);
		btn31.setEnabled(false);
		btn35.setEnabled(false);
		btnend.setEnabled(false);
		countbtn+=1;
		if(values26==1 && values27==1 && values28==1 && values32==1
				&& values34==1){
			Intent error=new Intent(v.getContext(),Outmoves.class);
			startActivityForResult(error,0);
			finish();}}
	
});

btn34.setOnClickListener(new OnClickListener(){

	@Override
	public void onClick(View v) {
		if(values28==1){
			btn28.setEnabled(false);
			btn28.setBackgroundResource(R.drawable.crash);}
		if(values29==1){
			btn29.setEnabled(false);
			btn29.setBackgroundResource(R.drawable.crash);}
		if(values27==1){
			btn27.setEnabled(false);
			btn27.setBackgroundResource(R.drawable.crash);}
		if(values33==1){
			btn33.setEnabled(false);
			btn33.setBackgroundResource(R.drawable.crash);}
		if(values35==1){
			btn35.setEnabled(false);
			btn35.setBackgroundResource(R.drawable.crash);}
	
		if(values28==0){
			btn28.setEnabled(true);}
		if(values29==0){
			btn29.setEnabled(true);}
		if(values27==0){
			btn27.setEnabled(true);}
		if(values33==0){
			btn33.setEnabled(true);}
		if(values35==0){
			btn35.setEnabled(true);}

		values34+=1;
		btn34.setEnabled(false);
		btn34.setBackgroundResource(R.drawable.tap);
		btnend.setBackgroundResource(R.drawable.block);
		btn2.setEnabled(false);
		btn3.setEnabled(false);
		btn4.setEnabled(false);
		btn5.setEnabled(false);
		btn6.setEnabled(false);
		btn7.setEnabled(false);
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
		btn30.setEnabled(false);
		btn31.setEnabled(false);
		btn32.setEnabled(false);
		btnend.setEnabled(false);
		if(values27==1 && values28==1 && values29==1 && values33==1
				&& values35==1){
			Intent error=new Intent(v.getContext(),Outmoves.class);
			startActivityForResult(error,0);
			finish();}
		countx+=1;
		countbtn+=1;
	}
	
});
btn35.setOnClickListener(new OnClickListener(){

	@Override
	public void onClick(View v) {
		
		
		if(values28==1){
			btn28.setEnabled(false);
			btn28.setBackgroundResource(R.drawable.crash);}
		if(values29==1){
			btn29.setEnabled(false);
			btn29.setBackgroundResource(R.drawable.crash);}
		if(values30==1){
			btn30.setEnabled(false);
			btn30.setBackgroundResource(R.drawable.crash);}
		if(values34==1){
			btn34.setEnabled(false);
			btn34.setBackgroundResource(R.drawable.crash);}
		
	
		if(values28==0){
			btn28.setEnabled(true);}
		if(values29==0){
			btn29.setEnabled(true);}
		if(values30==0){
			btn30.setEnabled(true);}
		if(values34==0){
			btn34.setEnabled(true);}
		
		values35+=1;
		btn35.setBackgroundResource(R.drawable.tap);
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
		btn31.setEnabled(false);
		btn32.setEnabled(false);
		btn33.setEnabled(false);
		
		countbtn+=1;
		valuesend+=1;
		if(values28==1 && values29==1 && values30==1 
				&& values34==1){
			if(valuesend==1 || valuesend==2){
			Intent error=new Intent(v.getContext(),Outmoves.class);
			startActivityForResult(error,0);
			finish();}
			
			
			if(countx==0){
				Intent error=new Intent(v.getContext(),Outmoves.class);
				startActivityForResult(error,0);
				finish();
			}
			if(countx==1){
				Intent error=new Intent(v.getContext(),Outmoves.class);
				startActivityForResult(error,0);
				finish();
			}
			if(countx==2){
				Intent error=new Intent(v.getContext(),Outmoves.class);
				startActivityForResult(error,0);
				finish();
			}
			
			
		}
		if(countx==3){
			btnend.setEnabled(true);
			btnend.setBackgroundResource(R.drawable.castle);
		}
		
	}
	
});

btnend.setOnClickListener(new OnClickListener(){

	@Override
	public void onClick(View v) {
		
	int scores=36-countbtn;
	if(scores==24){
		String score= scores+"";
		String totalclick=countbtn+"";
		String totalscores=scores+"";	
		String status="Perfect!";
		Intent resulta = new Intent(v.getContext(),Result.class);
		resulta.putExtra("totalscores", totalscores);
		resulta.putExtra("totalclick", totalclick);
		resulta.putExtra("status", status);
		startActivityForResult(resulta,0);
		finish();
	}
	
	else if(scores<24 && scores>=15){
		String totalclick=countbtn+"";
		String totalscores=scores+"";	
		String status="Good!";
		String score= scores+"";
		Intent resulta = new Intent(v.getContext(),Result.class);
		resulta.putExtra("totalscores", totalscores);
		resulta.putExtra("totalclick", totalclick);
		resulta.putExtra("status", status);
		startActivityForResult(resulta,0);
		
		finish();
		
	}
	
	else if(scores<15 && scores>=10){
		String totalclick=countbtn+"";
		String totalscores=scores+"";	
		String status="Weak!";
		String score= scores+"";
	
		
		Intent resulta = new Intent(v.getContext(),Result.class);
		
		resulta.putExtra("totalscores", totalscores);
		resulta.putExtra("totalclick", totalclick);
		resulta.putExtra("status", status);
		startActivityForResult(resulta,0);
		finish();
	}
	else if(scores<10 && scores>=0){
		String totalclick=countbtn+"";
		String totalscores=scores+"";	
		String status="Noob!";
		String score= scores+"";
		
		Intent resulta = new Intent(v.getContext(),Result.class);
		resulta.putExtra("totalscores", totalscores);
		resulta.putExtra("totalclick", totalclick);
		resulta.putExtra("status", status);
		startActivityForResult(resulta,0);
		
		finish();}
	
	}
	
});
		
		
		
	}//end of upper

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
