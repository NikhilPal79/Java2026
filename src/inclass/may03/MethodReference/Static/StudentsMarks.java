package inclass.may03.MethodReference.Static;

import inclass.may03.Stream.Student;

public class StudentsMarks {

    public static Students graceMarks(Students students) {
        students.setGrade(students.getGrade()+5);
        return students;
    }
}
