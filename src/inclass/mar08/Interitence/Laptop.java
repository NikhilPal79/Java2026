package inclass.mar08.Interitence;

public class Laptop extends Computer{
    static void main(String[] args) {


        Computer c = new Computer("dell", 256, 1000.0);
        c.getSpecification();
        System.out.println();

        Laptop l = new Laptop();
        l.name = "hp";
        l.capacity = 128;
        l.price = 2500.0;
        l.getSpecification();


    }

}
