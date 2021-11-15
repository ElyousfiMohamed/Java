package Exercice_cours;

import java.util.ArrayList;

public class Compte {
    private int id;
    private int numero;
    private double solde_courant = 0;
    private Client client;
    private ArrayList<Operation> operations = new ArrayList<>();

    public Client getClient() {
        return this.client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public ArrayList<Operation> getOperations() {
        return this.operations;
    }

    public void setOperations(ArrayList<Operation> operations) {
        this.operations = operations;
    }

    public Compte(int id, int numero,Client client) {
        this.id = id;
        this.numero = numero;
        this.client = client;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSolde_courant() {
        return this.solde_courant;
    }

    public void setSolde_courant(double solde_courant) {
        this.solde_courant = solde_courant;
    }

    public void calculerSolde() {
        for(Operation o : operations) {
            if(o.getType().equals("virement"))
                solde_courant += o.getMontant(); 
            
            if(o.getType().equals("retrait")) {
                if(solde_courant - o.getMontant() >= 0)
                    solde_courant -= o.getMontant(); 
                else
                    System.out.println("Solde insuffisant");
            }
                
        }
    }

    public void detailCompte() {
        this.calculerSolde();
        System.out.println("Client : "+ client.getNom() + " " + client.getPrenom());
        System.out.println("Compte N° : " + numero);
        System.out.println("-----------------------------");
        System.out.println("    Date    |  Type  |  Mantant  ");
        System.out.println("-----------------------------");
        for(Operation o : operations) {
            System.out.println(o.getDate() + " | " + o.getType() + " | " + o.getMontant());
        }
        System.out.println("-----------------------------");
        System.out.println("      Solde = " + this.solde_courant);
        System.out.println("-----------------------------");
        
    }

}
