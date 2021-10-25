package Metier;
public class test {
    public static void main(String[] args) {
        Personne p1 = new Personne("ELYOUSFI", "Mohamed", "mohamed5elyousfi@gmail.com");
        Employe e1 = new Employe("ELYOUSFI", "Oussama", "oussama@gmail.com",15);

        // p1.afficher();
        // e1.afficher();

        System.out.println(p1.toString());

        /* if(e1 instanceof Personne) {
            System.out.println("Vrai");
        } */
    }
}
