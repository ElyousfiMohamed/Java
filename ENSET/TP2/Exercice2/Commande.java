package TP2.Exercice2;

public class Commande {
    private String reference;
    private Client client;
    private String dateCommande;
    private String etatCommande;

    public Commande(String reference, Client client, String dateCommande, String etatCommande) {
        this.reference = reference;
        this.client = client;
        this.dateCommande = dateCommande;
        this.etatCommande = etatCommande;
    }

    public Commande() {
    }

    public String getReference() {
        return this.reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public Client getClient() {
        return this.client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getDateCommande() {
        return this.dateCommande;
    }

    public void setDateCommande(String dateCommande) {
        this.dateCommande = dateCommande;
    }

    public String getEtatCommande() {
        return this.etatCommande;
    }

    public void setEtatCommande(String etatCommande) {
        this.etatCommande = etatCommande;
    }

    @Override
    public String toString() {
        return "{" +
            " reference='" + getReference() + "'" +
            ", dateCommande='" + getDateCommande() + "'" +
            ", etatCommande='" + getEtatCommande() + "'" +
            "}";
    }
    

    @Override
    public boolean equals(Object o) {
       return this.reference.equals(((Commande)o).reference);
    }

}
