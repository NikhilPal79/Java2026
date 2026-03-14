package inclass.DesignPattern.Factory;

public class AnimalFactory {

    public static Animal makeAnimal(String type){

        if (type == null){
            throw  new IllegalArgumentException("animal type cannot be null");
        }
        switch (type.toLowerCase()){
            case "dog":return new Dog();
            case "cat":return new Cat();
            default: throw new IllegalArgumentException("animal type not found");
        }
    }
}
