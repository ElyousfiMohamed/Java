import java.util.Scanner;

public class Exercice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String choix = "";
        String chaine = "";
        while(!choix.equals("quitter")){
            System.out.println("**********MENU**********");
            System.out.println("Tappez \"saisir\" pour saisir une chaine de caracteres");
            System.out.println("Tappez \"afficher\" pour afficher la chaine de caracteres");
            System.out.println("Tappez \"inverser\" pour inverser la chaine de caracteres");
            System.out.println("Tappez \"nbrmots\" pour afficher le nombre des mots dans la chaine de caracteres");
            System.out.println("Tappez \"quitter\" pour quitter");
            System.out.println("************************\n\n");

            System.out.print("choix : ");
            choix = sc.nextLine();
            switch(choix) {
                case "saisir": 
                    System.out.println("Veuillez saisir une chaine");
                    chaine = sc.nextLine();
                    chaine = sc.nextLine();
                    break;
                case "afficher": 
                    System.out.println("Votre chaine **"+chaine+"**");
                break;
                case "inverser": 
                    StringBuilder strb = new StringBuilder(chaine);
		            chaine = strb.reverse().toString();
                    System.out.println("Votre chaine inverser **"+chaine+"**");
                break;
                case "nbrmots": 
                    String tab[] = chaine.trim().split(" ");
                    System.out.println("nombre des mots dans la chaines est : " + tab.length);
                break;
            }

            if(!choix.equals("quitter")) {
                System.out.println("Frappez une touche pour revenir au menu");

                try{
                System.in.read();
                }  
                catch(Exception e){} 
            }
             
        }
        sc.close();
    }
}
