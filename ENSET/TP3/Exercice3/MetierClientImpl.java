package TP3.Exercice3;

import java.io.*;
import java.util.ArrayList;

public class MetierClientImpl implements IMetier<Client>,Serializable{
    private ArrayList<Client> clients = new ArrayList<>();
    private transient String fileName;


    public MetierClientImpl(String fileName) {
        clients = new ArrayList<>();
        this.fileName = fileName;
    }


    public MetierClientImpl(ArrayList<Client> clients, String fileName) {
        this.clients = clients;
        this.fileName = fileName;
    }


    public ArrayList<Client> getClients() {
        return this.clients;
    }

    public void setClients(ArrayList<Client> clients) {
        this.clients = clients;
    }

    public String getFileName() {
        return this.fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public String toString() {
        return "{" +
            " clients='" + getClients() + "'" +
            ", fileName='" + getFileName() + "'" +
            "}";
    }

    public Client add(Client o) {
        clients.add(o);
        return o;
    }

    public ArrayList<Client> getAll(){
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("D:/ENSET/S3/JAVA/TP3/Exercice3/"+this.fileName+".dat")));
            this.clients = ((MetierClientImpl)ois.readObject()).clients;
            ois.close();
        }catch (Exception e) {
            
        }
        return this.clients;
    }
    public Client findByNom(String nom) {
        for(Client c : clients) {
            if(nom.equals(c.getNom())) {
                return c;
            }
        }
        System.out.println("Pas de produit pour ce nom");
        return new Client();
    }
    public void delete(String nom) {
        for(Client c : clients) {
            if(nom.equals(c.getNom())) {
                clients.remove(c);
            }
        }
    }
    public void saveAll(){
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("D:/ENSET/S3/JAVA/TP3/Exercice3/"+this.fileName+".dat")));
            oos.writeObject(this);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();;
        }
    }

}
