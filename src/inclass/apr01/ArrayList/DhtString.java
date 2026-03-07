package inclass.apr01.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class DhtString {
    static void main(String[] args) {


        List list = new ArrayList();

        list.add("nikhil");
        list.add("ajay");
        list.add("harp");
        list.add("karan");
        list.add("ramneek");
        list.add("ramneek");
        list.add(null);
        System.out.println(list);



        List<String> list2 = new ArrayList();
        list2.add("nikhil");
        list2.add(null);
        list2.add("ajay");
        list2.add("karan");
        list2.add("harp");
        list2.add("ramneek");
        System.out.println(list2);
    }
}
