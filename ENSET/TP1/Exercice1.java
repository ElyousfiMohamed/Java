import java.util.Arrays;
import java.util.Scanner;

public class Exercice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //rangé les notes saisie par l'utilisateur dans une chaine de caractéres separés par un espace
        float note=0;
        String notes = "";
        System.out.println("Veuillez saisir les notes des etudiants / \'-1 pour arreter\'");
        while(note != -1) {
            System.out.print("note : ");
            note = sc.nextFloat();
            if(note != -1)
            notes = notes + note + " "; 
        }

        //convertir la chaine de caracteres a un tableau des chaines de caractéres
        String notesTabString[] = notes.split(" ");

        //convertir et affecter les notes a un tableau des réels
        float notesTab[] = new float[notesTabString.length];
        for(int i=0;i<notesTabString.length;i++) 
            notesTab[i] = Float.parseFloat(notesTabString[i]);
        
        //affichage du tableau trier
        Arrays.sort(notesTab);
        System.out.println("tableau des notes trier : "+Arrays.toString(notesTab));

        float somme = 0;
        for(float n: notesTab) {
            somme+=n;
        }
        
        //moyenne / min / max / nombre des notes saisi par l'utilisateur
        System.out.println("la moyenne des notes est : "+somme/notesTabString.length);
        System.out.println("la note minimal est : "+notesTab[0]);
        System.out.println("la note maximal est : "+notesTab[notesTabString.length-1]);

        System.out.print("note : ");
        note = sc.nextFloat();
        int i = 0;
        for(float n : notesTab)
            if (n == note)
                i++;
        
        System.out.println("nombre des etudiants ayant "+note+" est : "+i);
        sc.close();
    }
}