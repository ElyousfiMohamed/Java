package Exercice_cours;

public class Operation {
    private String date;
    private String type;
    private double montant;


    public Operation(String date, String type, double montant) {
        this.date = date;
        this.type = type;
        this.montant = montant;
    }


    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getMontant() {
        return this.montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }


    @Override
    public String toString() {
        return "{" +
            " date='" + getDate() + "'" +
            ", type='" + getType() + "'" +
            ", montant='" + getMontant() + "'" +
            "}";
    }


}
