package inclass.apr01.LinkedList;

import java.util.LinkedList;

public class Rogers {
    static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();
        list.add(100);
        list.add(200);
        list.add(400);
        list.add(500);
        list.add(500);
        list.add(600);
        list.add(null);
        System.out.println(list);
        System.out.println(list.size());

    }
}
