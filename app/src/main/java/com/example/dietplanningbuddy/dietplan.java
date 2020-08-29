package com.example.dietplanningbuddy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


import androidx.appcompat.app.AppCompatActivity;


public class dietplan extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_dietplan);
    }
    public void underweightPlanViewer(View v) {

        Intent i = null;
        Intent chooser = null;

        //passing into another page
        if (v.getId () == R.id.uwbutton) {
            i = new Intent ( this ,underweightPlan.class );
            startActivity ( i );
        }
    }
    public void normalweightPlanViewer(View v) {

        Intent i = null;
        Intent chooser = null;

        //passing into another page
        if (v.getId () == R.id.nwbutton) {
            i = new Intent ( this ,normalweightPlan.class );
            startActivity ( i );
        }
    }


    public void overweightPlanViewer(View v) {

        Intent i = null;
        Intent chooser = null;

        //passing into another page
        if (v.getId () == R.id.owbutton) {
            i = new Intent ( this ,overweightPlan.class );
            startActivity ( i );
        }
    }


    public void bmiView(View v) {

        Intent i = null;
        Intent chooser = null;

        //passing into another page
        if (v.getId () == R.id.bmiButton) {
            i = new Intent ( this , Bmi.class );
            startActivity ( i );
        }

    }

    }