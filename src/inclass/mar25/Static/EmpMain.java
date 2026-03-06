package inclass.mar25.Static;

public class EmpMain {
    static void main(String[] args) {


        Emp emp = new Emp();
        emp.set();
        System.out.println();

        Emp.Rogers empRogers = new  Emp.Rogers();
        empRogers.show();
    }
}
