package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Acttwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acttwo);
    }

    public void skipibtn(View view) {
        Intent intent;
        intent = new Intent(Acttwo.this, acttree.class);
        startActivity(intent);
    }

    public void nextibtn(View view) {
        Intent intent;
        intent = new Intent(Acttwo.this, acttree.class);
        startActivity(intent);
    }
}