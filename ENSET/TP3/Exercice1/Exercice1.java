package TP3.Exercice1;

import java.io.File;
import java.util.Scanner;

public class Exercice1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String cheminInit;

        System.out.print("Donnez le chemin de votre répértoire : ");
        cheminInit = sc.nextLine();

        File f1 = new File(cheminInit);
        explorer(f1,"");

        sc.close();

    }

    public static void explorer(File f,String space) {
        if(f.exists()) {
            String paths[] = f.list();
            for(int i=0;i<paths.length;i++) {
                File fTemp = new File(f.getAbsolutePath() +"/"+ paths[i]);

                System.out.print(space+paths[i]);

                if(fTemp.isDirectory()) {
                    System.out.print(" <DIR> ");
                    System.out.print(fTemp.canRead()? "r":"-");
                    System.out.print(fTemp.canWrite()? "w":"-");
                    System.out.println(fTemp.isHidden()? "h":"-");
                    explorer(fTemp,space+"    ");
                }else {
                    System.out.print(" <FICH> ");
                    System.out.print(fTemp.canRead()? "r":"-");
                    System.out.print(fTemp.canWrite()? "w":"-");
                    System.out.println(fTemp.isHidden()? "h":"-");
                }
            }
        }

    }
}
