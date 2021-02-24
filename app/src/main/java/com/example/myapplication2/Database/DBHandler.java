package com.example.myapplication2.Database;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class DBHandler extends SQLiteOpenHelper {
    // If you change the database schema, you must increment the database version.
    public static final int DATABASE_VERSION = 2;
    public static final String DATABASE_NAME = "Database.db";

    public DBHandler(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
    public void onCreate(SQLiteDatabase db) {
        String SQL_CREATE_ENTRIES =
                "CREATE TABLE " + UserProfile.User.TABLE_NAME + " (" +
                        UserProfile.User._ID + " INTEGER  ," +
                        UserProfile.User.COLUMN_1 + " TEXT PRIMARY KEY," +
                        UserProfile.User.COLUMN_2 + " TEXT)";
        db.execSQL(SQL_CREATE_ENTRIES);
    }
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // This database is only a cache for online data, so its upgrade policy is
        // to simply to discard the data and start over
        db.execSQL(SQL_DELETE_ENTRIES);
        onCreate(db);
    }
    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        onUpgrade(db, oldVersion, newVersion);
    }

    private static final String SQL_DELETE_ENTRIES =
            "DROP TABLE IF EXISTS " + UserProfile.User.TABLE_NAME;

    public long add_info(String username,String password){
        // Gets the data repository in write mode
        SQLiteDatabase db = getWritableDatabase();

// Create a new map of values, where column names are the keys
        ContentValues values = new ContentValues();
        values.put(UserProfile.User.COLUMN_1, username);
        values.put(UserProfile.User.COLUMN_2, password);

// Insert the new row, returning the primary key value of the new row
        long newRowId = db.insert(UserProfile.User.TABLE_NAME, null, values);
        db.close();
        return  newRowId;
    }
}