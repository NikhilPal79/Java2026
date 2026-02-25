package inclass.mar01.Static.Method;

public class EmpMain {
    static void main(String[] args) {
        ///  no need to make object

        Emp emp1 = new Emp(5072,"nikhil");
        Emp emp2 = new Emp(7544, "harp");
        Emp emp3 = new Emp(6846, "ajay");
        Emp emp4 = new Emp(6565," karan");

        System.out.println(emp1.id);
        System.out.println(emp1.name);
        Emp.empDetails();


    }
}
