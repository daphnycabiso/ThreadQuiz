package com.example.lenovo.threadquiz;


import android.graphics.Color;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import android.widget.TextView;
import android.widget.ToggleButton;

import java.util.Random;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private TextView mTvCounter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ToggleButton b = (ToggleButton) findViewById(R.id.toggleButton);
        mTvCounter = (TextView) findViewById(R.id.tvCounter);
        findViewById(R.id.toggleButton).setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.toggleButton){

            startTimer(200000);
        }

    }

    private void startTimer(long time){
        CountDownTimer counter = new CountDownTimer(10000, 1000){
            public void onTick(long millisUntilDone){

                Log.d("counter_label", "Counter text should be changed");
                mTvCounter.setText(""+Math.round(millisUntilDone*0.001));
            }

            public void onFinish() {
                mTvCounter.setText("Over!");

            }
        }.start();

    }




}


