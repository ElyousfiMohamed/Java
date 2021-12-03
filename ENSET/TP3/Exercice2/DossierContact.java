package TP3.Exercice2;


public class DossierContact{
    private String nom;
    private String numero;


    public DossierContact() {
    }

    public DossierContact(String nom, String numero) {
        this.nom = nom;
        this.numero = numero;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNumero() {
        return this.numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "{" +
            " nom='" + getNom() + "'" +
            ", numero='" + getNumero() + "'" +
            "}";
    }

}
