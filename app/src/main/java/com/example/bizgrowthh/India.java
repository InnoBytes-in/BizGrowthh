package com.example.bizgrowthh;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class India extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.india);

        Button button = findViewById(R.id.button16);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(India.this, Filter.class);
                startActivity(intent);
            }
        });

        Button button1 = findViewById(R.id.button17);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(India.this, ServicesMarketing.class);
                startActivity(intent);
            }
        });

        Button button2 = findViewById(R.id.button18);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(India.this, ServicesSales.class);
                startActivity(intent);
            }
        });

        Button button3 = findViewById(R.id.button19);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(India.this, ServiceHr.class);
                startActivity(intent);
            }
        });

        Button button4 = findViewById(R.id.button20);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(India.this, ServicesOperations.class);
                startActivity(intent);
            }
        });

        Button button5 = findViewById(R.id.button21);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(India.this, ServicesFinance.class);
                startActivity(intent);
            }
        });

        Button button6 = findViewById(R.id.button22);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(India.this, ServicesTechnology.class);
                startActivity(intent);
            }
        });

        Button button7 = findViewById(R.id.button23);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(India.this, ServicesLegal.class);
                startActivity(intent);
            }
        });

        Button button8 = findViewById(R.id.button24);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(India.this, ServiceEngineering.class);
                startActivity(intent);
            }
        });

        Button button9 = findViewById(R.id.button25);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(India.this, Faq.class);
                startActivity(intent);
            }
        });
    }
}
