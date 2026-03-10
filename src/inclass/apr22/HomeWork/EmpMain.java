package inclass.apr22.HomeWork;

import java.util.*;

public class EmpMain {
    static void main(String[] args) {


        List<String> list = new ArrayList<>(List.of("5194988971","987754322"));
        Map<Emp, Integer> salary = new HashMap<>();


        Emp emp1 = new Emp(1, "nikhil", "pal", list);
        Emp emp2 = new Emp(2, "manpreet", "kaur", list);
        System.out.println();
        salary.put(emp1, 50000);
        salary.put(emp2, 80000);

        emp2.getPhoneNumbers().add("12457896");
        System.out.println(" not gonna change the input throwing exceptions  ");


        System.out.println(salary.get(emp2));


    }
}
