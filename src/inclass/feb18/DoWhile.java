package inclass.feb18;

import java.util.Scanner;

public class DoWhile {
    static void main(String[] args) {



        ///  sum of first n even


        System.out.println("enter a number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;
        int x = 2;

        do{
            sum = sum + x;
            x = x + 2;
        }while (x <= n);
        System.out.println(sum);



        ///  sum of first n odd

        System.out.println("enter a number");

        int m =  sc.nextInt();
        int sum2 = 0;

        int y =  1;
        do{
            sum2 = sum2 + y;
            y = y + 2;
        }while (y <= n);
        System.out.println(sum2 );
    }
}
