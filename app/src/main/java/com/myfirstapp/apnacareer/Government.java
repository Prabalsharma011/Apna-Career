package com.myfirstapp.apnacareer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Government extends AppCompatActivity {
    Button button18;
    Button button19;
    Button button20;
    Button button21;
    Button button22;
    Button button23;
    Button button24;
    Button button25;
    Button button26;
    Button button27;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_government);

        button18 = findViewById(R.id.UPSC);
        button19 = findViewById(R.id.Banking);
        button20 = findViewById(R.id.Railway);
        button21 = findViewById(R.id.SSC);
        button22 = findViewById(R.id.Defence);
        button23 = findViewById(R.id.agriculture);
        button24 = findViewById(R.id.TET);
        button25 = findViewById(R.id.Law);
        button26 = findViewById(R.id.NABARD);
        button27 = findViewById(R.id.PSU);

        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(Government.this,UPSC.class);
                startActivity(intent);
            }
        });

        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(Government.this,Banking.class);
                startActivity(intent);
            }
        });

        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(Government.this,Railway.class);
                startActivity(intent);
            }
        });

        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(Government.this,SSC.class);
                startActivity(intent);
            }
        });

        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(Government.this,Defence.class);
                startActivity(intent);
            }
        });

        button23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(Government.this,agriculture.class);
                startActivity(intent);
            }
        });

        button24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(Government.this,TET.class);
                startActivity(intent);
            }
        });

        button25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(Government.this,LAW.class);
                startActivity(intent);
            }
        });

        button26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(Government.this,NABARD.class);
                startActivity(intent);
            }
        });

        button27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(Government.this,PSU.class);
                startActivity(intent);
            }
        });


    }
}