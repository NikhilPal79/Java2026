package inclass.Practice.MethodOverriding;

public class Main {
    static void main(String[] args) {

        Honda honda = new Honda();
        honda.noOfWheels();
        System.out.println("clearly if you click on method noOfWheels it will take it to you to Honda class ");
        System.out.println(" method is allocated at the time of compile time ");

        System.out.println();


        Car car = new Tesla();
        car.noOfWheels();
        System.out.println(" in this case if you click on the noOfWheels method it will take you to Car class method ");


    }
}
