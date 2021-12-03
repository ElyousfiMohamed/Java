package TP3.Exercice2;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        //recupération des contacts
        try{
            String nomContact,numero,contactsPath = "D:/ENSET/S3/JAVA/TP3/Exercice2/contact";
            Scanner sc = new Scanner(System.in);
            ArrayList<DossierContact> contacts = new ArrayList<>();
            int choix = 0,index = 0;
            boolean flag = false;  

            File f = new File(contactsPath);
            String paths[] = f.list();
            for(String path : paths) {
                f = new File(contactsPath + "/" + path);
                BufferedReader br = new BufferedReader(new FileReader(f));
                contacts.add(new DossierContact(f.getName(),br.readLine()));
                br.close();
            }

            while(choix != 5) {
            
                switch(choix) {
                    case 1 : 
                        System.out.print("nom du contact : ");
                        nomContact = sc.nextLine();
                        nomContact = sc.nextLine();
                        for(DossierContact c:contacts) {
                            if(c.getNom().equals(nomContact)) {
                                System.out.println("Numero contact : "+c.getNumero());
                                flag = true;
                            }
                        }
    
                        if(!flag) {
                            System.out.println("Aucune contact trouvé pour ce nom");
                        }
    
                        flag = false;
                        break;
                    case 2 : 
                        System.out.println("nom et numéro du contact : ");
    
                        nomContact = sc.nextLine();
                        nomContact = sc.nextLine();
                        numero = sc.nextLine();
                        DossierContact contact = new DossierContact(nomContact,numero);
                        for(DossierContact ds : contacts) {
                            if(ds.getNom().equals(contact.getNom()))
                                flag = true;
                        }
                        
                        if(flag == false) {
                            contacts.add(contact);
                        }else {
                            System.out.println("**Contact deja existe**");
                            flag = false;
                        }
                        break;
                    case 3 : 
                        System.out.print("nom du contact a supprimer: ");
                        nomContact = sc.nextLine();
                        nomContact = sc.nextLine();
                        index = 0;
                        for(int i = 0;i<contacts.size();i++) {
                            if((contacts.get(i).getNom()).equals(nomContact)) {
                                contacts.remove(index);
                            }
                            index++;
                        }
                        break;
                    case 4 : 
                        System.out.print("nom du contact a modifier: ");
                        nomContact = sc.nextLine();
                        nomContact = sc.nextLine();
                        for(DossierContact cnt:contacts) {
                            if(cnt.getNom().equals(nomContact)) {
                                System.out.print("nouveau numero ? : ");
                                numero = sc.nextLine();
                                cnt.setNumero(numero);
                            }
                        }
                        f = new File(contactsPath + "/" + nomContact);
                        f.delete();
                        break;
                }
    
                System.out.println("1. Rechercher un numéro de téléphone.");
                System.out.println("2. Ajouter un nouveau contact.");
                System.out.println("3. Supprimer un contact.");
                System.out.println("4. Changer le numéro de téléphone dun contact.");
                System.out.println("5. Quitter ce programme.");
    
                System.out.print("\nVotre choix : ");
                choix = sc.nextInt();
            }

            f = new File(contactsPath);
            paths = f.list();
            flag = false;

            //cas normal
            for(DossierContact ds : contacts) {
                for(String path : paths) {
                    f = new File(contactsPath + "/" + path);
                    if(ds.getNom().equals(f.getName()))
                        flag = true;
                }
                
                if(flag == false) {
                    BufferedWriter bw = new BufferedWriter(new FileWriter(new File(contactsPath+"/"+ds.getNom())));
                    bw.write(ds.getNumero());    
                    bw.close();
                }

                flag = false;
            }
            
            //cas de supression
            for(String path : paths) {
                for(DossierContact ds : contacts) {
                    f = new File(contactsPath + "/" + path);
                    if(ds.getNom().equals(f.getName()))
                        flag = true;
                }

                if(flag == true) {
                    flag = false;
                    continue;
                }else {
                    f = new File(contactsPath + "/" + path);
                    f.delete();
                }
            }

            sc.close();
        }catch(Exception e) {
            e.printStackTrace();
        }finally {
        }
    }
}
