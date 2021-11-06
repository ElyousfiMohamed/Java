package TP2.Exercice1;


public class Manager extends Employe{
    private String service;

    public Manager(String nom,String prenom,String email,String telephone,double salaire,String service) {
        super(nom, prenom, email, telephone, salaire);
        this.service = service;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    @Override
    public double calculerSalaire() {
        return getSalaire()+(getSalaire()*0.20);
    }

    public String toString(){
        return super.toString()+ " / service : "+service;
    }
}

