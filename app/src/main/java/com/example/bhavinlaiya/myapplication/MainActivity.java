package com.example.bhavinlaiya.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvtest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvtest = (TextView) findViewById(R.id.tv);
        tvtest.setText("bhavin laiya");
    }
}
