package inclass.mar15.Polymorphism.RunCompileTimeP;

public class Sqaure extends Shape {
    double side;


    @Override
    public double area() {
        return side * side;
    }
}
