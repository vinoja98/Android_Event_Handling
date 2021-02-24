package com.example.myapplication2.Database;

import android.provider.BaseColumns;

public final class  UserProfile{
    // To prevent someone from accidentally instantiating the contract class,
    // make the constructor private.
    private UserProfile() {}

    /* Inner class that defines the table contents */
    public static class User implements BaseColumns {
        public static final String TABLE_NAME = "User";
        public static final String COLUMN_1= "username";
        public static final String COLUMN_2 = "password";
    }
}
