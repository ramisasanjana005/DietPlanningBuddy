package com.example.dietplanningbuddy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class Bmi extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

        EditText weight,feet,inches,age;
        Button calc;
        int pos;
        RadioGroup radioGroup;
        RadioButton radioButton;
        float a,b,c,ag;
        float bmr=0.2f;
        float bmi=0.2f;
        float calreq=0.2f;
         float waterreq =0.2f;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_bmi);

                weight=(EditText) findViewById(R.id.n1);
                feet=(EditText) findViewById(R.id.n2);
                inches=(EditText) findViewById(R.id.heightinches);
                age=(EditText) findViewById(R.id.age);

                radioGroup=(RadioGroup)findViewById(R.id.radioGroup);


                Spinner spinner = (Spinner) findViewById(R.id.spinner);

                // Spinner click listener
                spinner.setOnItemSelectedListener(this);

                // Spinner Drop down elements
                List<String> categories = new ArrayList<String>();
                categories.add("Little to no exercise");
                categories.add("Light exercise (1–3 days per week)");
                categories.add("Moderate exercise (3–5 days per week)");
                categories.add("Heavy exercise (6–7 days per week)");
                categories.add("Very heavy exercise (twice per day, extra heavy workouts)");



                // Creating adapter for spinner
                ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories);

                // Drop down layout style - list view with radio button
                dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                // attaching data adapter to spinner
                spinner.setAdapter(dataAdapter);




                Button calc= (Button) findViewById(R.id.buttoncalc);
                calc.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                                a=Float.parseFloat(weight.getText().toString());
                                b=Float.parseFloat(feet.getText().toString());
                                c=Float.parseFloat(inches.getText().toString());
                                ag=Float.parseFloat(age.getText().toString());
                                b= (float)(b*0.305+c*0.0254);
                                bmi=(a/(b*b));

                                int selectedId=radioGroup.getCheckedRadioButtonId();
                                radioButton=(RadioButton)findViewById(selectedId);
                                Toast.makeText(Bmi.this,radioButton.getText(),Toast.LENGTH_SHORT).show();

                                String g= radioButton.getText().toString();
                                if(g.equalsIgnoreCase("Male"))
                                        bmr=(float)(88.362+(13.397*a)+(4.799*b)-(5.677*ag));
                                else
                                        bmr=(float)(447.593 + (9.247*a) + (3.098*b) - (4.330*ag));

                                switch(pos)
                                {
                                        case 0:calreq=(float)(bmr*1.2);break;
                                        case 1:calreq=(float)(bmr*1.375);break;
                                        case 2:calreq=(float)(bmr*1.55);break;
                                        case 3:calreq=(float)(bmr*1.725);break;
                                        case 4:calreq=(float)(bmr*1.9);break;
                                }
                                switch(pos)
                                {
                                        case 0:waterreq=(float)((a/30)*1.0);break;
                                        case 1:waterreq=(float)((a/30)*0.35);break;
                                        case 2:waterreq=(float)((a/30)*0.45);break;
                                        case 3:waterreq=(float)((a/30)*0.55);break;
                                        case 4:waterreq=(float)((a/30)*0.65);break;
                                }



                                Intent i = new Intent(Bmi.this, Calculate.class);
                                i.putExtra("N1", bmi);
                                i.putExtra("N2",calreq );
                                i.putExtra("N3",waterreq );
                                startActivity(i);
                        }
                });

        }

        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                // On selecting a spinner item
                pos=position;

                // Showing selected spinner item
                Toast.makeText(parent.getContext(), "Selected: " + pos, Toast.LENGTH_LONG).show();
        }
        public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub
        }
}

