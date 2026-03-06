package inclass.mar29.Generic;

import java.util.List;

public class TelleMain {
    static void main(String[] args) {


        Telle<Integer, String> telle = new Telle(1,"best");
        System.out.println(telle);
        System.out.println();
        telle.company1 = 2;
        telle.company2 = "rich";
        System.out.println(telle);
        System.out.println();

        Telle<String, Integer> telle2 = new Telle("worst", 2);
        System.out.println(telle2);
        System.out.println();
        telle2.company1 = " poor";
        telle2.company2 = 4;
        System.out.println(telle2);


    }
}
