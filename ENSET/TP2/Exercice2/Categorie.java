package TP2.Exercice2;

import java.util.ArrayList;

public class Categorie {
    private String nom;
    private String description;
    private ArrayList<Ordinateur> ordinateurs;

    public Categorie (String nom,String description) {
        this.nom = nom;
        this.description = description;
        ordinateurs = new ArrayList<Ordinateur>();
    }

    public Categorie() {
    }

    public String getNom() {
        return nom;
    }

    public String getDescription() {
        return description;
    }

    public ArrayList<Ordinateur> getOrdinateurs() {
        return ordinateurs;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setOrdinateurs(ArrayList<Ordinateur> ordinateurs) {
        this.ordinateurs = ordinateurs;
    }

    public void ajouterOrdianteur(Ordinateur o) {
        boolean existe = false;
        for(Ordinateur or : this.ordinateurs) {
            if(or.equals(o)) {
                existe = true;
                break;
            }
        }

        if(!existe)
            this.ordinateurs.add(o);
    }

    public void supprimerOrdianteur(Ordinateur o) {
        for(Ordinateur or : this.ordinateurs) {
            if(or.equals(o)) {
                this.ordinateurs.remove(o);
                break;
            }
        }
    }

    public ArrayList<Ordinateur> rechercherParPrix(double prix) {
        ArrayList<Ordinateur> ordPrix = new ArrayList<Ordinateur>();
        for(Ordinateur or : this.ordinateurs) {
            if(or.getPrix() == prix) 
                ordPrix.add(or);
        }

        return ordPrix;
    }


    @Override
    public String toString() {
        return "{" +
            " nom='" + getNom() + "'" +
            ", description='" + getDescription() + "'" +
            "}";
    }
    
}
