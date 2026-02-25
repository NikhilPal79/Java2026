package inclass.mar01.Static.Method;

public class Emp {

    int id;
    String name;
    static String dept = "Rogers";

    public Emp(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void empDetails() {
        System.out.println(dept);

    }
}
