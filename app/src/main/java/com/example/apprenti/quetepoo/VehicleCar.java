package com.example.apprenti.quetepoo;

import com.example.apprenti.quetepoo.Vehicle;

/**
 * Created by apprenti on 18/09/17.
 */

public class VehicleCar extends Vehicle {
    public String kilometrage;


    public VehicleCar(String marque, String modele, String kilometrage) {
        super(marque, modele);
        this.kilometrage = kilometrage;
    }
    public String getDescription(){
        return String.format("Marque: %1$s, Modèle: %2$s, kilometrage %3$s", marque, modele,kilometrage);
    }
}
