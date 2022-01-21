package com.example.doctorappoinment;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    int progressInt = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ProgressBar progressBar = findViewById(R.id.progressBar);



        Activity activity = MainActivity.this;


        progressBar.setProgress(progressInt);
        progressBar.setMax(100);

        Timer timer = new Timer();

        timer.schedule(new TimerTask() {
            @Override
            public void run() {

                progressInt = progressInt+5;
                progressBar.setProgress(progressInt);

                activity.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {



                    }
                });

                if (progressBar.getProgress()>=100){

                    timer.cancel();


                    Intent intent = new Intent(MainActivity.this,LoginActivity.class);
                    activity.startActivity(intent);
                    finish();




                }





            }
        },1000,100);

        progressBar.setProgressTintList(ColorStateList.valueOf(Color.BLUE));



    }
}