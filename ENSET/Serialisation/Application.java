package Serialisation;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Application {
    public static void main(String[] args) {
        try{
            File f = new File("D:/ENSET/S3/JAVA/Serialisation/employe.bat");
            FileOutputStream fos = new FileOutputStream(f);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            Employe e1 = new Employe("ELYOUSFI", "Mohamed", new Adresse("alkods", "khouribga", "maroc"));
            oos.writeObject(e1);

            oos.close();
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}
