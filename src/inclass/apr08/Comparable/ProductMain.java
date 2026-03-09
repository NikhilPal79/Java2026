package inclass.apr08.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductMain {
    static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        products.add(new Product(101,"APPLE", "TAB"));
        products.add(new Product(104,"SAMSUNG", "PHONE"));
        products.add(new Product(105,"DELL", "LAPTOP"));
        products.add(new Product(103,"HP", "DESKTOP"));
        products.add(new Product(102,"ASUS", "MOUSE"));

        System.out.println("before sorting : " + products);
        Collections.sort(products);
        System.out.println("after sorting  : " + products);

    }
}
