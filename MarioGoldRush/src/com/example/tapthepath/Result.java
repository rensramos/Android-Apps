package com.example.tapthepath;



import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Result extends Activity {
	Datahandler handlerss;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.result);
		
		Intent score=getIntent();
		Intent click=getIntent();
		Intent status=getIntent();
		String totalscore=score.getStringExtra("totalscores");
		String totalclick=click.getStringExtra("totalclick");
		String fstatus=status.getStringExtra("status");
		
		TextView aclick=(TextView)findViewById(R.id.textView3);
		 final TextView ascore=(TextView)findViewById(R.id.textView4);
		TextView astatus=(TextView)findViewById(R.id.textView5);
		
		aclick.setText("Total Clicked:"+totalclick);
		ascore.setText("Score:"+totalscore);
		astatus.setText("Status:"+fstatus);
		Button btnmain=(Button)findViewById(R.id.button1);
		Button exit=(Button)findViewById(R.id.button2);
		Button scoreboard=(Button)findViewById(R.id.button3);
		String scorefinal=totalscore+"";
		handlerss = new Datahandler(getBaseContext());
		handlerss.open();
		handlerss.insertData(scorefinal);
		handlerss.close();
		btnmain.setOnClickListener(new OnClickListener(){

			
			@Override
			public void onClick(View v) {
				Intent play=new Intent(v.getContext(),MainActivity.class);
				startActivityForResult(play,0);
				finish();}
		});
		
		exit.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				finish();
			}
			
		});
		
		scoreboard.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				String scoress="";
				handlerss = new Datahandler(getBaseContext());
				handlerss.open();
				Cursor n =handlerss.returnData();
				if(n.moveToFirst()){
				do{
					scoress=scoress+"\n"+n.getString(0);}
					while(n.moveToNext());}
				handlerss.close();
				Toast t =Toast.makeText(getBaseContext(), "Scoreboard"+scoress, Toast.LENGTH_LONG);
				t.show();}
		});
}

}