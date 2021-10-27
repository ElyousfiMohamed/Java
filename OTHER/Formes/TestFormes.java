package OTHER.Formes;

public class TestFormes {
    public static void main(String[] args) {
        Point centre = new Point('c',5.5,6.6);
        Cercle base = new Cercle(centre, 5);
        Cylindre cy1 = new Cylindre(base, 9.6);

        System.out.println("Surface du base : "+base.surface());
        System.out.println("Surface du cylindre : "+cy1.surface());
        System.out.println("volume du cylindre : "+cy1.volume());

        centre.setAbs(1);
        centre.setOrd(1);
        base.setRayon(1);
        cy1.setHauteur(1);

        System.out.println("Surface du base : "+base.surface());
        System.out.println("Surface du cylindre : "+cy1.surface());
        System.out.println("volume du cylindre : "+cy1.volume());
    }
}
    
