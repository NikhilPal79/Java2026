package inclass.feb18;

import java.util.Scanner;

public class Practice {
    static void main(String[] args) {


        /// print number from 1-n,Scanner

        System.out.println("enter a number ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int a = 1;
        while (a <= x){
            System.out.println(a);
            a++;
        }

        /// print sum of first 10 numbers or first 'n' number

        System.out.println("enter a number ");
        int n = sc.nextInt();

        int sum = 0;
        int y = 1;
        while (y <= n){
            sum = sum + y;
            y++;
        }
        System.out.println(sum);

    }
}
