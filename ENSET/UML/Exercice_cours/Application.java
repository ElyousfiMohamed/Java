package Exercice_cours;

public class Application {
    public static void main(String[] args) {
        Client client = getClient(1); 
        Compte compte = getCompte(client);
        creerOperations(compte);

        compte.detailCompte();
    }

    public static Client getClient(int idClient) {
        return new Client(idClient, "Ali","Moufid");
    }
    public static Compte getCompte(Client client) {
        return new Compte(1, 12345678,client);
    }
    public static void creerOperations(Compte compte) {
        compte.getOperations().add(new Operation("09/10/2021", "virement", 5000));
        compte.getOperations().add(new Operation("09/10/2021", "virement", 8000));
        compte.getOperations().add(new Operation("09/10/2021", "retrait", 1000));
        compte.getOperations().add(new Operation("09/10/2021", "retrait", 2000));
    }
}
