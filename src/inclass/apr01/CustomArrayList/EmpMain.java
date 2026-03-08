package inclass.apr01.CustomArrayList;

import java.util.LinkedList;

public class EmpMain {
    static void main(String[] args) {

        LinkedList<Emp> empLinkedList = new LinkedList<>();
        empLinkedList.add(new Emp(5072,"nikhil",50000.0));
        empLinkedList.add(new Emp(6846,"harp",40000.0));
        empLinkedList.add(new Emp(7544,"ajay",80000.0));
        empLinkedList.add(new Emp(5852,"pankaj",20000.0));
        empLinkedList.add(new Emp(2121,"karan",80000.0));

        System.out.println(empLinkedList);

        Emp highest = empLinkedList.getFirst();
        System.out.println(highest);

        for (int i = 1; i < empLinkedList.size(); i++) {
            Emp emp = empLinkedList.get(i);
            if (emp.getSalary() > highest.getSalary()) {
                highest = emp;

            }

        }
        System.out.println("highest salary with emp id :" + highest.getId());
        System.out.println("highest salary with emp salary :" + highest.getSalary());

    }
}
