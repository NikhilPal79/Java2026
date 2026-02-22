package inclass.feb18;

import java.util.Scanner;

public class While {
    static void main(String[] args) {

        System.out.println("enter a number ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        while (x <= 5){
            x++;
            System.out.println(x);
            x++;
        }


        System.out.println("enter  2nd number ");
        Scanner sc1 = new Scanner(System.in);
        int y = sc1.nextInt();
        while (y <= 10){
            ++y;
            System.out.println(y);
            ++y;
        }

    }
}
