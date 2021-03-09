package com.study.train;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.study.java.annotation.TestAnnotation;

@TestAnnotation(id = "2")
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}
