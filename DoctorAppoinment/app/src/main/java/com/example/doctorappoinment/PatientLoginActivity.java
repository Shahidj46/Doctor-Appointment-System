package com.example.doctorappoinment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.List;

public class PatientLoginActivity extends AppCompatActivity {
    EditText name,pass;
    Patient patient;
    PatientHelper ph;
    List<Patient> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_login);


        name=findViewById(R.id.doclogname);
        pass=findViewById(R.id.doclogpass);
        ph=new PatientHelper(this);
    }



    public void goTopatintRegis(View view){

        Intent intent = new Intent(this, PatientRegistration.class);
        startActivity(intent);

    }



    public void login(View view){
        try {
            patient= ph.logincode(name.getText().toString(),pass.getText().toString());
            Intent it = new Intent(this, PatientDashboardActivity.class);

            if (patient!=null) {

                Toast.makeText(this, "login Success", Toast.LENGTH_LONG).show();
                startActivity(it);
            }

        }catch (Exception e){

        }


    }


}