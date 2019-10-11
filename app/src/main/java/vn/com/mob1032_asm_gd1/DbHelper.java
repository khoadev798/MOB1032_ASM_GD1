package vn.com.mob1032_asm_gd1;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import vn.com.mob1032_asm_gd1.DAOS.ClassDAO;
import vn.com.mob1032_asm_gd1.DAOS.StudentDAO;

public class DbHelper extends SQLiteOpenHelper {

    public static final String DB_NAME = "SchoolManage";
    public static int DB_VERSION = 1;
    public DbHelper(Context context){super(context,DB_NAME,null,DB_VERSION);}

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(ClassDAO.CREATE_TABLE1);
        db.execSQL(StudentDAO.CREATE_TABLE2);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
