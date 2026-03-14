package inclass.DesignPattern.Builder;

import java.util.ArrayList;
import java.util.List;

public class EmpMain {
    static void main(String[] args) {

        Emp emp1 = Emp.builder().name("NIKHIL").salary(60000).build();
        Emp emp2 = Emp.builder().id(1244).name("MANPREET").salary(60000).build();

        ArrayList<Emp> empArrayList = new ArrayList<>(List.of(emp1, emp2));
        System.out.println(empArrayList);
    }
}
