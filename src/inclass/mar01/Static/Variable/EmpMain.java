package inclass.mar01.Static.Variable;

public class EmpMain {
    public static void main(String[] args) {


        Employee employee1 = new Employee(5072, "nikhil");
        Employee employee2 = new Employee(6846, "ajay");
        Employee employee3 = new Employee(7544, "ram");
        Employee employee4 = new Employee(6556, "karan");


        employee1.empdetails();
        System.out.println();
        employee2.empdetails();
        System.out.println();
        employee3.empdetails();
        System.out.println();
        employee4.empdetails();
    }

}
