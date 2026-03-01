package inclass.Practice.OOPS.Polymorphism;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Triangle{

    Float Length;
    Float Width;

    public  Float getArea() {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter radius of the circle ");
            float radius = sc.nextFloat();

            System.out.println("Enter width of the circle ");
            float width = sc.nextFloat();

            float area = 0.5f * radius * radius;
            System.out.println(" Area of the triangle is ");
            return area;
        }
        catch (InputMismatchException e) {
            System.out.println(" invalid input ");
        }finally {
            sc.close();
        }

        return 0f;
    }
}