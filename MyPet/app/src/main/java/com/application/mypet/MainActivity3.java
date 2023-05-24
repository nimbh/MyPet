package com.application.mypet;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity3 extends AppCompatActivity {
    private ImageView v;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        v = findViewById(R.id.imageView4);
    }

    public void goToMenu(View v){
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }

}