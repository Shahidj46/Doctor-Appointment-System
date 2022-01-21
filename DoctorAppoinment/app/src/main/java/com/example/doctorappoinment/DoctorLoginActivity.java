package com.example.doctorappoinment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DoctorLoginActivity extends AppCompatActivity {
    EditText  name, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_login);

        name=findViewById(R.id.doclogname);
        password=findViewById(R.id.doclogpass);
    }

    public  void logDoctor(View view){

        Pattern p = Pattern.compile("Doctor");
        Matcher m = p.matcher(name.getText());

        Pattern p1 = Pattern.compile("1262072");
        Matcher m1 = p1.matcher(password.getText());


        if(m.matches()&&m1.matches()){
            Intent intent=new Intent(this,DoctorDashboardActivity.class);
            startActivity(intent);
        }else{
            Toast.makeText(this,"Name or Pasword error",Toast.LENGTH_LONG).show();
        }

    }
}