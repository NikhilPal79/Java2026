package inclass.mar25.MemberInnerClass;

public class EmpMain {
    static void main(String[] args) {


        Emp emp = new Emp();
        emp.set();
        System.out.println();

        Emp.Rogers empRogers = emp.new Rogers();
        empRogers.show();
    }
}
