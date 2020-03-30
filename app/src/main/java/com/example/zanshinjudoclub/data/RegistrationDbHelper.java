package com.example.zanshinjudoclub.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.example.zanshinjudoclub.data.RegistrationContract.RegistrationEntry;

public class RegistrationDbHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "zanshinjudo.db";

    private static final int DATABASE_VERSION = 1;

    public RegistrationDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String SQL_CREATE_CONTACT_DETAILS = "CREATE TABLE " + RegistrationEntry.TABLE_NAME + "("
                + RegistrationEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + RegistrationEntry.COLUMN_PLAYER_NAME + " TEXT, "
                + RegistrationEntry.COLUMN_DATE_OF_BIRTH + " BLOB, "
                + RegistrationEntry.COLUMN_PARENTS_NAME + " TEXT, "
                + RegistrationEntry.COLUMN_PARENTS_RELATION + " TEXT, "
                + RegistrationEntry.COLUMN_PARENTS_ADDRESS1 + " BLOB, "
                + RegistrationEntry.COLUMN_PARENTS_ADDRESS2 + " BLOB, "
                + RegistrationEntry.COLUMN_PARENTS_PHONE + " INTEGER, "
                + RegistrationEntry.COLUMN_PARENTS_EMAIL + " BLOB, "
                + RegistrationEntry.COLUMN_PARENTS_POSTCODE + " BLOB, "
                + RegistrationEntry.COLUMN_ADDRESS1 + " BLOB, "
                + RegistrationEntry.COLUMN_ADDRESS2 + " BLOB, "
                + RegistrationEntry.COLUMN_PHONE + " INTEGER, "
                + RegistrationEntry.COLUMN_EMAIL + " BLOB, "
                + RegistrationEntry.COLUMN_POSTCODE + " BLOB, "
                + RegistrationEntry.COLUMN_EMERGENCY_NAME + " TEXT, "
                + RegistrationEntry.COLUMN_EMERGENCY_RELATION + " TEXT, "
                + RegistrationEntry.COLUMN_EMERGENCY_ADDRESS1 + " BLOB, "
                + RegistrationEntry.COLUMN_EMERGENCY_ADDRESS2 + " BLOB, "
                + RegistrationEntry.COLUMN_EMERGENCY_PHONE + " INTEGER, "
                + RegistrationEntry.COLUMN_EMERGENCY_EMAIL + " BLOB, "
                + RegistrationEntry.COLUMN_EMERGENCY_POSTCODE + " BLOB);";

        db.execSQL(SQL_CREATE_CONTACT_DETAILS);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

}
