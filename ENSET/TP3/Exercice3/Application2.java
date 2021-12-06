package TP3.Exercice3;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        int choix = 0;
        Scanner sc = new Scanner(System.in);
        MetierClientImpl mpi = new MetierClientImpl("clients");
        mpi.getAll();
        String nom;
        while(choix != 6) {
            
            switch(choix) {
                case 1 : 
                    for(Client temp : mpi.getClients()) {
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
                    Client c=new Client();
                    System.out.println("\n***Saisie des informations du Client***");
                    System.out.print("Nom : ");
                    c.setNom(sc.nextLine());
                    c.setNom(sc.nextLine());
                    System.out.print("Prenom : ");
                    c.setPrenom(sc.nextLine());
                    System.out.print("Adresse : ");
                    c.setAdresse(sc.nextLine());
                    System.out.print("tel : ");
                    c.setTel(sc.nextLine());
                    System.out.print("Email : ");
                    c.setEmail(sc.nextLine());
                    mpi.add(c);
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

            System.out.println("1. Afficher la liste des clients");
            System.out.println("2. Rechercher un client par son nom");
            System.out.println("3. Ajouter un nouveau client dans la liste");
            System.out.println("4. Supprimer un client par nom");
            System.out.println("5. Sauvegarder les clients");
            System.out.println("6. Quitter ce programme");

            System.out.print("\nVotre choix : ");
            choix = sc.nextInt();
        }
        sc.close();
    }
}
