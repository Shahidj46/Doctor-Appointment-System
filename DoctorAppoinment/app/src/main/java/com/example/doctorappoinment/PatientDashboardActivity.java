package com.example.doctorappoinment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PatientDashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_dashboard);
    }

    public void gotoContact(View view){
        Intent intent= new Intent(this,ContactActivity.class);
        startActivity(intent);
    }


    public void gotoDoctorlist(View view){
        Intent intent= new Intent(this,DoctorlistActivity.class);
        startActivity(intent);
    }


    public void healthPacke(View view){
        Intent intent= new Intent(this,HealthPackagActivity.class);
        startActivity(intent);
    }

    public void gotoDoctorAppoinment(View view){
        Intent intent= new Intent(this,DoctorAppoinmentActivity.class);
        startActivity(intent);
    }



}