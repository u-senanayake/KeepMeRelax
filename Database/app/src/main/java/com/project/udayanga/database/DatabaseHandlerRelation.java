package com.project.udayanga.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Udayanga on 3/30/2016.
 */
public class DatabaseHandlerRelation extends SQLiteOpenHelper {



    // Database Version
    private static final int DATABASE_VERSION = 1;
    // Database Name
    private static final String DATABASE_NAME = "keepmerelax";
    // Contacts table name
    private static final String TABLE_RELATION = "relation";
    // Contacts Table Columns names
    private static final String KEY_RATE = "rate";
    private static final String KEY_RELATION = "relation";

    public DatabaseHandlerRelation(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_USER_TABLE = "CREATE TABLE " + TABLE_RELATION + "("
                + KEY_RATE + " INTEGER " + KEY_RELATION + " VARCHAR"
                 + ")";
        db.execSQL(CREATE_USER_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Drop older table if existed
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_RELATION);

        // Create tables again
        onCreate(db);

    }
}
