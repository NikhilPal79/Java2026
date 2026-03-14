package inclass.DesignPattern.Factory;

public class Cat implements Animal {
    @Override
    public void makeSound() {
        System.out.println(" cat sound : meow ");
    }

    @Override
    public void eat() {
        System.out.println(" cat eat : fish ");
    }
}
