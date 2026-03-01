package inclass.mar15.Polymorphism.CompileTimeP;

public class Sqaure extends Shape {
    double side;


    @Override
    public double area() {
        return side * side;
    }
}
