package inclass.mar15.Polymorphism.RunCompileTimeP;

public class Circle extends Shape {

    double radius;
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
