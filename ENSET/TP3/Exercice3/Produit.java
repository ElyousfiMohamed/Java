
package TP3.Exercice3;

import java.io.Serializable;

public class Produit implements Serializable{
    private String nom;
    private String marque;
    private String description;
    private double prix;
    private int nbStrock;


    public Produit() {
    }


    public Produit(String nom, String marque, String description, double prix, int nbStrock) {
        this.nom = nom;
        this.marque = marque;
        this.description = description;
        this.prix = prix;
        this.nbStrock = nbStrock;
    }


    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getMarque() {
        return this.marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrix() {
        return this.prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public int getNbStrock() {
        return this.nbStrock;
    }

    public void setNbStrock(int nbStrock) {
        this.nbStrock = nbStrock;
    }

    @Override
    public String toString() {
        return "{" +
            " nom='" + getNom() + "'" +
            ", marque='" + getMarque() + "'" +
            ", description='" + getDescription() + "'" +
            ", prix='" + getPrix() + "'" +
            ", nbStrock='" + getNbStrock() + "'" +
            "}";
    }

}
