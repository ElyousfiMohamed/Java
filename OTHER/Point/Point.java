package OTHER.Point;

public class Point {
    private char nom;
    private double abs;

    public Point () {}
    public Point (char nom, double abs) {
        this.nom = nom;
        this.abs = abs;
    }

    public double getAbs() {
        return abs;
    }

    public char getNom() {
        return nom;
    }

    public void setAbs(double abs) {
        this.abs = abs;
    }

    public void setNom(char nom) {
        this.nom = nom;
    }

    public void affiche() {
        System.out.println(nom+"("+abs+")");
    }

    public void translatpr(double trans) {
        this.abs += trans;
    }

    public double distance(Point p) {
        return Math.abs(p.abs - this.abs);
    }

    public void comparer(Point p) {
        if(this.abs == p.abs) 
            System.out.println("egaux");
        else
            System.out.println("pas egaux");
    }
}
