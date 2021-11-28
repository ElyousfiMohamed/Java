package Serialisation;

import java.beans.XMLEncoder;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class SerialiseXML {
    public static void main(String[] args) {
        try{
            File f = new File("D:/ENSET/S3/JAVA/Serialisation/employe.xml");
            FileOutputStream fos = new FileOutputStream(f);
            XMLEncoder x = new XMLEncoder(fos);
            Employe e1 = new Employe("ELYOUSFI", "Mohamed", new Adresse("alkods", "khouribga", "maroc"));
            x.writeObject(e1);
            x.close();
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}
