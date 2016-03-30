package com.project.udayanga.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Udayanga on 3/29/2016.
 */
public class DatabaseHandlerEmotion extends SQLiteOpenHelper {

    // Database Version
    private static final int DATABASE_VERSION = 1;
    // Database Name
    private static final String DATABASE_NAME = "keepmerelax";
    // Contacts table name
    private static final String TABLE_EMOTION = "emotion";
    // Contacts Table Columns names
    private static final String KEY_EMOTION_RATE = "emotion_rate";
    private static final String KEY_EMOTION = "emotion";

    public DatabaseHandlerEmotion(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_DATA_TABLE = "CREATE TABLE " + TABLE_EMOTION + "("
                + KEY_EMOTION_RATE + " INTEGER," + KEY_EMOTION + " INTEGER,"
                 + ")";
        db.execSQL(CREATE_DATA_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Drop older table if existed
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_EMOTION);

        // Create tables again
        onCreate(db);
    }
}
