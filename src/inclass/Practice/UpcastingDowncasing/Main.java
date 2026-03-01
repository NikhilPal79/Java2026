package inclass.Practice.UpcastingDowncasing;

import java.sql.SQLOutput;

public class Main {
    static void main(String[] args) {

        Animal dog = new Dog();

        dog.makeSound();
        System.out.println(" example of upcasting ");
        System.out.println(" child class object can be refer to parent class reference");
        System.out.println();


        Animal animal = new Cat(); /// FIRST UPCAST
        Cat cat = (Cat) animal; /// THEN ONLY YOU CAN DO DOWNCAST

        cat.makeSound();
        ((Cat) animal).character();
        System.out.println(" first make it upcast of child class then use child class reference");



    }
}
