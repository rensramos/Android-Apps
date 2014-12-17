package com.example.taptap;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class Handler2 {
public static final String score="score";
public static final String DBNAME="rensdb";
public static final String TNAME="renstable3";
public static final int VERSION=1;
public static final String CREATE="create table renstable3(score text not null)";
DatabaseHelper dbhelper;
Context ctx;
SqlLiteDatabase databasequ;
public Handler2(Context ctx){
this.ctx=ctx;
dbhelper.=new DatabaseHelper(ctx);
}

private static class DataBaseHelper extends SQLiteOpenHelper{
	public DataBaseHelper (Context ctx){
	 super(ctx,DBNAME,null,VERSION);
	}
	private static class Databasehelper extends SQLiteOpenHelper{

		
		
		public Databasehelper(Context context, String name,
				CursorFactory factory, int version) {
			super(context, name, factory, version);
			// TODO Auto-generated constructor stub
		}
		
	}


}
