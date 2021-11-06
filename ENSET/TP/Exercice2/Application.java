package TP.Exercice2;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        // Saisi du Questionnaire
        Question questions[] = new Question[5];

        // Question 1
        questions[0] = new Question("visibilite", "Quel mot cle permet de rendre une classe accessible a l'exterieur de son package ?");
        questions[0].getReponses()[1] = new Reponse("public", true);
        questions[0].getReponses()[0] = new Reponse("global", false);
        questions[0].getReponses()[2] = new Reponse("super", false);

        // Question 2 
        questions[1] = new Question("heritage","Le mot cle *extends* est utilise pour");
        questions[1].getReponses()[0] = new Reponse("inclure une librairie", false);
        questions[1].getReponses()[1] = new Reponse("etendre la portee d'une variable", false);
        questions[1].getReponses()[2] = new Reponse("l'heritage d'une classe", true);

        // Question 3
        questions[2] = new Question("importation", "Quelle classe fondamentale ne necessite pas l'instruction *import* car celui-ci est fait automatique");
        questions[2].getReponses()[0] = new Reponse("java.run", false);
        questions[2].getReponses()[1] = new Reponse("java.lang", true);
        questions[2].getReponses()[2] = new Reponse("java.io", false);

        // Question 4
        questions[3] = new Question("void", "*void* est utilisee pour : ");
        questions[3].getReponses()[2] = new Reponse("une methode qui ne retourne aucune valeur", true);
        questions[3].getReponses()[1] = new Reponse("definir un entier long", false);
        questions[3].getReponses()[0] = new Reponse("n'existe pas en Java", false);
        
        // Question 5
        questions[4] = new Question("calcul", "Que renvoie 10 % 5 ?");
        questions[4].getReponses()[0] = new Reponse("0.2", false);
        questions[4].getReponses()[1] = new Reponse("0", true);
        questions[4].getReponses()[2] = new Reponse("0.5", false);

        Questionnaire q = new Questionnaire("Questionnaire java", questions);
        System.out.println(q.toString());

        int rep;
        Scanner sc = new Scanner(System.in);

        for(int i = 0 ; i < questions.length ; i ++) {
            System.out.print("Réponse question " + (i+1) + " : ");
            rep = sc.nextInt();
                if(questions[i].getReponses()[rep-1].getCorrecte() == true) {
                    questions[i].setScore(1);
                }
        }

        int scoreFinal = 0;
        for(int i = 0 ; i < questions.length ; i++)
            scoreFinal += questions[i].getScore();

        System.out.println("Score final : " + scoreFinal);

        System.out.println("\n\n********************Correction********************");
        for(int i = 0 ; i < questions.length ; i++) {
            System.out.print("Question : "+ (i+1) + " - " + questions[i].getDescription() + " - Reponse : ");
            for(int j = 0; j < questions[i].getReponses().length ; j++)
                if(questions[i].getReponses()[j].getCorrecte() == true)
                    System.out.println(questions[i].getReponses()[j].getTitre());
        }

        sc.close();
    }
}
