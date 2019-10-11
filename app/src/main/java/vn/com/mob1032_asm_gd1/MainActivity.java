package vn.com.mob1032_asm_gd1;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;

import vn.com.mob1032_asm_gd1.DAOS.ClassDAO;
import vn.com.mob1032_asm_gd1.DAOS.StudentDAO;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = "CHECK";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DbHelper dbHelper = new DbHelper(getApplicationContext());
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        Log.d(TAG, db.getVersion()+"");
        ClassDAO classDAO = new ClassDAO(dbHelper.getWritableDatabase());
        StudentDAO StudentDAO = new StudentDAO(dbHelper.getWritableDatabase());
    }
}
