package inclass.apr22;

import java.util.HashMap;
import java.util.Map;

public class CarMain {
    static void main(String[] args) {

        Map<Car, Integer> price = new HashMap<>();
        price.put(new Car("honda", "civic", "black"), 30000);
        price.put(new Car("honda", "civic", "black"), 30000);
        price.put(new Car("hyundai", "elantra", "grey"), 40000);

        System.out.println(new Car("honda", "civic", "black").equals(new Car("hyundai", "elantra", "grey")));
        System.out.println(new Car("honda", "civic", "black").equals(new Car("honda", "civic", "black")));
        System.out.println();
        System.out.println();


        System.out.println(new Car("honda", "civic", "black").hashCode());
        System.out.println(new Car("honda", "civic", "black").hashCode());
        System.out.println(new Car("hyundai", "elantra", "grey").hashCode());
        System.out.println("adding hashCode and equal method in parent class ");
        System.out.println();
        System.out.println();


        System.out.println(price.get(new Car("honda", "civic", "black")));
        System.out.println(price.get(new Car("hyundai", "elantra", "grey")));

    }
}
