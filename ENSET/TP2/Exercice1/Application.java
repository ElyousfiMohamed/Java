package TP2.Exercice1;

public class Application {
    public static void main(String[] args) {
        Employe e1 = new Ingenieur("ELYOUSFI", "Mohamed", "mohamed5elyousfi@gmail.com", "+212688749685", 9000, "cloud");
        Employe e2 = new Manager("ELYOUSFI", "Elmostafa", "elmostafaelyousfi@gmail.com", "+21258978485", 15000, "informatique");

        System.out.println("informations d'Ingenieur : \n" + e1.toString());
        System.out.println("informations du Manager : \n" + e2.toString());

        e1.calculerSalaire();
        System.out.println("Salaire d'ingenieur apres augmentation : " + e1.getSalaire());
        e2.calculerSalaire();
        System.out.println("Salaire du Manager apres augmentation : " + e2.getSalaire());

    }
}
