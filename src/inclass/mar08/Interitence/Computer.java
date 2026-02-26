package inclass.mar08.Interitence;

public class Computer {


    String name;
    int capacity;
    double price;

    public Computer(String name, int capacity, double price) {
        this.name = name;
        this.capacity = capacity;
        this.price = price;
    }

    public Computer() {
    }

    @Override
    public String toString() {
        return "Computer{" +
                "name='" + name + '\'' +
                ", capacity=" + capacity +
                ", price=" + price +
                '}';
    }

    public void getSpecification(){
        System.out.println(" SPECIFICATIONS");
        System.out.println(" NAME : " + name);
        System.out.println(" CAPACITY : " + capacity);
        System.out.println(" PRICE : " + price);
    }
}
