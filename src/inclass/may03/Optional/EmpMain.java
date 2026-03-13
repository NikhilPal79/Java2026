package inclass.may03.Optional;

import java.sql.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class EmpMain {
    static void main(String[] args) {


        Emp emp1 = Emp.builder().id(1).firstName("nikhil").lastName("p").grade(88).build();
        Emp emp2 = Emp.builder().id(2).firstName("sawan").lastName("s").grade(98).build();
        Emp emp3 = Emp.builder().id(3).firstName("sarb").lastName("s").grade(94).build();
        Emp emp4 = Emp.builder().id(4).firstName("ridam").lastName("s").grade(96).build();
        Emp emp5 = Emp.builder().id(5).firstName("mohit").lastName("g").grade(90).build();

        ArrayList<Emp> empArrayList = new ArrayList<>(List.of(emp1, emp2, emp3, emp4, emp5));

        System.out.println("1. FIND FIRST METHOD ");
        System.out.println(" FIND FIRST EMP WITH GRADE >  90");
        Optional<Emp> first = empArrayList.stream()
                .filter(emp -> emp
                        .getGrade() >= 90)
                .findFirst();
        System.out.println(first);
        System.out.println();

        System.out.println("2. is PRESENT ");
        Optional<Emp> empStream = empArrayList.stream()
                .filter(s -> s.getGrade() >= 90)
                .findFirst();

        if (empStream.isPresent()) {
            System.out.println(empStream.get().getFirstName());
        }
        System.out.println();

        System.out.println("3. get() method  ");
        Optional<Emp> first1 = empArrayList.stream()
                .filter(emp -> emp.getGrade() >= 90)
                .filter(s -> s.getFirstName().startsWith("n"))
                .findFirst();

        /*Emp empo = first1.get();
        System.out.println(empo.getFirstName());*/
        System.out.println();

        System.out.println("4. OR ELSE");
        Emp orElse = empArrayList.stream()
                .filter(s -> s.getGrade() >= 100).findFirst()
                .orElse(Emp.builder().id(0).firstName("bhadshah").lastName("bhadshanh").grade(0).build());
        System.out.println(orElse.getFirstName());
        System.out.println();

        System.out.println("5. OR ELSE GET ()");
        Emp orElseGet = empArrayList.stream()
                .filter(s -> s.getFirstName().equals("manpreet"))
                .findFirst()
                .orElseGet(() -> Emp.builder().id(0).firstName("no student of this name").grade(0).build());

        System.out.println(orElseGet.getFirstName());

    }
}
