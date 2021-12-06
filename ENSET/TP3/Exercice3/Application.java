package TP3.Exercice3;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        int choix = 0;
        Scanner sc = new Scanner(System.in);
        MetierProduitImpl mpi = new MetierProduitImpl("produits");
        mpi.getAll();
        String nom;
        while(choix != 6) {
            
            switch(choix) {
                case 1 : 
                    for(Produit temp : mpi.getProduits()) {
                        System.out.println(temp.toString());
                    }
                    break;
                case 2 : 
                    System.out.print("Nom : ");
                    nom = sc.nextLine();
                    nom = sc.nextLine();
                    System.out.println((mpi.findByNom(nom)).toString());
                    break;
                case 3 : 
                    Produit p=new Produit();
                    System.out.println("\n***Saisie des informations du produit***");
                    System.out.print("Nom : ");
                    p.setNom(sc.nextLine());
                    p.setNom(sc.nextLine());
                    System.out.print("Marque : ");
                    p.setMarque(sc.nextLine());
                    System.out.print("Description : ");
                    p.setDescription(sc.nextLine());
                    System.out.print("Prix : ");
                    p.setPrix(sc.nextDouble());
                    System.out.print("Quantite en stock : ");
                    p.setNbStrock(sc.nextInt());
                    mpi.add(p);
                    break;
                case 4 : 
                    System.out.print("Nom : ");
                    nom = sc.nextLine();
                    nom = sc.nextLine();
                    mpi.delete(nom);
                    break;
                case 5 : 
                    mpi.saveAll();
                    break;
            }

            System.out.println("1. Afficher la liste des produits");
            System.out.println("2. Rechercher un produit par son nom");
            System.out.println("3. Ajouter un nouveau produit dans la liste");
            System.out.println("4. Supprimer un produit par nom");
            System.out.println("5. Sauvegarder les produits");
            System.out.println("6. Quitter ce programme");

            System.out.print("\nVotre choix : ");
            choix = sc.nextInt();
        }
        sc.close();
    }
}
