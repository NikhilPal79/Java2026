package inclass.feb22;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        /// use do while loop

        Scanner sc = new Scanner(System.in);
        int n;
        Arithmetic ar = new Arithmetic();



            System.out.println("***********************");
            System.out.println("WELCOME TO MY CALCULATOR");
            System.out.println("***********************");
        do {

            System.out.println("1. ADDITION");
            System.out.println("2. SUBTRACTION");
            System.out.println("3. MULTIPLICATION");
            System.out.println("4. DIVISION");
            System.out.println("5. MODULUS");
            System.out.println("6. EXIT");

            System.out.println(" ENTER YOUR CHOICE");
            n = sc.nextInt();

            int result = 0;


            switch (n) {
                case 1:
                    int sum = ar.sum(20, 20);
                    System.out.println("20 + 20 = " + sum);
                    break;
                case 2:
                    int sub = ar.sub(20, 50);
                    System.out.println("20 - 50 = " + sub);
                    break;
                case 3:
                    int mul = ar.mul(10, 20);
                    System.out.println("10 * 20 = " + mul);
                    break;
                case 4:
                    int div = ar.div(50, 5);
                    System.out.println("5 / 5 = " + div);
                    break;
                case 5:
                    int mod = ar.mod(100, 50);
                    System.out.println("100 % 5 = " + mod);
                    break;
                case 6:
                    System.out.println("exit");
                    break;
                default:{
                    System.out.println("Invalid choice");
                }
            }
            if (n != 0 ){
                System.out.println("DO YOU WANT TO CONTINUE");
                System.out.println("1. YES");
                System.out.println("2. NO ");

                char choice = sc.next().charAt(0);

                choice = Character.toLowerCase(choice);
            }else{
                System.out.println("Invalid choice");
            }

        }while( n!=0 );

    }
}



