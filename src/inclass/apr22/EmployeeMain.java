package inclass.apr22;

import java.util.HashMap;
import java.util.Map;

public class EmployeeMain {
    static void main(String[] args) {


        Map<Employee, Integer> salary = new HashMap<>();
        salary.put(new Employee(1,"nikhil", "pal"),50000);
        salary.put(new Employee(2,"manpreet", "kaur"),40000);

        Employee fromDB = new Employee(1, "nikhil", "pal");;
        Employee fromFrontEnd = new Employee(1, "nikhil", "pal");;
        System.out.println("hashcode from parent class " + fromDB.hashCode());
        System.out.println("hashcode from parent class " + fromFrontEnd.hashCode());
        System.out.println("they are different because there is no hashcode in the parent class [object class ] " + "need to override hashcode in parent class");
        System.out.println();
        System.out.println();
        System.out.println("hashcode of child class " + "nikhil".hashCode());
        System.out.println("hashcode of child class " + "nikhil".hashCode());
        System.out.println("they are same hashcode because they are calculated from the child class [string]");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(fromDB.equals(fromFrontEnd));
        System.out.println();

        System.out.println(new Employee(1, "nikhil", "pal").equals(fromFrontEnd));


    }
}
