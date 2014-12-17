package com.example.databaseitu;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Datahandler{
	
	public static final String score = "score";
	public static final String TNAME = "scoreboard";
	public static final String DBNAME = "mydb";
	public static final int VERSION = 1;
	public static final String CREATE = "create table scoreboard (score text not null)";

	DataBaseHelper dbhelp; 
	Context ctx;
	SQLiteDatabase databaseku;
	
	public Datahandler(Context ctx){
		this.ctx = ctx;
		dbhelp = new DataBaseHelper(ctx);
		
	}

	
private static class DataBaseHelper extends SQLiteOpenHelper{


	public DataBaseHelper (Context ctx){
	 super(ctx,DBNAME,null,VERSION);
	}

	

	@Override
	public void onCreate(SQLiteDatabase arg0) {
		// TODO Auto-generated method stub
		try{
			arg0.execSQL(CREATE);
		}catch(SQLException e){
			e.printStackTrace();
		}
		
	}
	
	

	
	@Override
	public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {
		// TODO Auto-generated method stub
		arg0.execSQL("DROP TABLE IF EXISTS scoreboard");
		onCreate(arg0);
	}

}


public Datahandler open(){
	
	databaseku= dbhelp.getWritableDatabase();
	return this;
}

public void close(){
	
	dbhelp.close();
}

public void insertData(String score1){
	ContentValues content = new ContentValues();
	content.put(score, score1);
    databaseku.insertOrThrow(TNAME, null, content);
}

public Cursor returnData(){
	return databaseku.query(TNAME, new String[] {score}, null, null, null, null, null);

	
}
}