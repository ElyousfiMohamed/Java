package TP2.Exercice2;

public class Ordinateur {
    private String nom;
    private String marque;
    private double prix;
    private String description;
    private int nombreEnStock;

    public Ordinateur(String nom,String marque,double prix,String description,int nombreEnStock) {
        this.nom = nom;
        this.marque = marque;
        this.prix = prix;
        this.description = description;
        this.nombreEnStock = nombreEnStock;
    }

    public Ordinateur() {
    }

    public String getNom() {
        return nom;
    }

    public String getMarque() {
        return marque;
    }

    public double getPrix() {
        return prix;
    }
    
    public String getDescription() {
        return description;
    }

    public int getNombreEnStock() {
        return nombreEnStock;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setNombreEnStock(int nombreEnStock) {
        this.nombreEnStock = nombreEnStock;
    }

    public double prixTotal(int quantity) {
        return prix*quantity;
    }

    @Override
    public boolean equals(Object o){
        return ((Ordinateur)o).description == this.description && ((Ordinateur)o).nom == this.nom && ((Ordinateur)o).marque == marque && ((Ordinateur)o).prix == this.prix && ((Ordinateur)o).nombreEnStock == this.nombreEnStock;
    }


    @Override
    public String toString() {
        return "{" +
            " nom='" + getNom() + "'" +
            ", marque='" + getMarque() + "'" +
            ", prix='" + getPrix() + "'" +
            ", description='" + getDescription() + "'" +
            ", nombreEnStock='" + getNombreEnStock() + "'" +
            "}";
    }

}
