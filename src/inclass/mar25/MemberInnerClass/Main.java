package inclass.mar25.MemberInnerClass;

public class Main {
    static void main(String[] args) {


        ///

        OuterClass outerClass = new OuterClass();

        outerClass.set();
        System.out.println();

        OuterClass.InnerClassDemo innerClassDemo = outerClass.new InnerClassDemo();
        innerClassDemo.show();

    }
}
