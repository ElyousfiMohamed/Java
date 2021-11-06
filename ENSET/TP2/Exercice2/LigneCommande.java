package TP2.Exercice2;

public class LigneCommande {
    private int quantite;
    private Commande c;
    private Ordinateur o;

    public LigneCommande(int quantite, Commande c, Ordinateur o) {
        this.quantite = quantite;
        this.c = c;
        this.o = o;
    }

    public LigneCommande() {
    }

    public int getQuantite() {
        return this.quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public Commande getC() {
        return this.c;
    }

    public void setC(Commande c) {
        this.c = c;
    }

    public Ordinateur getO() {
        return this.o;
    }

    public void setO(Ordinateur o) {
        this.o = o;
    }

    @Override
    public String toString() {
        return "{" +
            " quantite='" + getQuantite() + "'" +
            ", c='" + getC() + "'" +
            ", o='" + getO() + "'" +
            "}";
    }
}
