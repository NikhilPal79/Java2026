package inclass.feb15;

import java.sql.SQLOutput;
import java.util.Scanner;

public class switchCaseWithScanner {
    static void main() {


        System.out.println("************************");
        System.out.println("WELCOME TO MY CALCULATOR");
        System.out.println("************************");

        System.out.println("1. ADDITION ");
        System.out.println("2. SUBSTRACTION ");
        System.out.println("3. MULTIPLY ");
        System.out.println("4. DIVISION ");
        System.out.println("5. MODULUS  ");
        System.out.println("6. EXIT ");
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER YOUR INPUT");
        int input = sc.nextInt();

        int n = input;

        switch(n) {
            case 1:
                System.out.println("ENTER YOUR FIRST DIGIT");
                int a = sc.nextInt();
                System.out.println("ENTER YOUR SECOND DIGIT");
                int b = sc.nextInt();
                System.out.println(a + b);
                break;
            case 2:
                System.out.println("ENTER YOUR FIRST DIGIT");
                int p =  sc.nextInt();
                System.out.println("ENTER YOUR SECOND DIGIT");
                int q = sc.nextInt();
                System.out.println(p - q);
                break;
            case 3:
                System.out.println("ENTER YOUR FIRST DIGIT");
                int m = sc.nextInt();
                System.out.println("ENTER YOUR SECOND DIGIT");
                int l = sc.nextInt();
                System.out.println(n * m);
                break;
            case 4:
                System.out.println("ENTER YOUR FIRST DIGIT");
                int r =  sc.nextInt();
                System.out.println("ENTER YOUR SECOND DIGIT");
                int t =  sc.nextInt();
                System.out.println(t / t);
                break;
            case 5:
                System.out.println("ENTER YOUR FIRST DIGIT");
                int e =  sc.nextInt();
                System.out.println("ENTER YOUR SECOND DIGIT");
                int f =   sc.nextInt();
                System.out.println( e%f);
            case 6 :
                System.out.println("EXIT");


        }

    }
}
