package TP.Exercice1;

public class Application {
    public static void main(String[] args) {
        Adherent adh1 = new Adherent("ELYOUSFI", "Mohamed", "mohamed5elyousfi@gmail.com", "+212622222222", 21, 1258);
        System.out.println("affichage des informations d'Adherent");
        adh1.afficher();
        

        Auteur aut1 = new Auteur("TAIFAOUI", "Abdellah", "taifaoui7@gmail.com", "+212688888888", 21, 5);
        Livre livre1 = new Livre(9586, "of mice and man", aut1);
        System.out.println("\n\n\naffichage des informations du Livre");
        livre1.afficher();
    }
}
