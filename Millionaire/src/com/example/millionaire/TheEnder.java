package com.example.millionaire;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class TheEnder extends Activity{
	public static int oo=0;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ender);
		Intent max3=getIntent();
		String names3=max3.getStringExtra("ValuePass6");
		TextView tv2=(TextView)findViewById(R.id.textView8);
		tv2.setText(names3+" "+ "Your Total score is"+" "+Page5.t);
		
		Button ret=(Button)findViewById(R.id.button1);
		ret.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View p) {
				// TODO Auto-generated method stub
				oo=1;
				Intent hj=new Intent(p.getContext(),MillionaireIto.class);
				startActivityForResult(hj,0);
			}
			
		});
	}
}
