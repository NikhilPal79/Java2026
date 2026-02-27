package inclass.mar11.superKeyword;

public class Main {
    static void main(String[] args) {

        ///  no -use of super


        Car car = new Car();

        car.name = "honda";
        car.model = "civic";
        car.price = 4000.00;

        car.getDetails();
        System.out.println(" called the new values which we set");
        System.out.println();

        car.features();
        System.out.println(" use of super in feature method in car class ");






    }
}
