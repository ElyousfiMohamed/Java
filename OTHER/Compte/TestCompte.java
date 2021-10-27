package OTHER.Compte;

public class TestCompte {
    public static void main(String[] args) {
        Compte c1 = new Compte(1,0);
        Compte c2 = new Compte(2,0);

        c1.deposer(5000);
        System.out.println("Solde : "+c1.getSoldeCompte());
        c1.retirer(200);
        System.out.println(c1.infos());

        c2.deposer(1000);
        System.out.println("Solde : "+c2.getSoldeCompte());
        c2.retirer(350);
        System.out.println(c2.infos());

        System.out.println("nombre des clients : "+Compte.getNombreClients());

    }
}
