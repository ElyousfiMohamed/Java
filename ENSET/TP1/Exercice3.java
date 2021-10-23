import java.util.Scanner;

public class Exercice3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nb_occurences[] = new int[26];
        String ch;

        System.out.println("Entrez une ligne de texte : ");
        ch  = sc.nextLine();

        for(int i = 0;i < ch.length() ; i++) {
            //cas du caractere en maj
            if(ch.charAt(i) >= 'A' && ch.charAt(i) <= 'Z')
                nb_occurences[ch.charAt(i)-'A']++;
            //cas du caractere en min
            if(ch.charAt(i) >= 'a' && ch.charAt(i) <= 'z')
                nb_occurences[ch.charAt(i)-'a']++;
        }

        for(int i = 0; i < 26 ; i++) {
            if(nb_occurences[i] != 0) 
                System.out.println(nb_occurences[i] + " fois la lettre " + Character.toString('a'+ i));
        }
        
        sc.close();
    }
}
