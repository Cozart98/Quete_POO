package com.example.apprenti.quetepoo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class VehicleActivity extends AppCompatActivity {
    String marque;
    String modele;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vehicle);
        int type1 = getIntent().getIntExtra("type" , 0);
        String marque1 = getIntent().getStringExtra("marque");
        String modele1 = getIntent().getStringExtra("modele");
        String kilometre1 = getIntent().getStringExtra("kilometre");
        String nbHeure1 = getIntent().getStringExtra("nbHeure");
        TextView result = (TextView) findViewById(R.id.decription);


        if (type1 == 1){
            VehicleCar nissan = new VehicleCar(marque1,modele1, kilometre1);
            result.setText(nissan.getDescription());
        }else if (type1 == 3){
            VehicleBoat b2 = new VehicleBoat(marque1,modele1,nbHeure1);
            result.setText(b2.getDescription());
        }else if (type1 == 2){
            VehicleCar moto = new VehicleCar(marque1,modele1, kilometre1);
            result.setText(moto.getDescription());
        }else {

        }



    }
}




