package GestionStock;

import java.util.ArrayList;
import java.util.List;

public class Produit {
    private Long id;
    private String designation;
    private Double prix;

    //One to many
    private ArrayList<LigneDeCommande> lignesDeCommande;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Double getPrix() {
        return prix;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }

    public Produit(Long id, String designation, Double prix) {
        this.id = id;
        this.designation = designation;
        this.prix = prix;
        lignesDeCommande = new ArrayList<>();
    }

    public ArrayList<LigneDeCommande> getLignesDeCommande() {
        return lignesDeCommande;
    }
    
    public void setLignesDeCommande(ArrayList<LigneDeCommande> lignesDeCommande) {
        this.lignesDeCommande = lignesDeCommande;
    }

}

