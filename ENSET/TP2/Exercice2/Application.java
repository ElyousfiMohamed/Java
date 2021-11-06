package TP2.Exercice2;

import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {
        ArrayList<Ordinateur> ordinateursDell = new ArrayList<>();
        ordinateursDell.add(new Ordinateur("precision m4800", "DELL", 4500, "Une station de travail 15\" puissante dotée de capacités d’alimentation et de stockage hors pair.", 52));
        ordinateursDell.add(new Ordinateur("xps 13", "DELL", 5400, "11th Generation Intel® Core™ i3-1115G4 (6 MB cache, 2 cores, 4 threads, 3.00 GHz to 4.10 GHz)", 25));
        ordinateursDell.add(new Ordinateur("dell latitude e5440", "DELL", 4100, "Présentation produit : Dell Ordinateur Portable - Latitude E5440 - Intel Core i5/1.9 GHz - 8Go RAM - 500Go HDD", 12));

        Categorie catg = new Categorie("DELL", "cette categorie contient les differents produits de la marque dell");
        catg.setOrdinateurs(ordinateursDell);

        Client clt = new Client("ELYOUSFI", "Mohamed", "N50 B8 khouribga", "mohamed5elyousfi@gmail.com", "khouribga", "+212658897441");

        Commande cmd = new Commande("r78456", clt, "04/11/2021", "en cours de preparation");
        clt.ajouterCommande(cmd);

        ArrayList<LigneCommande> ligneCommandes = new ArrayList<>();
        ligneCommandes.add(new LigneCommande(5, cmd, ordinateursDell.get(0)));
        ligneCommandes.add(new LigneCommande(2, cmd, ordinateursDell.get(1)));
        ligneCommandes.add(new LigneCommande(4, cmd, ordinateursDell.get(2)));

        System.out.println("commande du client : "+cmd.getClient());
        for(LigneCommande c : ligneCommandes){
            if((c.getC()).equals(cmd))
                System.out.print("\n"+c);
        }
        
    }
}
