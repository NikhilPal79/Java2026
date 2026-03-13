package inclass.may06.FlatMap;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StudentMain {
    static void main(String[] args) {


        Student student1 = Student.builder().id(1).firstName("nikhil").lastName("p").grade(92).emails(List.of("nik@gmail.com", "npal@gmail.com")).build();
        Student student2 = Student.builder().id(2).firstName("mayank").lastName("p").grade(98).emails(List.of("mik@gmail.com", "mpal@gmail.com")).build();
        Student student3 = Student.builder().id(3).firstName("manpreet").lastName("k").grade(99).emails(List.of("man@gmail.com", "mpal@gmail.com")).build();
        Student student4 = Student.builder().id(4).firstName("samriti").lastName("p").grade(93).emails(List.of("sam@gmail.com", "sapal@gmail.com")).build();
        Student student5 = Student.builder().id(5).firstName("veena").lastName("p").grade(95).emails(List.of("veena@gmail.com", "vepal@gmail.com")).build();
        Student student6 = Student.builder().id(6).firstName("ram").lastName("k").grade(91).emails(List.of("ram@gmail.com", "rapal@gmail.com")).build();


        ArrayList<Student> student = new ArrayList<>(List.of(student1, student2, student3, student4, student5, student6));

        student.stream().flatMap(s -> s.getEmails().stream()).forEach(System.out::println);
        List<String> collectedList = student.stream().flatMap(s -> s.getEmails().stream()).collect(Collectors.toList());
        System.out.println(collectedList);
        System.out.println();
        System.out.println("trying list inside list of a list ");

        Session build1 = Session.builder().sessionId(11).student(List.of(student1, student2)).build();
        Session build2 = Session.builder().sessionId(13).student(List.of(student3,student4)).build();;
        Session build3 = Session.builder().sessionId(15).student(List.of(student5,student6)).build();

        ArrayList<Session> sessionArrayList = new ArrayList<>(List.of(build1, build2, build3));

        sessionArrayList.stream()
                .flatMap(b-> b.getStudent().stream()
                        .flatMap(s-> s.getEmails().stream()))
                .forEach(System.out::println);
        List<String> stringList = sessionArrayList.stream()
                .flatMap(b -> b.getStudent().stream()
                        .flatMap(s -> s.getEmails().stream()))
                .collect(Collectors.toList());

        System.out.println(stringList);


    }
}
