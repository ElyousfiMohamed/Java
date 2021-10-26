package TP2.Exercice2;

public class Question {
    private String titre;
    private String description;
    private Reponse reponses[] = new Reponse[3];
    private int score;

    public Question(String titre, String description,Reponse reponses[]) {
        this.titre = titre;
        this.description = description;

        for(int i=0 ; i < reponses.length ; i++) 
            this.reponses[i] = reponses[i];

        score = 0;
    }

    public Question(String titre, String description) {
        this.titre = titre;
        this.description = description;

        score = 0;
    }

    @Override
    public String toString() {
        return "titre : " + titre + " / description : " + description + "\n\t\t1- "+reponses[0].toString()+"\n\t\t2- "+reponses[1].toString()+"\n\t\t3- "+reponses[2].toString();
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getDescription() {
        return description;
    }

    public Reponse[] getReponses() {
        return reponses;
    }
}