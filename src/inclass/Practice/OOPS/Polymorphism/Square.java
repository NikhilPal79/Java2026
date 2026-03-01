package inclass.Practice.OOPS.Polymorphism;

import java.util.Scanner;

public class Square {

    Double side;

    public double getArea(){
        Scanner sc  = new Scanner(System.in);
        System.out.println(" enter your side of the square ");

        double side = sc.nextDouble();
        double area = side * side;
        return area;
    }
}
