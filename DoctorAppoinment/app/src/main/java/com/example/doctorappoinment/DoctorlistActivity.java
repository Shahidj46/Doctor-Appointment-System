package com.example.doctorappoinment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class DoctorlistActivity extends AppCompatActivity {
    ListView listVieww;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctorlist);

        listVieww=findViewById(R.id.doctorlistview);
        String[] doctorName = getResources().getStringArray(R.array.doctorName);

        ArrayAdapter<String> adapter= new ArrayAdapter<String>(DoctorlistActivity.this,R.layout.doctorlistsample,R.id.doctorlistTextId,doctorName);
        listVieww.setAdapter(adapter);
    }
}