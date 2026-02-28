package inclass.mar15.Composition;

public class Employee {

    private String id;
    private Name name;
    private String email;
    private Address address;
    private Salary Salary;


    public Employee(String id, Name name, String mail, Address address, Salary salary) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.address = address;
        this.Salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Salary getSalary() {
        return Salary;
    }

    public void setSalary(Salary salary) {
        Salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name=" + name +
                ", email='" + email + '\'' +
                ", address=" + address +
                ", Salary=" + Salary +
                '}';
    }
}
