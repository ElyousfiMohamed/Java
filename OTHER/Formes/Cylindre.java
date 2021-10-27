package OTHER.Formes;

public class Cylindre extends Cercle {
    private Cercle base;
    private double hauteur;

    public Cercle getBase() {
        return base;
    }

    public double getHauteur() {
        return hauteur;
    }

    public void setBase(Cercle base) {
        this.base = base;
    }

    public void setHauteur(double hauteur) {
        this.hauteur = hauteur;
    }

    @Override
    public String toString() {
        return base.toString() + " / Hauteur = "+hauteur;
    }  

    public Cylindre (){}
    public Cylindre (char nom, double abs, double ord, double rayon, double hauteur){
        super(nom, abs, ord, rayon);
        this.hauteur = hauteur;
    }
    public Cylindre (Cercle base,double hauteur){
        this.base = base;
        this.hauteur = hauteur;
    }

    public double surface() {
        return (double)(2*Math.PI*base.getRayon()*hauteur);
    }

    public double volume() {
        return (double)(Math.PI*Math.pow(base.getRayon(), 2)*hauteur);
    }
}
