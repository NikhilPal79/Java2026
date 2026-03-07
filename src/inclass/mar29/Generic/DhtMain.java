package inclass.mar29.Generic;

import java.util.ArrayList;
import java.util.List;

public class DhtMain {
    static void main(String[] args) {


        Dht<Integer, String > dht = new Dht<>(5072, "nikhil");
        System.out.println(dht);
        dht.id = 6482;
        dht.name = "ajay";
        System.out.println(dht);
        dht.id = 7544;
        dht.name = "harp";
        System.out.println(dht);
    }
}
