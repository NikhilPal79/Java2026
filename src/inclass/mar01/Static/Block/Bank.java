package inclass.mar01.Static.Block;

public class Bank {

    public Bank() {
        System.out.println(" i am constructor");
    }

    public void showMethod(){
        System.out.println(" i am non static method");
    }

    public static void anotherMethod2(){
        System.out.println(" i am  static method");
    }

    {
        System.out.println(" i am instance block");
    }

    static{
        System.out.println(" i am static block");
    }
}
