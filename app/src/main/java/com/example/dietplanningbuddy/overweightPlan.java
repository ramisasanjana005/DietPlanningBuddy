package com.example.dietplanningbuddy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class overweightPlan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_overweight_plan );
    }
    public void sunday(View v) {

        Intent i = null;
        Intent chooser = null;

        //passing into another page
        if (v.getId () == R.id.d1ImageButton) {
            i = new Intent ( this , d1Overweight.class );
            startActivity ( i );
        }

    }

    public void monday(View v) {

        Intent i = null;
        Intent chooser = null;

        //passing into another page
        if (v.getId () == R.id.d2ImageButton) {
            i = new Intent ( this , d2Overweight.class );
            startActivity ( i );
        }

    }

    public void tuesday(View v) {

        Intent i = null;
        Intent chooser = null;

        //passing into another page
        if (v.getId () == R.id.d3ImageButton) {
            i = new Intent ( this , d3Overweight.class );
            startActivity ( i );
        }

    }

    public void wednesday(View v) {

        Intent i = null;
        Intent chooser = null;

        //passing into another page
        if (v.getId () == R.id.d4ImageButton) {
            i = new Intent ( this , d4Overweight.class );
            startActivity ( i );
        }

    }

    public void thursday(View v) {

        Intent i = null;
        Intent chooser = null;

        //passing into another page
        if (v.getId () == R.id.d5ImageButton) {
            i = new Intent ( this , d5Overweight.class );
            startActivity ( i );
        }

    }

    public void friday(View v) {

        Intent i = null;
        Intent chooser = null;

        //passing into another page
        if (v.getId () == R.id.d6ImageButton) {
            i = new Intent ( this , d6Overweight.class );
            startActivity ( i );
        }

    }

    public void saturday(View v) {

        Intent i = null;
        Intent chooser = null;

        //passing into another page
        if (v.getId () == R.id.d7ImageButton) {
            i = new Intent ( this , d7Overweight.class );
            startActivity ( i );
        }

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