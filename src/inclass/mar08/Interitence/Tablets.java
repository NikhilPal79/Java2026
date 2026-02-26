package inclass.mar08.Interitence;

public class Tablets extends Laptop{
    static void main(String[] args) {


        Computer comp = new Computer();
        comp.name  = " asus";
        comp.capacity = 100;
        comp.price = 8000.0;
        comp.getSpecification();

        Tablets t = new Tablets();
        t.name = "samsungA";
        System.out.println();
        t.capacity = 64;
        t.price = 1500.0;
        t.getSpecification();


    }
}
