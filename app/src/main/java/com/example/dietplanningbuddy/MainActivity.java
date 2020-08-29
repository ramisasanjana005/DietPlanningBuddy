package com.example.dietplanningbuddy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button signinup= (Button) findViewById(R.id.button1);
        signinup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, googleSigninActivity.class);
                startActivity(i);
            }
        });



        Button bmi= (Button) findViewById(R.id.button2);
        bmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Bmi.class);
                startActivity(i);
            }
        });


        Button setdietplan= (Button) findViewById(R.id.button3);
        setdietplan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, dietplan.class);
                startActivity(i);
            }
        });


        Button setreminder= (Button) findViewById(R.id.button4);
        setreminder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, RemindersActivity.class);
                startActivity(i);
            }
        });


        Button consultinstructor= (Button) findViewById(R.id.button5);
        consultinstructor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, searchRecipes.class);
                startActivity(i);
            }
        });


        Button scanfoodcode= (Button) findViewById(R.id.button6);
        scanfoodcode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, foodcodescanner.class);
                startActivity(i);
            }
        });

    }
}
