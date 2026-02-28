package inclass.mar15.Composition;

public class Main {
    static void main(String[] args) {


        Name name1 = new Name(" nikhil ", " pal ");
        Name name2 = new Name(" harprinder ", " rall ");
        Name name3 = new Name(" ramneek", " punnu ");

        Address address1 = new Address(" 220 sunny meadow crt ", "kitchener","ontario");
        Address address2 = new Address(" 79 Bushnell drive", "cambridge","ontario");
        Address address3 = new Address(" 88 chamberlin drive ", "Brampton","ontario");

        Salary salary1 = new Salary("70000.0" ,"10000.0", "60000.0");
        Salary salary2 = new Salary("80000.0" ,"20000.0", "70000.0");
        Salary salary3 = new Salary("90000.0" ,"30000.0", "500000.0");


        Employee employee1 = new Employee(" 5072", name1, "nikhil@gmail.com", address1, salary1 );
        Employee employee2 = new Employee("7544", name2, " harpinder@gmail.com",  address2, salary2 );
        Employee employee3 = new Employee("6544", name2, " ramneek@gmail.com",  address3, salary3 );

        System.out.println(employee1);
        System.out.println();
        System.out.println(employee2);
        System.out.println();
        System.out.println(employee3);
        System.out.println();

        System.out.println(employee1.getAddress());
        System.out.println();
        System.out.println(employee2.getAddress());
        System.out.println();
        System.out.println(employee3.getAddress());


    }
}
