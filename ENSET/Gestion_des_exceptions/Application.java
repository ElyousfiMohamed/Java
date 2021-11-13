package Gestion_des_exceptions;

public class Application {
    public static void main(String[] args) {
        //Scenario 1 : no exceptions
        /*try {
            EntierNaturel en = new EntierNaturel(5);
            System.out.println(en.getVal());
            en.setVal(25);
            System.out.println(en.getVal());
            en.decrementer();
            System.out.println(en.getVal());
        }
        catch(NombreNegatifException e) {
            System.out.println(e.getMessage()+" : "+e.getValErr());
        }   */

        //Scenario 2
        try {
            EntierNaturel en = new EntierNaturel(5);
            System.out.println(en.getVal());
            en.setVal(0);
            System.out.println(en.getVal());
            en.decrementer(); // c'est lui qui va generer l'exception et le reste ne va ps etre executé
            System.out.println(en.getVal());
        }
        catch(NombreNegatifException e) {
            System.out.println(e.getMessage()+" : "+e.getValErr());
        }

        //Scenario 3
        /*try {
            EntierNaturel en = new EntierNaturel(5);
            System.out.println(en.getVal());
            en.setVal(-5); // c'est lui qui va generer l'exception et le reste ne va ps etre executé
            System.out.println(en.getVal());
            en.decrementer(); 
            System.out.println(en.getVal());
        }
        catch(NombreNegatifException e) {
            System.out.println(e.getMessage()+" : "+e.getValErr());
        }*/

        //Scenario 4
        /*try {
            EntierNaturel en = new EntierNaturel(-5); // c'est lui qui va generer l'exception et le reste ne va ps etre executé
            System.out.println(en.getVal());
            en.setVal(-5); 
            System.out.println(en.getVal());
            en.decrementer(); 
            System.out.println(en.getVal());
        }
        catch(NombreNegatifException e) {
            System.out.println(e.getMessage()+" : "+e.getValErr());
        }*/
}}
