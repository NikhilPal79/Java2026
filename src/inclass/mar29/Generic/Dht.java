package inclass.mar29.Generic;

public class  Dht < M,N > {

    M  id;
    N name;

    public Dht(M id, N name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dht{" +
                "id=" + id +
                ", name=" + name +
                '}';
    }
}


