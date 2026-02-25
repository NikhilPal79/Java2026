package inclass.mar01.Static.Block;

public class Emp {


    public static void showMethod(){
        System.out.println(" i am static method");
    }

    static{
        System.out.println(" i am static block");
    }

    {
        System.out.println(" i am instance block");
    }

    public void anotherMethod(){
        System.out.println(" i am non static method  ");
    }

    public Emp() {
        System.out.println(" i am constructor ");
    }
}
