package Serialisation;

import java.io.Serializable;

public class Employe implements Serializable{
    private String nom;
    private String prenom;
    private Adresse adr;

    public Employe() {
    }

    public Employe(String nom, String prenom, Adresse adr) {
        this.nom = nom;
        this.prenom = prenom;
        this.adr = adr;
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

    public Adresse getAdr() {
        return this.adr;
    }

    public void setAdr(Adresse adr) {
        this.adr = adr;
    }

}
