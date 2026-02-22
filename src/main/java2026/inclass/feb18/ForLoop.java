package inclass.feb18;

import java.util.Scanner;

public class ForLoop {
    static void main(String[] args) {


        /// sum of first n even number

        System.out.println("enter a number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        for  (int x =  2; x <= n; x = x + 2) {
            sum = sum + x;

        }
        System.out.println(sum );


        /// sum of first n odd number

        System.out.println("enter a number");
        int m = sc.nextInt();
        int sum2 = 0;

        for  (int x = 1; x <= m; x = x + 2) {
            sum2 = sum2 + x;
        }
        System.out.println(sum2 );
    }
}
