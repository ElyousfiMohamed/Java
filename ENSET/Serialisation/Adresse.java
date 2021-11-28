package Serialisation;

import java.io.Serializable;

public class Adresse implements Serializable{
    private String rue;
    private String ville;
    private String pays;


    public Adresse() {
    }

    public Adresse(String rue, String ville, String pays) {
        this.rue = rue;
        this.ville = ville;
        this.pays = pays;
    }

    public String getRue() {
        return this.rue;
    }

    public String getVille() {
        return this.ville;
    }

    public String getPays() {
        return this.pays;
    }


    public void setRue(String rue) {
        this.rue = rue;
    }
    public void setVille(String ville) {
        this.ville = ville;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }
}