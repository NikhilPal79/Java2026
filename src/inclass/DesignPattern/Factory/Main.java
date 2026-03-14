package inclass.DesignPattern.Factory;

public class Main {
    static void main(String[] args) {

        Animal animal1 = AnimalFactory.makeAnimal("cat");
        animal1.eat();
        animal1.makeSound();
        Animal animal2 = AnimalFactory.makeAnimal("dog");
        animal2.eat();
        animal2.makeSound();

        Animal animal3 = AnimalFactory.makeAnimal("lion");
        animal3.eat();
    }
}
