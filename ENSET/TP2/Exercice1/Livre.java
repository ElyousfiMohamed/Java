package TP2.Exercice1;

public class Livre {
    private int ISBN;
    private String titre;
    private Auteur a;

    public Livre(int ISBN, String titre,Auteur a) {
        this.ISBN = ISBN;
        this.titre = titre;
        this.a = a;
    }

    public void afficher() {
        System.out.println("ISBN : " + ISBN + " / titre : " + titre);
        System.out.println("**informations d'auteur**");
        this.a.afficher();
    }
}
