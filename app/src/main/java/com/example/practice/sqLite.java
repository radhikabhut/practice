package com.example.practice;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class sqLite extends SQLiteOpenHelper {

    private static final String DB_NAME= "STUD";
    private static final String TABLE_STUD = "STUD_TBL";
    private static final String KEY_ID= "ID";
    private static final String KEY_NAME= "NAME";
    private static final String KEY_NO= "NO";

    public sqLite(Context context)
    {
        super(context,DB_NAME,null,1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE "+ TABLE_STUD +"(" +KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT , "+ KEY_NAME +  " TEXT ,"+ KEY_NO+" INTEGER )");
db.close();
    }

    public  void insert(String name,int no){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_NAME,name);
        values.put(KEY_NO,no);
        db.insert(TABLE_STUD,null,values);
        db.close();
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_STUD);
        onCreate(db);
    }
}
