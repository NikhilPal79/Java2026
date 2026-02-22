package inclass.feb15;

import java.sql.SQLOutput;
import java.util.Scanner;

public class switchCase {
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

        System.out.println("Enter your input");
        int input = sc.nextInt();


        switch (input) {
            case 1:
                int  a = 3;
                int  b = 5;
                System.out.println(a+b);
                break;
            case 2:
                int p = 5;
                int q = 4;
                System.out.println(p-q);
                break;
            case 3:
                int r = 5;
                int  s = 6;
                System.out.println(r*s);
                break;
            case 4:
                int c = 30;
                int  d = 6;
                System.out.println(c/d);
                break;
            case 5:
                int x  = 5;
                int  y = 6;
                System.out.println(x%y);
            break;
            case 6:
                System.out.println("exit");
        }

    }
}
