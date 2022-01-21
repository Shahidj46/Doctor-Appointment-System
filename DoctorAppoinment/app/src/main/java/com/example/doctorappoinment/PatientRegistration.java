package com.example.doctorappoinment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class PatientRegistration extends AppCompatActivity {
    EditText id,name,email,pass;
    PatientHelper ph;
    Patient patient;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_registration);

        id=findViewById(R.id.pid);
        name=findViewById(R.id.ppname);
        email=findViewById(R.id.pemail);
        pass=findViewById(R.id.ppassword);
        ph=new PatientHelper(this);
    }




    public void save(View view){
        try {
            patient=new Patient(Integer.parseInt(id.getText().toString()),name.getText().toString(),email.getText().toString(),pass.getText().toString());
            ph.insert(patient);
            Intent intent = new Intent(this, PatientLoginActivity.class);
            startActivity(intent);
            Toast.makeText(this, "save done", Toast.LENGTH_LONG).show();
        }catch (Exception e){

        }

    }

}