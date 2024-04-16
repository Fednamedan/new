package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void skipibtn(View view) {
        Intent intent;
        intent = new Intent(MainActivity.this, acttree.class);
        startActivity(intent);
    }

    public void nextibtn(View view) {
        Intent intent;
        intent = new Intent(MainActivity.this, Acttwo.class);
        startActivity(intent);
    }

}