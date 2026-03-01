package inclass.Practice.MethodOverloading;

import java.sql.SQLOutput;

public class DemoMain {
    static void main(String[] args) {

        ///  showing the example of method overloading


        Demo demo = new Demo();
        demo.a=10;
        demo.b=20;
        demo.c=30;

        demo.sum(50,50);
        demo.sum(20,10,30);
        System.out.println(" method sum allocated at the compile time ");

    }
}
