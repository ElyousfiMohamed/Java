package TP2.Exercice1;


public class Ingenieur extends Employe{
    private String specialite;

    public Ingenieur(String nom,String prenom,String email,String telephone,double salaire,String specialite) {
        super(nom, prenom, email, telephone, salaire);
        this.specialite = specialite;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    @Override
    public double calculerSalaire() {
        return getSalaire()+(getSalaire()*0.15);
    }

    public String toString(){
        return super.toString()+ " / specialite : "+specialite;
    }
}
