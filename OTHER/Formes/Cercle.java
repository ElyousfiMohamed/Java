package OTHER.Formes;

public class Cercle extends Point {
    private Point centre;
    private double rayon;

    public Point getCentre() {
        return centre;
    }

    public double getRayon() {
        return rayon;
    }

    public void setCentre(Point centre) {
        this.centre = centre;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }

    @Override
    public String toString() {
        return centre.toString()+" / R = "+rayon;
    }  

    public Cercle(){}
    public Cercle(char nom, double abs, double ord, double rayon){
        super(nom, abs, ord);
        this.rayon = rayon;
    }
    public Cercle(Point centre, double rayon){
        this.centre = centre;
        this.rayon = rayon;
    }

    public double surface() {
        return Math.PI*Math.pow(rayon, 2);
    }
}
