package com.example.apprenti.quetepoo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         final Spinner spinner = (Spinner) findViewById(R.id.spinner);


        final EditText kilomètre = (EditText) findViewById(R.id.kilomètre);
        final EditText marque = (EditText)findViewById(R.id.marqueVehicle);
        final EditText modele = (EditText)findViewById(R.id.modelVehicle);
        final EditText nbHeure = (EditText) findViewById(R.id.nbHeure);
        final Button button = (Button) findViewById(R.id.button);

        final ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.model_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:
                        kilomètre.setVisibility(View.INVISIBLE);
                        nbHeure.setVisibility(View.INVISIBLE);
                        button.setEnabled(false);
                        break;
                    case 1:
                    kilomètre.setVisibility(View.VISIBLE);
                        nbHeure.setVisibility(View.INVISIBLE);
                        button.setEnabled(true);

                        break;
                    case 2:
                    kilomètre.setVisibility(View.VISIBLE);
                        nbHeure.setVisibility(View.INVISIBLE);
                        button.setEnabled(true);

                        break;
                    case 3:
                    nbHeure.setVisibility(View.VISIBLE);
                        kilomètre.setVisibility(View.INVISIBLE);
                        button.setEnabled(true);
                        break;

                }
            }
            @Override
            public void onNothingSelected (AdapterView<?> parent){

            }
        });


        final Intent intent = new Intent(MainActivity.this,
                VehicleActivity.class);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("type",spinner.getSelectedItemPosition());
                intent.putExtra("marque", marque.getText().toString());
                intent.putExtra("modele", modele.getText().toString());
                intent.putExtra("kilometre", kilomètre.getText().toString());
                intent.putExtra("nbHeure", nbHeure.getText().toString());

                MainActivity.this.startActivity(intent);
            }
        });




    }

}

