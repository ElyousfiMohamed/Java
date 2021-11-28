package Serialisation;

import java.beans.XMLDecoder;
import java.io.File;
import java.io.FileInputStream;

public class DeserialiseXML {
    public static void main(String[] args) {
        try{
            File f = new File("D:\\ENSET\\S3\\JAVA\\Serialisation\\employe.xml");
            FileInputStream fis = new FileInputStream(f);
            XMLDecoder xd = new XMLDecoder(fis);
            
            Employe eS1 = (Employe) xd.readObject();
            System.out.println("Nom : " + eS1.getNom());
            System.out.println("Prenom : " + eS1.getPrenom());
            System.out.println("Adresse / rue : " + eS1.getAdr().getRue() + " - ville : " + eS1.getAdr().getVille() + " - pays : "+eS1.getAdr().getPays());

            xd.close();
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}
