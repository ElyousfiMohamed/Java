package Serialisation;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Application2 {
    public static void main(String[] args) {
        try{
            File f = new File("D:\\ENSET\\S3\\JAVA\\Serialisation\\employe.bat");
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);

            Employe eS1 = (Employe) ois.readObject();
            System.out.println("Nom : " + eS1.getNom());
            System.out.println("Prenom : " + eS1.getPrenom());
            System.out.println("Adresse / rue : " + eS1.getAdr().getRue() + " - ville : " + eS1.getAdr().getVille() + " - pays : "+eS1.getAdr().getPays());

            ois.close();
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}
