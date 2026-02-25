package inclass.Practice;

import java.util.Scanner;

public class Calculator {
    static void main(String[] args) {

        System.out.println("**********************");
        System.out.println("welcome to calculator");
        System.out.println("**********************");

        Scanner sc = new Scanner(System.in);
        boolean continueSession = true ;

        do{
            System.out.println(" main menu ");
            System.out.println("1. addition  ");
            System.out.println("2. subtraction  ");
            System.out.println("3. multiplication  ");
            System.out.println("4. division  ");
            System.out.println("5. modulus ");
            System.out.println("6. exit ");

            System.out.println(" enter you choice ");
            int choice = sc.nextInt();

            if(choice == 6){

                System.out.println("thanks for using calculator");
                continueSession = true;
            }
            if(choice <1 || choice >6){
                System.out.println("Invalid choice. Please select valid choice ");
                continueSession = true;
            }


            if(choice == 1 ||  choice == 2 || choice == 3 || choice == 4 || choice == 5 ){

                int num1, num2;

                System.out.println("enter the first number");
                num1 = sc.nextInt();
                System.out.println("enter the second number");
                num2 = sc.nextInt();

                switch(choice){
                    case 1:
                        int sum = num1 + num2;
                        System.out.println(sum);
                        break;
                    case 2:
                        int sub = num1 - num2;
                        System.out.println(sub);
                        break;
                    case 3:
                        int multi = num1 * num2;
                        System.out.println(multi);
                        break;
                    case 4:
                        int div = num1 / num2;
                        System.out.println(div);
                        break;
                    case 5:
                        int mod = num1 % num2;
                        System.out.println(mod);
                        break;
                }
                 if(choice == 1 ||  choice == 2 || choice == 3 || choice == 4 || choice == 5 ){
                    System.out.println("do you want to continue ");
                    System.out.println(" yes ");
                    System.out.println(" no ");

                    System.out.println(" select the option ");
                    char  option = sc.next().charAt(0);

                    if(option == 'y' || option == 'Y'){
                        System.out.println("welcome to calculator again");
                        continueSession = true;
                    }else if(option == 'n' || option == 'N'){
                        System.out.println(" take care ");
                        continueSession = false;
                    }else{
                        System.out.println(" have a good day ");
                    }

                 } else {
                    System.out.println(" thanks for using cal");
                    continueSession = false;
                   }

            }else if(choice >= 6){
                System.out.println(" restart the application ");
                continueSession = false;
            }

        }while (continueSession);

    }
}
