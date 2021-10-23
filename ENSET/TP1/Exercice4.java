import java.util.Scanner;

public class Exercice4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String verbe;

        do{
            System.out.print("Entrez un verbe du premier groupe : ");
            verbe = sc.nextLine();
        }while(verbe.charAt(verbe.length()-2) != 'e' || verbe.charAt(verbe.length()-1) != 'r');

        StringBuilder verbeCong = new StringBuilder(verbe);

        System.out.println("je " + verbeCong.deleteCharAt(verbeCong.length()-1));
        verbeCong.append('s');
        System.out.println("tu " + verbeCong);
        System.out.println("il " + verbeCong.deleteCharAt(verbeCong.length()-1));
        verbeCong.deleteCharAt(verbeCong.length()-1);
        System.out.println("nous " + verbeCong + "ons");
        System.out.println("vous " + verbeCong + "ez");
        System.out.println("ils " + verbeCong + "ent");


        sc.close();
    }
}
