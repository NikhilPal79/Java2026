package inclass.Practice;

import java.util.Scanner;

public class Calculator {
    static void main(String[] args) {

        System.out.println("**********************");
        System.out.println("welcome to calculator");
        System.out.println("**********************");

        Scanner sc = new Scanner(System.in);


        System.out.println(" main menu ");
        System.out.println("1. addition  ");
        System.out.println("2. subtraction  ");
        System.out.println("3. multiplication  ");
        System.out.println("4. division  ");
        System.out.println("5. modulus ");
        System.out.println("6. exit ");

        System.out.println(" enter you choice ");
        int choice = sc.nextInt();



        int num1, num2;

        System.out.println("enter the first number");
        num1 = sc.nextInt();
        System.out.println("enter the second number");
        num2 = sc.nextInt();

        boolean continueSession = true ;

        do{

            if(choice >=1 && choice <= 6 ){

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
                    default:
                        System.out.println("Invalid choice");
                        continueSession = false;
                }
                if(choice >=6 ){
                    System.out.println("do you want to continue ");
                    System.out.println();
                }else {
                    System.out.println(" thanks for using cal");
                    continueSession = false;
                }

            }else {
                System.out.println(" restart the application ");
                continueSession = false;
            }

        }while (continueSession);

    }
}
