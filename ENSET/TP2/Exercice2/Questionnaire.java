package TP2.Exercice2;

public class Questionnaire {
    private String titre;
    private Question questions[] = new Question[5];

    public Questionnaire(String titre, Question questions[]) {
        this.titre = titre;

        for(int i=0 ; i < questions.length ; i++) 
            this.questions[i] = questions[i];
    }

    @Override
    public String toString() {
        return "titre : " + titre + "\nI- "+questions[0].toString()+"\nII- "+questions[1].toString()+"\nIII- "+questions[2].toString()+"\nIV- "+questions[3].toString()+"\nV- "+questions[4].toString();
    }
}
