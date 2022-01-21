package com.example.doctorappoinment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DoctorDashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_dashboard);
    }


    public void gotoPatientList(View view){
        Intent intent= new Intent(this,DoctorlistActivity.class);
        startActivity(intent);
    }
}