package com.project.udayanga.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Udayanga on 3/29/2016.
 */
public class DatabaseHandlerData extends SQLiteOpenHelper{
    // Database Version
    private static final int DATABASE_VERSION = 1;
    // Database Name
    private static final String DATABASE_NAME = "keepmerelax";
    // Contacts table name
    private static final String TABLE_DATA = "data";
    // Contacts Table Columns names
    private static final String KEY_TIME = "time";
    private static final String KEY_PULSE = "pulse";
    private static final String KEY_TEMPERATURE = "temperature";

    public DatabaseHandlerData(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_DATA_TABLE = "CREATE TABLE " + TABLE_DATA + "("
                + KEY_TIME + " DATETIME PRIMARY KEY," + KEY_PULSE + " DOUBLE,"
                + KEY_TEMPERATURE + " DOUBLE" + ")";
        db.execSQL(CREATE_DATA_TABLE);
    }
    // Upgrading database
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Drop older table if existed
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_DATA);

        // Create tables again
        onCreate(db);


    }
}
