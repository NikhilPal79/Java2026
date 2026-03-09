package inclass.apr08.Comparator;

import java.util.Comparator;

public class Bank implements Comparable<Bank> {
    int id;
    String name;
    Double balance;


    public Bank(int id, String name, Double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }



    @Override
    public int compareTo(Bank b) {
        return this.name.compareTo(b.name);
    }
}
