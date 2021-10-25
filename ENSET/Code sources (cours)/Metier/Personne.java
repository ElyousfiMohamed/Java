package Metier;
public class Personne {
    private String nom;      // si il est protected donc il est accessible aussi a partir 
    private String prenom;   // des classse de meme package ** meme regle pour les methodes **
    private String email;
    public static int c;     // attribut static ( depend de la classe et pas d'objets )

    public Personne(){}
    public Personne(String nom, String prenom, String email){
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        c++;
    }

    public void afficher() {
        System.out.println("*********************");
        System.out.println("Nom : " + this.nom);
        System.out.println("Prenom : " + this.prenom);
        System.out.println("email : " + this.email);
    }

    @Override
    public String toString() {
        return "Personne { nom : "+this.nom+", prenom : "+this.prenom+", email : "+this.email+"}";
    }
    

}
