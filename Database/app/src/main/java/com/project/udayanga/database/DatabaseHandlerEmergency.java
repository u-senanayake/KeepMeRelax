package com.project.udayanga.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Udayanga on 3/30/2016.
 */
public class DatabaseHandlerEmergency extends SQLiteOpenHelper {


    // Database Version
    private static final int DATABASE_VERSION = 1;
    // Database Name
    private static final String DATABASE_NAME = "keepmerelax";
    // Contacts table name
    private static final String TABLE_EMERGENCY = "emergency_contact";
    // Contacts Table Columns names
    private static final String KEY_NAME = "name";
    private static final String KEY_CONTACT = "contact_number";
    private static final String KEY_RATE = "relation_rate";

    public DatabaseHandlerEmergency(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_USER_TABLE = "CREATE TABLE " + TABLE_EMERGENCY + "("
                + KEY_NAME + " VARCHAR" + KEY_CONTACT + " INTEGER"
                + KEY_RATE + " INTEGER" + ")";
        db.execSQL(CREATE_USER_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Drop older table if existed
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_EMERGENCY);

        // Create tables again
        onCreate(db);

    }
}
