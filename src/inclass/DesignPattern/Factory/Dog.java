package inclass.DesignPattern.Factory;

public class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog sound : wuff ");
    }

    @Override
    public void eat() {
        System.out.println("Dog eat : bones ");

    }
}
