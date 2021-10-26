package TP2.Exercice2;

public class Reponse {
    private String titre;
    private boolean correcte;

    public Reponse(String titre, boolean correcte) {
        this.titre = titre;
        this.correcte = correcte;
    }

    @Override
    public String toString() {
        return "titre : " + titre;
    }

    public boolean getCorrecte() {
        return correcte;
    }

    public String getTitre() {
        return titre;
    }
}
