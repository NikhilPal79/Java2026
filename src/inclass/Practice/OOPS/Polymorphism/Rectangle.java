package inclass.Practice.OOPS.Polymorphism;

import java.util.Scanner;

public class Rectangle {

    Double height;
    Double width;

    public Double getArea(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the height of the rectangle");
        double height = sc.nextDouble();
        System.out.println(" enter the width of the rectangle");
        double width = sc.nextDouble();
        Double area = height * width;
        return area;
    }
}
