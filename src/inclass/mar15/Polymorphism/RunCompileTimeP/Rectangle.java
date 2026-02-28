package inclass.mar15.Polymorphism.RunCompileTimeP;

public class Rectangle extends Shape {

    double width;
    double height;


    @Override
    public double area() {
        return width * height;
    }
}
