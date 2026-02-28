package inclass.mar15.Polymorphism.RunCompileTimeP;

public class Main {
    static void main(String[] args) {


        Circle circle = new Circle();

        circle.radius = 10;
        System.out.println(circle.area());
        System.out.println();

        Rectangle rectangle = new Rectangle();
        rectangle.width = 10;
        rectangle.height = 50;
        System.out.println(rectangle.area());
        System.out.println();

        Sqaure sqaure = new Sqaure();
        sqaure.side = 15;
        System.out.println(sqaure.area());
    }
}
