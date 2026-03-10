package inclass.apr22;

import java.util.HashMap;
import java.util.Map;

public class EmpMain {
    static void main(String[] args) {


        Map<Employee, Integer> salary = new HashMap<>();
        Employee employee1 = new Employee(1, "ankita", " patel");
        Employee employee2 = new Employee(2, "neeraj", " yadav");

        salary.put(employee1,50000);
        salary.put(employee2,60000);

        System.out.println(employee1);
        System.out.println("hashcode before change " + employee1.hashCode());
        System.out.println("salary of emp1 : " + salary.get(employee1));
        System.out.println();
        System.out.println("last name changed from ankita to kaur ");
        employee1.setLastName( "kaur" );
        System.out.println();
        System.out.println(employee1);
        System.out.println("hashcode after change : " + employee1.hashCode());
        System.out.println("salary of emp 1 : " + salary.get(employee1));
        System.out.println("NO SALARY PRINTED FOR EMP1 : BECAUSE WHEN KEY [LAST NAME ] IS DIFF then HashMap stores entries based on hashCode at the time of put().\n" +
                "If the key mutates and hashCode changes,\n" +
                "get() searches in a different bucket\n" +
                "and finds nothing — returning null.");


    }
}
