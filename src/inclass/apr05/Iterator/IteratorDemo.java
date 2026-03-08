package inclass.apr05.Iterator;

import java.util.Iterator;
import java.util.LinkedList;

public class IteratorDemo {
    static void main(String[] args) {


        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);

        System.out.println(list);
        System.out.println(list.size());
        System.out.println();

        if (list.contains(10)) {
            list.remove();
        }
        System.out.println(list);

        ///  let's try two task in for loop removing and looping

        ///  for each

        /*for (int  integer : list) {
            if (list.contains(20)) {
                list.remove(20);
            }
        }*/




        /// ITERATOR [like a pointer ] [loop and remove an element ]

        Iterator <Integer> iterator = list.iterator();

        System.out.println(iterator.next());

        while (iterator.hasNext()) {
            Integer nexted = iterator.next();
            if (nexted == 40) {
                iterator.remove();
            }
        }
        System.out.println(list);




    }
}
