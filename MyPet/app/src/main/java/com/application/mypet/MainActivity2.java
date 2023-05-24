package com.application.mypet;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private ImageView view;
    private TextView v1;
    private TextView v2;
    private TextView v3;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        view = findViewById(R.id.imageView3);
        v1 = findViewById(R.id.textView4);
        v2 = findViewById(R.id.textView5);
        v3 = findViewById(R.id.textView6);

    }

    public void goOutMenu(View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void redact(View v){
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);
    }

    public void medic(View v){
        Intent intent = new Intent(this, MainActivity4.class);
        startActivity(intent);
    }

    public void priv(View v){
        Intent intent = new Intent(this, MainActivity5.class);
        startActivity(intent);
    }
}