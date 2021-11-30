package com.gmail.pavlovsv93;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tw;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tw = findViewById(R.id.message);
        double a = Math.random() * 100 / Math.random()*10;
        double b = Math.random() * 100 / Math.random()*10;
        int flag = (int) (Math.random() * 3);
        String operator = null;
        if (flag == 0){
            operator = "+";
        } else if(flag == 1){
            operator = "-";
        } else if(flag == 1){
            operator = "*";
        }else{
            operator = "/";
        }
        tw.setText(String.valueOf(a) + " "+ operator +" " + String.valueOf(b) + " = ");

        findViewById(R.id.calc_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("calc://launch");
                startActivity(Intent.createChooser(new Intent(Intent.ACTION_VIEW, uri), ""));
            }
        });
    }

}