package inclass.may03.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Test {
    static void main(String[] args) {

        Student student1 = Student.builder().id(1).firstName("nikhil").lastName("p").grade(91).build();
        Student student9 = Student.builder().id(1).firstName("nikhil").lastName("p").grade(91).build();
        Student student2 = Student.builder().id(2).firstName("ramneek").lastName("p").grade(90).build();
        Student student8 = Student.builder().id(2).firstName("ramneek").lastName("p").grade(90).build();
        Student student3 = Student.builder().id(3).firstName("ajay").lastName("s").grade(80).build();
        Student student4 = Student.builder().id(4).firstName("karan").lastName("t").grade(60).build();
        Student student5 = Student.builder().id(5).firstName("pankaj").lastName("s").grade(95).build();
        Student student6 = Student.builder().id(6).firstName("harp").lastName("r").grade(85).build();
        Student student7 = Student.builder().id(7).firstName("sawan").lastName("s").grade(55).build();

        List<Student> students1 = Arrays.asList(student1, student2, student3, student4, student5);/// cannot not add element to student [fixed - size wrapper]
        List<Student> students = new ArrayList<>(List.of(student1, student2, student3, student4, student5, student6, student7, student8,student9)); /// can add [fully mutuable arraylist]

        System.out.println(students);
        System.out.println();
        /*System.out.println(students1);*/

        students.stream()
                .filter(g -> g.getGrade() >= 90)
                .filter(s -> s.getLastName().toLowerCase().startsWith("p"))
                .map(s -> {
                    s.setGrade(s.getGrade() + 5);
                return s;})
                .map(s-> s.getFirstName())
                .distinct()
                .forEach(s -> System.out.println(s));
        System.out.println();

        Integer optionalInteger = Stream.generate(() -> (int) (Math.random() * 1000))
                .limit(3)
                .filter(i -> i % 3 == 0)
                .findFirst().orElseGet(() -> 10);

        System.out.println(optionalInteger);






    }
}
