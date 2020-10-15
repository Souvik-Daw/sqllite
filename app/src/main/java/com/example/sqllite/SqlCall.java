package com.example.sqllite;

import android.content.ContentValues;
import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class SqlCall extends SQLiteOpenHelper {

    public static String DB_NAME="studentDB";
    public static String TABLE="student";
    public static String S_ID="sID";
    public static String S_NAME="sNAME";
    public static String S_COURSE="sCOURSE";
    public static String S_SEM="sSEM";
    public static int DB_VERSION=1;
    Context mContext;

    public SqlCall(Context context) {
        super(context, DB_NAME ,null,DB_VERSION);
    }



    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql="CREATE TABLE "+TABLE+" ( "+S_ID+" INTEGER PRIMARY KEY AUTOINCREMENT , "+S_NAME+" TEXT, "+S_COURSE+""+" TEXT, "+S_SEM+" TEXT)";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+ TABLE);
        onCreate(db);
    }

    long addStudent(student s)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues values=new ContentValues();
        values.put(S_NAME,s.getsName());
        values.put(S_COURSE,s.getsCourses());
        values.put(S_SEM,s.getsSem());

        long b=db.insert(TABLE,null,values);
        return b;
    }
}
