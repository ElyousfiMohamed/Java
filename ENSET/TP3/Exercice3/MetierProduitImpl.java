package TP3.Exercice3;

import java.io.*;
import java.util.ArrayList;

public class MetierProduitImpl implements IMetier<Produit>,Serializable{
    private ArrayList<Produit> produits;
    private transient String fileName;


    public MetierProduitImpl(String fileName) {
        produits = new ArrayList<>();
        this.fileName = fileName;
    }

    public MetierProduitImpl(ArrayList<Produit> produits, String fileName) {
        this.produits = produits;
        this.fileName = fileName;
    }


    public ArrayList<Produit> getProduits() {
        return this.produits;
    }

    public void setProduits(ArrayList<Produit> produits) {
        this.produits = produits;
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
            " produits='" + getProduits() + "'" +
            ", fileName='" + getFileName() + "'" +
            "}";
    }

    public Produit add(Produit o) {
        produits.add(o);
        return o;
    }

    public ArrayList<Produit> getAll(){
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("D:/ENSET/S3/JAVA/TP3/Exercice3/"+this.fileName+".dat")));
            this.produits = ((MetierProduitImpl)ois.readObject()).produits;
            ois.close();
        }catch (Exception e) {
            
        }
        return this.produits;
    }
    public Produit findByNom(String nom) {
        for(Produit p : produits) {
            if(nom.equals(p.getNom())) {
                return p;
            }
        }
        System.out.println("Pas de produit pour ce nom");
        return new Produit();
    }
    public void delete(String nom) {
        for(Produit p : produits) {
            if(nom.equals(p.getNom())) {
                produits.remove(p);
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
