package com.application.app10_0;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView text1;
    TextView text2;
    TextView text3;
    TextView text4;

    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;


    int count1 = 0;
    int count2 = 0;
    int count3 = 0;
    int count4 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text1 = (TextView)findViewById(R.id.textView);
        btn1 = (Button)findViewById(R.id.button);

        text2 = (TextView)findViewById(R.id.textView4);
        btn2 = (Button)findViewById(R.id.button2);

        text3 = (TextView)findViewById(R.id.textView6);
        btn3 = (Button)findViewById(R.id.button3);

        text4 = (TextView)findViewById(R.id.textView8);
        btn4= (Button)findViewById(R.id.button4);
    }

    public void eat(View v) {
        count1+=20;
        text1.setText(String.valueOf(count1));
        if (count1>100){
            Toast.makeText(this, "Кот наелся!", Toast.LENGTH_LONG).show();
            count1=100;
        }
    }

    public void sleep(View v) {
        count2+=10;
        text2.setText(String.valueOf(count2));
        if (count2>100){
            Toast.makeText(this, "Кот выспался!", Toast.LENGTH_LONG).show();
            count2=100;
        }
    }

    public void play(View v) {
        count3+=15;
        text3.setText(String.valueOf(count3));
        if (count3>100){
            Toast.makeText(this, "Кот наигрался!", Toast.LENGTH_LONG).show();
            count3=100;
        }
    }

    public void gladit(View v) {
        count4+=10;
        text4.setText(String.valueOf(count4));
        if (count4>100){
            Toast.makeText(this, "Кот нагладился!", Toast.LENGTH_LONG).show();
            count4=100;
        }
    }
}