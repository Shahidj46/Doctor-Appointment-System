package com.example.doctorappoinment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DoctorAppoinmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_appoinment);
    }


    public void gotoPatientList(View view){
        Intent intent= new Intent(this,DoctorlistActivity.class);
        startActivity(intent);
    }
}