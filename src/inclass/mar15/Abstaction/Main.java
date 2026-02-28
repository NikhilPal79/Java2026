package inclass.mar15.Abstaction;

public class Main {
    static void main(String[] args) {


        Honda honda = new Honda();

        System.out.println("making the object of child class, abstract class object can not be created ");
        honda.brand();
        honda.model();
        honda.makeYear();
        honda.color();
    }
}
