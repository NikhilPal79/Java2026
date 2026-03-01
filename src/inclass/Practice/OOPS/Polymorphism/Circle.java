package inclass.Practice.OOPS.Polymorphism;

import java.util.Scanner;

public class Circle {

    Double radius;
    public Double getArea(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of the circle ");

        double radius = sc.nextDouble();

        Double area = Math.PI * radius * radius;
        return area;
    }
}
