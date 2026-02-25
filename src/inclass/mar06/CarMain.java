package inclass.mar06;

public class CarMain {
    static void main(String[] args) {


        Car car = new Car("honda", "civic", "black");

        System.out.println(car.getSeats(5));
        System.out.println(car.fuel("petrol"));
    }
}