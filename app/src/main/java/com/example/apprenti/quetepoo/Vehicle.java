package com.example.apprenti.quetepoo;

/**
 * Created by apprenti on 18/09/17.
 */

public class Vehicle {
    public String marque;
    public String  modele;

    public Vehicle(String marque, String modele){
        this.marque = marque;
        this.modele = modele;

    }
    public String getDescription(){
       return String.format("Marque: %1$s, Modèle: %2$s", marque, modele);
    }



}
