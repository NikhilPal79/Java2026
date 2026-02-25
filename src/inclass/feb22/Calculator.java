package inclass.feb22;

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


            switch (n) {
                case 1:
                    System.out.println("Enter first number");
                    int num1 = sc.nextInt();
                    System.out.println("Enter second number");
                    int num2 = sc.nextInt();
                    System.out.println(ar.sum(num1, num2));
                    break;
                case 2:
                    System.out.println("Enter first number");
                    int num3 = sc.nextInt();
                    System.out.println("Enter second number");
                    int num4 = sc.nextInt();
                    System.out.println(ar.sub(num3, num4));
                    break;
                case 3:
                    System.out.println("Enter first number");
                    int num5 = sc.nextInt();
                    System.out.println("Enter second number");
                    int num6 = sc.nextInt();
                    System.out.println(ar.mul(num5, num6));
                    break;
                case 4:
                    System.out.println("Enter first number");
                    int num7 = sc.nextInt();
                    System.out.println("Enter second number");
                    int num8 = sc.nextInt();
                    System.out.println(ar.div(num7, num8));
                    break;
                case 5:
                    System.out.println("Enter first number");
                    int num9 = sc.nextInt();
                    System.out.println("Enter second number");
                    int num10 = sc.nextInt();
                    System.out.println(ar.mod(num9, num10));
                    break;
                case 6:
                    n =0;
                    System.out.println("exit");
                    break;
                case 7:
                default:{
                    System.out.println("Invalid choice");
                }
            }

            if (n <=5 && n !=0 && n >=1 ) {
                System.out.println("DO YOU WANT TO CONTINUE");
                System.out.println("1. YES");
                System.out.println("2. NO ");

                System.out.println("ENTER YOUR CHOICE");
                char choice = sc.next().charAt(0);
                if (choice == 'Y' || choice == 'y'){
                    System.out.println("***********************");
                    System.out.println("WELCOME TO MY CALCULATOR");
                    System.out.println("***********************");
                } else if (choice == 'N' || choice == 'n') {
                    System.out.println("THANKS FOR USING ");
                    n=0;
                }
            }
        }while( n!=0 );


    }
}



