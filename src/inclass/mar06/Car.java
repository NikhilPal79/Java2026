package inclass.mar06;

public class Car {

    String brand;
    String model;
    String color;

    public Car(String brand, String model, String color) {
        this.brand = brand;
        this.model = model;
        this.color = color;
    }


    public int getSeats(int seats) {
        return seats;
    }

    public String fuel(String fuel) {
        return fuel;
    }
}
