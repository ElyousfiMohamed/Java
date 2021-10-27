package OTHER.Formes;

public class Point {
    private char nom;
    private double abs;
    private double ord;

    public char getNom() {
        return nom;
    }

    public double getAbs() {
        return abs;
    }

    public double getOrd() {
        return ord;
    }

    public void setNom(char nom) {
        this.nom = nom;
    }

    public void setAbs(double abs) {
        this.abs = abs;
    }

    public void setOrd(double ord) {
        this.ord = ord;
    }

    @Override
    public String toString() {
        return nom+"("+abs+","+ord+")";
    }    

    public Point(){}
    public Point(char nom, double abs, double ord){
        this.nom = nom;
        this.abs = abs;
        this.ord = ord;
    }

}
