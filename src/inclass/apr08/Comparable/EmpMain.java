package inclass.apr08.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmpMain {
    static void main(String[] args) {

        List list = new ArrayList();
        list.add(104);
        list.add(105);
        list.add(101);
        list.add(102);
        list.add(103);
        System.out.println("before sorting : " + list);
        Collections.sort(list); /// not interface
        System.out.println("after sorting : " + list);

        List list2 = new ArrayList();
        list2.add("nikhil");
        list2.add("sawan");
        list2.add("harp");
        list2.add("ridham");
        list2.add("shaffy");
        System.out.println("before sorting : " + list2);
        Collections.sort(list2);
        System.out.println("after sorting : " + list2);


        Emp emp1 = new Emp(101, "sawan");
        Emp emp2 = new Emp(104, "harp");
        Emp emp3 = new Emp(103, "nikhil");
        Emp emp4 = new Emp(105, "ridham");
        Emp emp5 = new Emp(102, "shaffy");

        List<Emp> empList = new ArrayList<>();
        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);
        empList.add(emp4);
        empList.add(emp5);
        System.out.println("before sorting : "+empList);
        Collections.sort(empList);  ///gives error becz we havent use comparable<T> in class
        System.out.println("after sorting : "+empList);


    }
}
