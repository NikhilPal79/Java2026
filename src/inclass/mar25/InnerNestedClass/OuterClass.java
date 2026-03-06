package inclass.mar25.InnerNestedClass;

public class OuterClass {

    int x= 10;


    public void set(){
        System.out.println(" outer class set method ");
    }

    class InnerClassDemo {

        public void show() {
            System.out.println(" inner class show method ");
        }
    }
}

