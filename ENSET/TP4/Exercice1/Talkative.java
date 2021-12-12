package TP4.Exercice1;

public class Talkative implements Runnable{
    private int entier;

    public Talkative(int entier) {
        this.entier = entier;
    }

    public void run() {
        for(int i=1;i<=100;i++) {
            System.out.println(i + " : " + entier);
        }
    }
}
