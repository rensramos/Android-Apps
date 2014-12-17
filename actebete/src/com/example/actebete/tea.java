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

public class tea extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tea);
        final Button b1=(Button)findViewById(R.id.bb1);
        final Button b2=(Button)findViewById(R.id.bb2);
        final Button b3=(Button)findViewById(R.id.bb3);
        final Button b4=(Button)findViewById(R.id.bb4);
        final Button b5=(Button)findViewById(R.id.bb5);
        final Button b6=(Button)findViewById(R.id.bb6);
        final Button b7=(Button)findViewById(R.id.bb7);
        final Button b8=(Button)findViewById(R.id.bb8);
        final Button b9=(Button)findViewById(R.id.bb9);
        final Button b10=(Button)findViewById(R.id.bb0);
        final Button b11=(Button)findViewById(R.id.next3);
        final EditText et1=(EditText)findViewById(R.id.et1);
        final RadioButton r1=(RadioButton)findViewById(R.id.rr0);
        final RadioButton r2=(RadioButton)findViewById(R.id.rr1);
        final RadioButton r3=(RadioButton)findViewById(R.id.rr2);
        final TextView tv1=(TextView)findViewById(R.id.tt1);
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
				Intent get11=getIntent();
				String name=get11.getStringExtra("name");
				Intent intents=new Intent(x.getContext(),result.class);
			if(r1.isChecked()){
				intents.putExtra("norder",et1.getText()+"");
				intents.putExtra("order",tv1.getText()+"");
				intents.putExtra("name",name);
				intents.putExtra("price","50");
				startActivityForResult(intents,0);				
			}
			if(r2.isChecked()){
				intents.putExtra("norder",et1.getText()+"");
				intents.putExtra("order",tv1.getText()+"");
				intents.putExtra("name",name);
				intents.putExtra("price","60");
				startActivityForResult(intents,0);
			}
			if(r3.isChecked()){
				intents.putExtra("norder",et1.getText()+"");
				intents.putExtra("order",tv1.getText()+"");
				intents.putExtra("name",name);
				intents.putExtra("price","70");
				startActivityForResult(intents,0);
			}
			
			
				
			}});
    }
}