package TP2.Exercice1;


public abstract class Employe {
    private String nom;
    private String prenom;
    private String email;
    private String telephone;
    private double salaire;

    public Employe(String nom,String prenom,String email,String telephone,double salaire){
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.telephone = telephone;
        this.salaire = salaire;
    }

    public abstract double calculerSalaire();

    @Override
    public String toString() {
        return "nom : " + nom + " / prenom : "+ prenom + " / email : " + email + " / telephone : " + telephone + " / salaire : " + salaire;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getEmail() {
        return email;
    }

    public String getTelephone() {
        return telephone;
    }
    
    public double getSalaire() {
        return salaire;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
