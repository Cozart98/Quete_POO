package com.example.apprenti.quetepoo;

/**
 * Created by apprenti on 19/09/17.
 */

public class VehicleBike extends Vehicle {
    public String kilometrage;


    public VehicleBike(String marque, String modele, String kilometrage) {
        super(marque, modele);
        this.kilometrage = kilometrage;
    }
    public String getDescription(){
        return String.format("Marque: %1$s, Modèle: %2$s, kilometrage %3$s", marque, modele,kilometrage);
    }
}


