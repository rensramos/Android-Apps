package com.example.rensrestaurant;

import java.text.DecimalFormat;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class Final extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.finallayout);
		
	Intent name =getIntent();
	Intent total=getIntent();
	Intent ordertype=getIntent();
	
	String nameko=name.getStringExtra("name");
	String totalko=total.getStringExtra("total");
	String ordertypeko=ordertype.getStringExtra("order");
	
	TextView tvname=(TextView)findViewById(R.id.textView1);
	TextView tvorder=(TextView)findViewById(R.id.textView3);
	TextView tvtotal=(TextView)findViewById(R.id.textView4);
	tvname.setText("CustomerName:"+nameko);
	tvorder.setText("OrderType:"+ordertypeko);
	tvtotal.setText("TotalBill:P"+totalko+".00");

	}
}
