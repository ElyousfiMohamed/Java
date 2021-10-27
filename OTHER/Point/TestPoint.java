package OTHER.Point;

public class TestPoint {
    public static void main(String[] args) {
        Point p1 = new Point('a',5.8);
        Point p2 = new Point('b',18.8);

        p1.affiche();
        p2.affiche();

        System.out.println("distance entre p1 et p2 : "+p1.distance(p2));
        System.out.print("(comparaison par la methode comparer) p1 et p2 sont ");
        p1.comparer(p2);
        System.out.println();
        System.out.print("(comparaison par ==) p1 et p2 sont ");
        if(p1 == p2) 
            System.out.println("egaux");
        else
            System.out.println("pas egaux");
    }
}
