package inclass.mar15.Polymorphism.RunTimeP;

public class Main {
    static void main(String[] args) {


        Circle circle = new Circle();

        circle.radius = 5.5;
        System.out.println(circle.area());
        System.out.println();

        Shape square = new Square();
        System.out.println(square.area());
        System.out.println("REF IS PARENT CLASS, OBJECT IS CHILD CLASS, ONLY ON RUN TIME METHOD IS ALLOCATED WHICH IS CHILD CLASS IN THIS CASE ");
        System.out.println();

        Shape rectangle = new Rectangle();
        System.out.println(rectangle.area());
        System.out.println("REF IS PARENT CLASS, OBJECT IS CHILD CLASS, ONLY ON RUN TIME METHOD IS ALLOCATED WHICH IS PARENT CLASS IN THIS CASE");
    }
}
