package com.application.upwindow;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.textView);
        Button button_second=findViewById(R.id.button_second);

        button_second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //getInfo(textView.getText().toString());

                showAlertDialog("Вы соглашаетесь с закрытием приложения?");
            }
        });
    }


// метод, который потом можно присвоить любому объекту
    public void buttonClick(View v){
        getInfo(((Button) v).getText().toString());

    }

    private void getInfo(String str){
        Toast.makeText(this, str, Toast.LENGTH_LONG).show();
    }

    private void showAlertDialog(String str){
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("Большая подсказка :33")
                .setMessage(str)
                .setCancelable(false)
                .setPositiveButton("Согласие", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                })
                .setNegativeButton("Отказ", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });

        AlertDialog dialog = builder.create();
        dialog.show();
    }

}