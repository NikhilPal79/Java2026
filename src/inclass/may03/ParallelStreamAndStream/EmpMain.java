package inclass.may03.ParallelStreamAndStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmpMain {
    static void main(String[] args) {


        Emp build1 = Emp.builder().id(5072).firstName("nikhil").lastName("p").salary(60000.0).build();
        Emp build2 = Emp.builder().id(6846).firstName("ajay").lastName("s").salary(60000.0).build();
        Emp build3 = Emp.builder().id(2122).firstName("karan").lastName("t").salary(90000.0).build();
        Emp build4 = Emp.builder().id(7544).firstName("harp").lastName("r").salary(80000.0).build();
        Emp build5 = Emp.builder().id(5903).firstName("simran").lastName("s").salary(70000.0).build();


        ArrayList<Emp> empArrayList = new ArrayList<>(List.of(build1, build2, build3, build4, build5));

        empArrayList.parallelStream().filter(emp -> emp.getSalary() > 5000).forEach(System.out::println);
        System.out.println();
        empArrayList.parallelStream().filter(emp -> emp.getSalary() > 5000).forEachOrdered(System.out::println);
        System.out.println();
        empArrayList.stream().filter(emp -> emp.getSalary() > 5000).forEach(System.out::println);
    }
}
