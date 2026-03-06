package inclass.mar25.LocalInnerClass;

public class Emp {

    public void set(){
        System.out.println(" set method of emp class");


        class Rogers{

            void show(){
                System.out.println(" show method of rogers class");
            }
        }

        Rogers r = new Rogers(){
            public void show(){
                System.out.println(" creating show method of rogers class");
            }
        };
        r.show();

        Rogers r2 = new Rogers();
        r2.show();

    }



}
