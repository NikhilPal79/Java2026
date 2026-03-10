package inclass.apr12;

import java.util.HashMap;
import java.util.Map;

public class Main {
    static void main(String[] args) {

        Map<String,Integer> map = new HashMap<>();
        map.put("nikhil", 33);
        map.put("manpreet", 25);
        System.out.println(map);

        System.out.println(map.hashCode());
        System.out.println(map.equals("nikhil"));

    }
}
