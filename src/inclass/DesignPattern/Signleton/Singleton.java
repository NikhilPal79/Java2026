package inclass.DesignPattern.Signleton;

public class Singleton {

    private static final Singleton instance = new Singleton();

    Singleton(){
        System.out.println(" private singleton constructor");
    }

    public static Singleton getInstance(){
        System.out.println(" public singleton instance ");
        return instance;
    }

    public void show(){
        System.out.println(" i am signleton : " + instance.hashCode());
    }

}
