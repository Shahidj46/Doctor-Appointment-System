package com.example.doctorappoinment;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class PatientHelper extends SQLiteOpenHelper {
    public static final String tblName="patient";
    List<Patient> showList;
    List <Patient> list;
    public PatientHelper(@Nullable Context context) {
        super(context, "pdb", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE patient(id Integer PRIMARY KEY,name TEXT,email TEXT,password TEXT) ");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS patient");
        onCreate(db);


    }

    public void insert(Patient patient){
        SQLiteDatabase sd=this.getWritableDatabase();
        ContentValues cv=new ContentValues();
        cv.put("id",patient.getId());
        cv.put("name",patient.getName());
        cv.put("email",patient.getEmail());
        cv.put("password",patient.getPassword());
        sd.insert("patient",null,cv);
        sd.close();
    }

    public Patient logincode(String name,String password){
        SQLiteDatabase sd=this.getReadableDatabase();

        Cursor c= sd.rawQuery("SELECT * FROM patient where name='"+name+"' and password='"+password+"'",null);
         list = new ArrayList<>();
        while (c.moveToNext()){
            list.add(new Patient(c.getInt(0),c.getString(1),c.getString(2),c.getString(3)));

        }
        return list.get(0);
    }
}
