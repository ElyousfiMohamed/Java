package Metier;

public class Employe extends Personne{
    private int code;
    public Employe(){}
    public Employe(String nom, String prenom, String email, int code){
        super(nom,prenom,email);
        this.code = code;
    }

    public void afficher() { // redefinition de la methode afficher de la classe mere Personne
        super.afficher();
        System.out.println("code : " + this.code);
    }
}
