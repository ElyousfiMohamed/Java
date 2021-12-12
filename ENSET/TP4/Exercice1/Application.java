package TP4.Exercice1;

public class Application {
    public static void main(String[] args) {
        Thread []threads = new Thread[10];
        
        for(int i=0;i<10;i++) {
            threads[i] = new Thread(new Talkative(i));
        }

        for(int i=0;i<10;i++) {
            threads[i].start();
        }
    }
}
