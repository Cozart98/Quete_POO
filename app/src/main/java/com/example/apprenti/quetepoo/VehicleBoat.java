package com.example.apprenti.quetepoo;

/**
 * Created by apprenti on 18/09/17.
 */

public class VehicleBoat extends Vehicle {
    public String nbHeure;

    public VehicleBoat(String marque, String modele, String nbHeure) {
        super(marque, modele);
        this.nbHeure = nbHeure;
    }
    public String getDescription(){
        return String.format("Marque: %1$s, Modèle: %2$s, nbHeure %3$s", marque, modele,nbHeure);
    }
}
