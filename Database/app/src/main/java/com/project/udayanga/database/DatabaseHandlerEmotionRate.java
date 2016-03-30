package com.project.udayanga.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Udayanga on 3/29/2016.
 */
public class DatabaseHandlerEmotionRate extends SQLiteOpenHelper{

    // Database Version
    private static final int DATABASE_VERSION = 1;
    // Database Name
    private static final String DATABASE_NAME = "keepmerelax";
    // Contacts table name
    private static final String TABLE_EMOTION_RATE = "emotion_rate";
    // Contacts Table Columns names
    private static final String KEY_PULSE = "pulse_rate";
    private static final String KEY_TEMP = "temp_rate";
    private static final String KEY_EMOTION = "emotion_rate";

    public DatabaseHandlerEmotionRate(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    // Creating Tables
    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_EMOTION_RATE_TABLE = "CREATE TABLE " + TABLE_EMOTION_RATE + "("
                + KEY_PULSE + " DOUBLE," + KEY_TEMP + " DOUBLE,"
                + KEY_EMOTION + " INTEGER" + ")";
        db.execSQL(CREATE_EMOTION_RATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Drop older table if existed
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_EMOTION_RATE);
        // Create tables again
        onCreate(db);
    }
}
