import java.util.Scanner;

public class triangle_pascal {
    static int fact(int n){    
        if (n == 0)    
          return 1;    
        else    
          return(n * fact(n-1));    
       }    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("n : ");
        int n = sc.nextInt();

        for(int i = 0 ; i < n ; i++){
            for(int j = 0; j < i ; j++ ){
                System.out.print(fact(i)/(fact(j)*fact(i-j)) + " ");
            }
            System.out.println("1");
        }
        sc.close();
    }
}
