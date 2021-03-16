package com.study.train;

import android.os.Bundle;
import android.widget.TextView;

import com.study.java.annotation.TestAnnotation;
import com.study.train.inject.InjectView;
import com.study.train.inject.InjectUtils;

import androidx.appcompat.app.AppCompatActivity;

@TestAnnotation(id = "2")
public class MainActivity extends AppCompatActivity {

    @InjectView(R.id.tv_label)
    private TextView mTvLabel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        InjectUtils.injectView(this);
        mTvLabel.setText("success!");

    }
}
