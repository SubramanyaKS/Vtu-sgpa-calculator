package com.example.vtusgpacgpacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SgpaScheme extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sgpa_scheme);

        Button button7 = findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openScheme();
            }
        });

        Button button8 = findViewById(R.id.button8);
            button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openScheme();
            }
        });

        Button button18 = findViewById(R.id.button18);
        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openScheme();
            }
        });
    }
    public void openScheme() {
        Intent intent = new Intent(this, SgpaSemSelection.class);
        startActivity(intent);
    }


}