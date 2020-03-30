package com.example.zanshinjudoclub.data;

import android.provider.BaseColumns;

public final class RegistrationContract {

    private RegistrationContract() {}

    public static final class RegistrationEntry implements BaseColumns {

        public final static String TABLE_NAME = "contactdetails";
        public final static String _ID = BaseColumns._ID;
        public final static String COLUMN_PLAYER_NAME = "Player Name";
        public final static String COLUMN_DATE_OF_BIRTH = "Date of Birth";
        public final static String COLUMN_PARENTS_NAME = "Parents Name";
        public final static String COLUMN_PARENTS_RELATION = "Parents Relation";
        public final static String COLUMN_PARENTS_ADDRESS1 = "Parents Address1";
        public final static String COLUMN_PARENTS_ADDRESS2 = "Parents Address2";
        public final static String COLUMN_PARENTS_PHONE = "Parents Phone";
        public final static String COLUMN_PARENTS_EMAIL = "Parents Email";
        public final static String COLUMN_PARENTS_POSTCODE = "Parents Postcode";
        public final static String COLUMN_ADDRESS1 = "Players Address1";
        public final static String COLUMN_ADDRESS2 = "Players Address2 ";
        public final static String COLUMN_PHONE = "Players Phone";
        public final static String COLUMN_EMAIL = "Players Email";
        public final static String COLUMN_POSTCODE = "Players Postcode";
        public final static String COLUMN_EMERGENCY_NAME = "Emergency Name";
        public final static String COLUMN_EMERGENCY_RELATION = "Emergency Relation";
        public final static String COLUMN_EMERGENCY_ADDRESS1 = "Emergency Address1";
        public final static String COLUMN_EMERGENCY_ADDRESS2 = "Emergency Address2";
        public final static String COLUMN_EMERGENCY_PHONE = "Emergency Phone";
        public final static String COLUMN_EMERGENCY_EMAIL = "Emergency Email";
        public final static String COLUMN_EMERGENCY_POSTCODE = "Emergency Email";

    }
}
