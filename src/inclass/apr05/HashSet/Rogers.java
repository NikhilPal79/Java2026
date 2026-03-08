package inclass.apr05.HashSet;

import java.util.HashSet;
import java.util.Set;

public class Rogers {
    static void main(String[] args) {

        Set<String> strings = new HashSet<>();

        strings.add("nikhil");
        strings.add("nikhil");
        strings.add("harp");
        strings.add("pankaj");
        strings.add("karan");
        strings.add(null);
        System.out.println(strings);

    }
}
