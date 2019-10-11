package vn.com.mob1032_asm_gd1.DAOS;

import android.database.sqlite.SQLiteDatabase;

import vn.com.mob1032_asm_gd1.DbHelper;
import vn.com.mob1032_asm_gd1.datamodel.Students;

public class StudentDAO {
    public static final String TABLE2_NAME = "student";
    public static final String COLUMN_NAME_STUDENT_ID = "student_id";
    public static final String COLUMN_NAME_STUDENT_NAME = "student_name";
    public static final String COLUMN_NAME_STUDENT_CLASS_ID = "class_id";
    /*public static final String CREATE_TABLE2=
            "CREATE TABLE student ( " +
                    "student_id VARCHAR PRIMARY KEY," +
                    "student_name VARCHAR NOT NULL," +
                    "class_id VARCHAR NOT NULL," +
                    "FOREIGN KEY (class_id) REFERENCES class(class_id)"+
                    ")";*/

    public static final String CREATE_TABLE2 = "CREATE TABLE"+TABLE2_NAME+"(" +
            COLUMN_NAME_STUDENT_ID+"INTEGER PRIMARY KEY AUTOINCREMENT,"+COLUMN_NAME_STUDENT_NAME+"VARCHAR NOT NULL," +
            COLUMN_NAME_STUDENT_CLASS_ID+"VARCHAR NOT NULL," +
            "FOREIGN KEY (class_id) REFERENCES class(class_id)" +
            ")";
    public static final String DROP_TABLE_STUDENT = "DROP TABLE IF EXISTS"+TABLE2_NAME;
    //Fields
    
    SQLiteDatabase db;
    //Constructor
    public StudentDAO(SQLiteDatabase db) {
        this.db = db;
    }

}
