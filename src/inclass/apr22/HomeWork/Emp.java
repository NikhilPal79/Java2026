package inclass.apr22.HomeWork;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class Emp {

    private final int id;
    private final String firstName;
    private final String lastName;
    private List<String> phoneNumbers;


    public Emp(int id, String firstName, String lastName, List<String> list) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumbers = phoneNumbers;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public List<String> getPhoneNumbers() {
        return new ArrayList<>(phoneNumbers);
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumbers=" + phoneNumbers +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Emp emp = (Emp) o;
        return id == emp.id && Objects.equals(firstName, emp.firstName) && Objects.equals(lastName, emp.lastName) && Objects.equals(phoneNumbers, emp.phoneNumbers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, phoneNumbers);
    }


}
