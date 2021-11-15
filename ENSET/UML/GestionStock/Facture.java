package GestionStock;

import java.util.Date;

public class Facture {


    private String numero;
    private Date date;
    //many to one
    private Client client;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Facture(String numero, Date date, Client client) {
        this.numero = numero;
        this.date = date;
        this.client = client;
    }

    public Client getClient() {
        return client;
    }

}
