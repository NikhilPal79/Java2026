package inclass.feb22;

public class Furniture {

    String color;
    double length;
    double weight;
    double height;

    public void show(){
        System.out.println("show method");
    }
    public void set(){
        System.out.println("show method2 ");
    }

    static void main(String[] args) {


        Furniture f = new Furniture();
        f.show();
        f.set();
        f.length = 20;
        System.out.println(f.length);

    }


}
