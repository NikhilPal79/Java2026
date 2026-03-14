package inclass.DesignPattern.Signleton;

public class SingletonMain {
    static void main(String[] args) {

        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        Singleton obj3 = Singleton.getInstance();

        obj1.show();
        obj2.show();
        obj3.show();

        System.out.println(obj1 == obj2);
        System.out.println(obj1 == obj3);

    }

}
