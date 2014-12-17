package com.example.actebete;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.widget.TextView;

public class result extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result);
        final TextView tv1=(TextView)findViewById(R.id.tt1);
        final TextView tv2=(TextView)findViewById(R.id.tt2);
        final TextView tv3=(TextView)findViewById(R.id.tt3);
        Intent get3=getIntent();
        String name=get3.getStringExtra("name");
        int price=Integer.parseInt(get3.getStringExtra("price"));
        int norder=Integer.parseInt(get3.getStringExtra("norder"));
        int total=0;
        String order=get3.getStringExtra("order");
        if(order.equals("pizza")){
        	tv1.setText("Hello "+name);
        	total=price*norder;
        	tv2.setText("Your Bill is: "+total);
        	tv3.setText(order);
        	
        }
        if(order.equals("Tea")){
        	tv1.setText("Hello "+name);
        	total=price*norder;
        	tv2.setText("Your Bill is: "+total);
        	tv3.setText(order);
        	
        }
        
    }

    
}