package com.example.dietplanningbuddy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Calculate extends AppCompatActivity {

    TextView ans,ans2,ans3;
    float calori;
    float bmi = 0.2f;
    float water;
    String s1, s2, s3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate);

        bmi = getIntent().getFloatExtra("N1", 0);
        calori = getIntent().getFloatExtra("N2", 0);
        water = getIntent().getFloatExtra("N3", 0);
        s1 = String.valueOf(bmi);
        s2= String.valueOf(calori);
        s3= String.valueOf(water);
        ans = (TextView) findViewById(R.id.ans);
        ans2 = (TextView) findViewById(R.id.ans2);
        ans3 = (TextView) findViewById(R.id.ans3);

        ans.setText(s1);
        ans2.setText(s2);
        ans3.setText(s3);
    }


    public void homeView(View v) {

        Intent i = null;
        Intent chooser = null;

        //passing into another page
        if (v.getId () == R.id.homeButton) {
            i = new Intent ( this , MainActivity.class );
            startActivity ( i );
        }

    }
}