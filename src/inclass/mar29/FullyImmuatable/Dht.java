package inclass.mar29.FullyImmuatable;


import java.util.Objects;

public final class Dht {


    ///  fully immutable classes

    private  final int id;
    private final String name;
    private final String email;

    public Dht(int id, String name, String email) {
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
    public String toString() {
        return "Dht{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Dht dht = (Dht) o;
        return id == dht.id && Objects.equals(name, dht.name) && Objects.equals(email, dht.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, email);
    }
}
