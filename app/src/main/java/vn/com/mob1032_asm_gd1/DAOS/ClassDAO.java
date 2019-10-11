package vn.com.mob1032_asm_gd1.DAOS;

import android.database.sqlite.SQLiteDatabase;

public class ClassDAO {
    public static final String TABLE1_NAME = "class";
    public static final String COLUMN_NAME_CLASS_ID = "class_id";
    public static final String COLUMN_NAME_CLASS_NAME = "class_name";
    public static final String CREATE_TABLE1=
            "CREATE TABLE class(" +
                    "class_no INTEGER AUTO_INCREMENT,"+
                    "class_id VARCHAR PRIMARY KEY," +
                    "class_name VARCHAR NOT NULL" +
                    ")";
    //Fields
    SQLiteDatabase db;
    //Constructor
    public ClassDAO(SQLiteDatabase db){
        this.db = db;
    }
    //Method
}
