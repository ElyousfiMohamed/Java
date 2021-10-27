package OTHER.Compte;

public class Compte {
    private int numeroCompte;
    private double soldeCompte = 0;
    private static int nombreClients = 0;

    public Compte() {nombreClients++;}
    public Compte(int numeroCompte, double soldeCompte) {
        this.numeroCompte = numeroCompte;
        this.soldeCompte = soldeCompte;
        nombreClients++;
    }

    public void deposer(float som) {
        this.soldeCompte += som;
    }

    public void retirer(float som) {
        this.soldeCompte-= som;
    }

    public double getSoldeCompte() {
        return soldeCompte;
    }

    public int getNumeroCompte() {
        return numeroCompte;
    }

    public static int getNombreClients() {
        return nombreClients;
    }

    public String infos() {
        return "Compte numero : "+numeroCompte+", Solde : "+soldeCompte+"DH";
    }
}
