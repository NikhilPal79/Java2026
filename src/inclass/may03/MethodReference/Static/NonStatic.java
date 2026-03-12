package inclass.may03.MethodReference.Static;

public class NonStatic {

    public Students lastNameFunction(Students students){
        students.getFirstName().startsWith("s");
        return students;

    }
}
