package com.crimsonscythe.feedbackexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.crimsonscythe.feedback.FeedBackMain;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FeedBackMain.Init(this, "hello");

    }
}
