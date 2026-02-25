package inclass.Practice;

import java.sql.SQLOutput;
import java.util.Scanner;

public class RogersCx {
    static void main(String[] args) {
/// using loops

        System.out.println("************************************");
        System.out.println(" *******WELCOME TO Rogers **********");
        System.out.println("************************************");


        System.out.println("1. ENGLISH");
        System.out.println("2. FRENCH ");
        System.out.println("3. SPANISH");

        System.out.println("ENTER YOUR CHOICE");
        Scanner sc = new Scanner(System.in);
        int languageChoice;
        languageChoice = sc.nextInt();
        boolean continueSession = true;

    if(languageChoice == 1 ||languageChoice == 2 || languageChoice == 3){

        System.out.println("Your choice is : " + languageChoice );
        continueSession = true;

    }else{
        System.out.println("Invalid choice");
        continueSession = true;
    }

        do {

            if (languageChoice == 1 || languageChoice == 2 || languageChoice == 3) {

                System.out.println(" THANKS FOR CHOOSING ROGERS ");
                System.out.println(" YOURS OPTION ARE BELOW ");
                System.out.println("         MAIN MENU            ");
                System.out.println("1. BILLING AND PAYMENT OPTION ");
                System.out.println("2. TECHNICAL SUPPORT");
                System.out.println("3. SALES");
                System.out.println("4. ACCOUNT CHANGES ");
                System.out.println("5. SPEAK TO A LIVE AGENT  ");
                System.out.println("6. EXIT ");

                System.out.println(" ENTER YOUR CHOICE ");
                int menuChoice;
                menuChoice = sc.nextInt();

                if (menuChoice == 6) {
                    System.out.println(" THANKS FOR USING ROGERS ");
                    continueSession = true;
                }

                switch (menuChoice) {
                    case 1:
                        System.out.println("1. MAKE A PAYMENT");
                        System.out.println("2. PAYMENT ARRANGEMENT ");
                        System.out.println("3. BILLING EXPLANATION");
                        System.out.println("4. SPEAK TO A BILLING AGENT");
                        System.out.println("5. EXIT ");

                        System.out.println("ENTER YOUR CHOICE");
                        int i = sc.nextInt();

                        if (i <= 5) {
                            System.out.println(" THANKS FOR USING ROGERS ");
                        } else if (i >= 6) {
                            System.out.println(" INVALID CHOICE");
                            continueSession = false;
                        }
                        break;
                    case 2:
                        System.out.println("1. INTERNET ISSUES");
                        System.out.println("2. TV ISSUES");
                        System.out.println("3. WIRELESS ISSUES");
                        System.out.println("4. SPEAK TO TECHNICAL SUPPORT ");
                        System.out.println("5. EXIT ");

                        System.out.println("ENTER YOUR CHOICE");
                        int j = sc.nextInt();

                        if (j <= 5) {
                            System.out.println(" THANKS FOR USING ROGERS ");
                        } else if (j >= 6) {
                            System.out.println("INVALID CHOICE");
                            continueSession = false;
                        }
                        break;
                    case 3:
                        System.out.println("1. NEW WIRELESS PLAN");
                        System.out.println("2. INTERNET / TV PACKAGES ");
                        System.out.println("3. BUSINESS SERVICES ");
                        System.out.println("4. SPEAK TO A SALES REP");
                        System.out.println("5. EXIT ");

                        System.out.println("ENTER YOUR CHOICE");
                        int k = sc.nextInt();

                        if (k <= 5) {
                            System.out.println(" THANKS FOR USING ROGERS ");
                        } else if (k >= 6) {
                            System.out.println("INVALID CHOICE");
                            continueSession = false;
                        }
                        break;
                    case 4:
                        System.out.println("1. CHANGES ADDRESS ");
                        System.out.println("2. CANCEL SERVICES ");
                        System.out.println("3. TRANSFER SERVICES ");
                        System.out.println("4. SPEAK TO A ACCOUNT SPECIALIST ");
                        System.out.println("5. EXIT ");

                        System.out.println("ENTER YOUR CHOICE");
                        int l = sc.nextInt();

                        if (l <= 5) {
                            System.out.println(" THANKS FOR USING ROGERS ");
                        } else if (l >= 6) {
                            System.out.println("INVALID CHOICE");
                            continueSession = false;
                        }
                        break;
                    case 5:
                        System.out.println(" EXIT");
                        continueSession = false;
                        break;
                    default:
                        System.out.println("GOOD BYE");
                        continueSession = false;
                }
                if (menuChoice >= 1 && menuChoice <= 5) {

                    System.out.println(" DO YOU WANT TO CONTINUE ");
                    System.out.println("1. YES");
                    System.out.println("2. NO");

                    System.out.println("ENTER YOUR CHOICE");
                    char choice = sc.next().charAt(0);
                    if (choice == 'Y' || choice == 'y') {
                        System.out.println(" WELCOME TO ROGERS AGAIN");
                        continueSession = true;
                    } else if (choice == 'N' || choice == 'n') {
                        System.out.println(" HAVE A GOOD DAY ");
                        continueSession = false;
                    }
                }
            }else if (languageChoice >3){
                System.out.println(" RESTART THE APPLICATION AND SELECT THE VALID LANGUAGE ");
                continueSession = false;
            }
        }while (continueSession);
    }
}
