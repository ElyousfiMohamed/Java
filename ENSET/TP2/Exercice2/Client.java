package TP2.Exercice2;

import java.util.ArrayList;

public class Client {
    private String nom;
    private String prenom;
    private String adresse;
    private String email;
    private String ville;
    private String telephone;
    private ArrayList<Commande> Commandes;

    public Client(String nom, String prenom, String adresse, String email, String ville, String telephone) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.email = email;
        this.ville = ville;
        this.telephone = telephone;
    }


    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return this.adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getVille() {
        return this.ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getTelephone() {
        return this.telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public ArrayList<Commande> getCommandes() {
        return this.Commandes;
    }

    public void setCommandes(ArrayList<Commande> Commandes) {
        this.Commandes = Commandes;
    }


    @Override
    public String toString() {
        return "{" +
            " nom='" + getNom() + "'" +
            ", prenom='" + getPrenom() + "'" +
            ", adresse='" + getAdresse() + "'" +
            ", email='" + getEmail() + "'" +
            ", ville='" + getVille() + "'" +
            ", telephone='" + getTelephone() + "'" +
            "}";
    }
}
