package TP2.Exercice2;

public class Application {
    public static void main(String[] args) {
        // Saisi du Questionnaire
        Question questions[] = new Question[5];

        // Question 1 
        Reponse reponses1[] = new Reponse[3];
        reponses1[0] = new Reponse("super", false);
        reponses1[1] = new Reponse("global", false);
        reponses1[2] = new Reponse("public", true);
        questions[0] = new Question("visibilite", "Quel mot cle permet de rendre une classe accessible a l'exterieur de son package ?", reponses1);

        // Question 2 
        Reponse reponses2[] = new Reponse[3];
        reponses2[2] = new Reponse("inclure une librairie", false);
        reponses2[1] = new Reponse("etendre la portee d'une variable", false);
        reponses2[0] = new Reponse("l'heritage d'une classe", true);
        questions[1] = new Question("heritage","Le mot cle *extends* est utilise pour", reponses2);

        // Question 3
        Reponse reponses3[] = new Reponse[3];
        reponses3[0] = new Reponse("java.run", false);
        reponses3[2] = new Reponse("java.io", false);
        reponses3[1] = new Reponse("java.lang", true);
        questions[2] = new Question("importation", "Quelle classe fondamentale ne necessite pas l'instruction *import* car celui-ci est fait automatique", reponses3);

        // Question 4
        Reponse reponses4[] = new Reponse[3];
        reponses4[2] = new Reponse("n'existe pas en Java", false);
        reponses4[0] = new Reponse("definir un entier long", false);
        reponses4[1] = new Reponse("une methode qui ne retourne aucune valeur", true);
        questions[3] = new Question("void", "*void* est utilisee pour : ", reponses4);

        // Question 5
        Reponse reponses5[] = new Reponse[3];
        reponses5[2] = new Reponse("0.2", false);
        reponses5[1] = new Reponse("0.5", false);
        reponses5[0] = new Reponse("0", true);
        questions[4] = new Question("calcul", "Que renvoie 10 % 5 ?", reponses5);

        Questionnaire q = new Questionnaire("Questionnaire java", questions);
        System.out.println(q.toString());
    }
}
