package com.example.doctorappoinment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class LoginActivity extends AppCompatActivity {
    Intent intent;
    ImageButton doctr, patint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        doctr=findViewById(R.id.logimgbtndoc);
        patint=findViewById(R.id.logimgbtnpati);
    }


    public void goToDoctorLogin(View view){
        intent=new Intent(this,DoctorLoginActivity.class);
        startActivity(intent);
    }


    public void goToPatientLogin(View view){
        intent=new Intent(this,PatientLoginActivity.class);
        startActivity(intent);

    }
}