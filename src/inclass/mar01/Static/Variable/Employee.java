package inclass.mar01.Static.Variable;

public class Employee {

    int id;
    String name;
    static String company = "Rogers";

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void empdetails(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(company);
    }
}
