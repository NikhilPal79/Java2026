package inclass.mar29.FullyImmuatable;

import java.util.Objects;

public final class Emp {

    final private int id;
    final private String  name;
    final private String  email;

    public Emp(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Emp emp = (Emp) o;
        return id == emp.id && Objects.equals(name, emp.name) && Objects.equals(email, emp.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, email);
    }


}
