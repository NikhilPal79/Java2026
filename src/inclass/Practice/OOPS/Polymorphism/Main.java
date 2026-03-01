package inclass.Practice.OOPS.Polymorphism;

public class Main {
    static void main(String[] args) {

        Square square = new Square();

        System.out.println(square.getArea());
        System.out.println();
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle.getArea());
        System.out.println();
        Circle circle = new Circle();
        System.out.println(circle.getArea());
        Triangle triangle = new Triangle();
        System.out.println(triangle.getArea());
        System.out.println();
    }
}
