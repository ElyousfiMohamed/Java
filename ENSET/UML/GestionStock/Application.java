package GestionStock;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Application {
    public static void main(String[] args) {
    
        Client client = getClient(Long.valueOf(1));

        for(Produit p : getProduits(client, getFactures(client))) {
            int helper = 0;
            for(LigneDeCommande lng : p.getLignesDeCommande()){
                if(p.getId() == lng.getProduit().getId())
                    helper++;
            }
            System.out.println();
            System.out.println();
            System.out.println("Le produit numero "+p.getId()+"("+p.getDesignation()+") est commandé "+helper+" fois");

            System.out.println("Factures concerné : ");
            for(Facture f : getFactures(client))
                System.out.println("- Facture numero : "+f.getNumero() + " -- Date : "+f.getDate());
            
            System.out.println("Il est commandé par le(s) client(s) : \n- "+client.getNom());
            helper = 0;
            for(LigneDeCommande lng : p.getLignesDeCommande()) {
                helper += lng.getQte();
            }
            System.out.println("Quantité commandé : \n- "+helper);
            System.out.println("Sous total : \n- "+helper*p.getPrix()+"\n\n\n");
        }

        /*System.out.println("---------------------------------------------");
        System.out.println("     Produit|     Qte commandee|   Sous total");
        System.out.println("---------------------------------------------");

        for(Produit p : getProduits(client, getFactures(client))) {
            int helper = 0;
            for(LigneDeCommande lng : p.getLignesDeCommande()) {
                helper += lng.getQte();
            }
            System.out.printf("%12s| %16d | %10.2f\n",p.getDesignation(),helper,helper*p.getPrix());
        }

        System.out.println("---------------------------------------------");
        System.out.println("");
        System.out.println("");*/
    }

    public static Client getClient(Long idClient) {
        return new Client(idClient, "Ali Moufid");
    }

    public static List<Facture> getFactures(Client client) {

        Facture facture1 = new Facture("1/A", new Date(2020, 1, 1), client);
        Facture facture2 = new Facture("2/A", new Date(2020, 1, 1), client);
        List<Facture> facturesClient = new ArrayList<>();
        facturesClient.add(facture1);
        facturesClient.add(facture2);

        client.setFactures(facturesClient);

        return facturesClient;
    }

    public static ArrayList<Produit> getProduits(Client client,List<Facture> facturesClient) {
        ArrayList<Produit> produits = new ArrayList<Produit>();

        Produit produit1 = new Produit(Long.valueOf(1), "Iphone X", Double.valueOf(14000.00));
        Produit produit2 = new Produit(Long.valueOf(2), "Airpods 2", Double.valueOf(3000.00));

        
        LigneDeCommande ligne11 = new LigneDeCommande(client.getId(), Integer.valueOf(2), Double.valueOf(28000.00), facturesClient.get(0), produit1);
        LigneDeCommande ligne21 = new LigneDeCommande(client.getId(), Integer.valueOf(1), Double.valueOf(18000.00), facturesClient.get(1), produit1);
        ArrayList<LigneDeCommande> lignesDeCommande1 = new ArrayList<LigneDeCommande>();
        lignesDeCommande1.add(ligne11);
        lignesDeCommande1.add(ligne21);
        produit1.setLignesDeCommande(lignesDeCommande1);
        
        LigneDeCommande ligne12 = new LigneDeCommande(client.getId(), Integer.valueOf(3), Double.valueOf(14000.00), facturesClient.get(0), produit2);
        LigneDeCommande ligne22 = new LigneDeCommande(client.getId(), Integer.valueOf(1), Double.valueOf(3000.00), facturesClient.get(1), produit2);
        ArrayList<LigneDeCommande> lignesDeCommande2 = new ArrayList<>();
        lignesDeCommande2.add(ligne12);
        lignesDeCommande2.add(ligne22);
        produit2.setLignesDeCommande(lignesDeCommande2);

        produits.add(produit1);
        produits.add(produit2);

        return produits;
    }

    

}
