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
import android.widget.TextView;

public class pizza extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pizza);
        final Button b1=(Button)findViewById(R.id.b1);
        final Button b2=(Button)findViewById(R.id.b2);
        final Button b3=(Button)findViewById(R.id.b3);
        final Button b4=(Button)findViewById(R.id.b4);
        final Button b5=(Button)findViewById(R.id.b5);
        final Button b6=(Button)findViewById(R.id.b6);
        final Button b7=(Button)findViewById(R.id.b7);
        final Button b8=(Button)findViewById(R.id.b8);
        final Button b9=(Button)findViewById(R.id.b9);
        final Button b10=(Button)findViewById(R.id.b0);
        final Button b11=(Button)findViewById(R.id.next2);
        final EditText et1=(EditText)findViewById(R.id.et);
        final RadioButton r1=(RadioButton)findViewById(R.id.r0);
        final RadioButton r2=(RadioButton)findViewById(R.id.r1);
        final RadioButton r3=(RadioButton)findViewById(R.id.r2);
        final TextView tv1=(TextView)findViewById(R.id.t1);
        b1.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				et1.setText(et1.getText()+"1");
				
			}});
        b2.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				et1.setText(et1.getText()+"2");
				
			}});
        b3.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				et1.setText(et1.getText()+"3");
				
			}});
        b4.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				et1.setText(et1.getText()+"4");
				
			}});
        b5.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				et1.setText(et1.getText()+"5");
				
			}});
        b6.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				et1.setText(et1.getText()+"6");
				
			}});
        b7.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				et1.setText(et1.getText()+"7");
				
			}});
        b8.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				et1.setText(et1.getText()+"8");
				
			}});
        b9.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				et1.setText(et1.getText()+"9");
				
			}});
        b10.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				et1.setText(et1.getText()+"0");
				
			}});
        b11.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View x) {
				// TODO Auto-generated method stub
				Intent get1=getIntent();
				String name=get1.getStringExtra("name");
				Intent intentss=new Intent(x.getContext(),result.class);
			if(r1.isChecked()){
				intentss.putExtra("norder",et1.getText()+"");
				intentss.putExtra("order",tv1.getText()+"");
				intentss.putExtra("name",name);
				intentss.putExtra("price","100");
				startActivityForResult(intentss,0);				
			}
			if(r2.isChecked()){
				intentss.putExtra("norder",et1.getText()+"");
				intentss.putExtra("order",tv1.getText()+"");
				intentss.putExtra("name",name);
				intentss.putExtra("price","200");
				startActivityForResult(intentss,0);
			}
			if(r3.isChecked()){
				intentss.putExtra("norder",et1.getText()+"");
				intentss.putExtra("order",tv1.getText()+"");
				intentss.putExtra("name",name);
				intentss.putExtra("price","300");
				startActivityForResult(intentss,0);
			}
			
			
				
			}});
    }


}