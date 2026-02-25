package inclass.feb15;

import java.util.Scanner;

public class IVRDemo {
    static void main() {


        System.out.println("************************");
        System.out.println("    WELCOME TO ROGER    ");
        System.out.println("************************");

        System.out.println(" 1. ENGLISH ");
        System.out.println(" 2. FRENCH ");
        System.out.println(" 3. EXIT ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice");
        int choice = sc.nextInt();

        int n = choice;

        if (choice == 1) {
            System.out.println("1. BILLING ");
            System.out.println("2. TECHNICAL SUPPORT ");
            System.out.println("3. FOR SALES ");
            System.out.println("4. SPEAK TO AN AGENT ");
            System.out.println("5. GO TO MAIN MENU");

            System.out.println("ENTER YOUR CHOICE");
            int choice2 = sc.nextInt();



            switch (choice2) {
                case 1:
                    System.out.println("1. payment arrangement ");
                    System.out.println("2. over charge  ");
                    break;
                case 2:
                    System.out.println("1. internet ");
                    System.out.println("2. mobile ");
                    System.out.println("3. cable ");
                    break;
                case 3:
                    System.out.println("1. new customer ");
                    System.out.println("2. existing customer ");
                    break;
                case 4:
                    System.out.println("1. MALE  ");
                    System.out.println("2. FEMALE  ");
                    int gender = sc.nextInt();
                    switch (gender) {
                        case 1:
                            System.out.println("Hey My name is nikhil, how may i assist you today ");
                            break;
                        case 2:
                            System.out.println("Hey my name is kaur, how may i help you today ");
                            break;
                    }
                case 5:
                    System.out.println("5. WELCOME TO MAIN MENU ");


            }
        } else if (choice == 2) {
            System.out.println("1. Facturation ");
            System.out.println("2. Support technique ");
            System.out.println("3. Ventes ");
            System.out.println("4. Parler à un agent");
            System.out.println("5. Retourner au menu principal ");
            Scanner sc2 = new Scanner(System.in);
            System.out.println( "Enter your choice");
            int choice2 = sc2.nextInt();


        } else {
            System.out.println("THANKS FOR USING ROGERS, HAVE A WONDERFUL DAY ");


        }
    }
}
