package TP4.Exercice2;

public class Application implements Runnable{
    public static void afficher(double[][] temp) {
        int i, j;
        for (i = 0; i < 10; i++) {
            for (j = 0; j < 10; j++) {
                System.out.printf("%.2f ", temp[i][j]);
            }
            System.out.println();
        }
    }

    public void run() {
        
    }

    public static void main(String[] args) {
        int rho = 1040;
        double k = 0.6;
        double c = 3650;
        double deltaT = 0.1;
        double deltaX = 0.01;

        double t1[][] = new double[10][10];
        double t2[][] = new double[10][10];
        int i, j, it;
        for (i = 0; i < 10; i++) {
            for (j = 0; j < 10; j++) {
                t1[i][j] = 0;
                t2[i][j] = 0;
            }
        }
        t1[4][4] = 30;
        t2[4][4] = 30;
        for (it = 0; it < 1000000; it++) {
            for (i = 1; i < 9; i++) {
                for (j = 1; j < 9; j++) {
                    if (!(i == 4 && j == 4)) {
                        if (it % 2 == 0) {
                            t2[i][j] = t1[i][j] + ((deltaT * k) / (rho * c * deltaX * deltaX))
                                    * (t1[i - 1][j] + t1[i + 1][j] + t1[i][j - 1] + t1[i][j + 1] - 4 * t1[i][j]);
                        } else {
                            t1[i][j] = t2[i][j] + ((deltaT * k) / (rho * c * deltaX * deltaX))
                                    * (t2[i - 1][j] + t2[i + 1][j] + t2[i][j - 1] + t2[i][j + 1] - 4 * t2[i][j]);
                        }
                    }
                }
            }
        }

        afficher(t1);
    }
}
