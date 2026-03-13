package inclass.may03.MethodReference.Static;

import java.util.ArrayList;
import java.util.List;

public class StudentsMain {
    static void main(String[] args) {


        NonStatic nonStatic = new NonStatic();

        Students student1 = Students.builder().id(1).firstName("nikhil").lastName("p").grade(89).build();
        Students student2 = Students.builder().id(2).firstName("sawan").lastName("s").grade(99).build();
        Students student3 = Students.builder().id(3).firstName("rohit").lastName("s").grade(87).build();
        Students student4 = Students.builder().id(4).firstName("mohit").lastName("g").grade(88).build();
        Students student5 = Students.builder().id(5).firstName("harp").lastName("s").grade(92).build();
        Students student6 = Students.builder().id(6).firstName("sarb").lastName("s").grade(90).build();
        Students student7 = Students.builder().id(7).firstName("ankit").lastName("y").grade(93).build();
        Students student8 = Students.builder().id(8).firstName("ridham").lastName("s").grade(97).build();

        ArrayList<Students> newList = new ArrayList<>(List.of(student1, student2, student3, student4, student5, student6, student7, student8));

        newList.stream()
                .filter(g->g.getGrade() >= 90)
                .filter(s-> s.getLastName().startsWith("s"))
                .map(StudentsMarks :: graceMarks)  ///  for static method
                .map(nonStatic:: lastNameFunction) /// for non static method
                .forEach(name -> System.out.println(name));
    }
}
