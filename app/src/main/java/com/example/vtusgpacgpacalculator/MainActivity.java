package com.example.vtusgpacgpacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View view) {
                openScheme();
            }
        });

        Button button =findViewById(R.id.button);
        button.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View view) {
                openScheme1();
            }
        });
    }
    public void openScheme(){
        Intent intent = new Intent(this , MainActivityScheme.class);
        startActivity(intent);
    }

    public void openScheme1(){
        Intent intent = new Intent(this , SgpaScheme.class);
        startActivity(intent);
    }
}