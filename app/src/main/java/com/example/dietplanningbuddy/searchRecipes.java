package com.example.dietplanningbuddy;

import android.widget.EditText;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

    public class searchRecipes extends AppCompatActivity {
        EditText edittext1;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_search_recipes);


        }

        public void searchR(View view) {
            edittext1 = findViewById( R.id.edittext1);
            String text= edittext1.getText().toString();
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=Healthy recipes using " + text));
            startActivity(browserIntent);
        }
        }

