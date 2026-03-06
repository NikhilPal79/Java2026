package inclass.mar29.Generic;

public class Telle< N, M > {

    N company1;
    M company2;

    public Telle(N company1, M company2) {
        this.company1 = company1;
        this.company2 = company2;
    }

    @Override
    public String toString() {
        return "Telle{" +
                "company1=" + company1 +
                ", company2=" + company2 +
                '}';
    }
}
