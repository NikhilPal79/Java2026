package inclass.mar08.Interitence;

public class MyBaseClass extends Object {
    static void main() {

        Computer comp = new Computer();
        System.out.println(comp.toString());
        System.out.println();

        Laptop lap = new Laptop();
        lap.name = "sony";
        lap.price = 8000.0;
        lap.capacity = 100;
        lap.getSpecification();
    }
}
