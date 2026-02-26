package inclass.mar08.StringSBuilderSBuffer;

import java.sql.SQLOutput;

public class Demo {
    static void main(String[] args) {

        String name = new String("nikhil");

        System.out.println(name);
        name.concat(" as a devops ");
        System.out.println(name);
        System.out.println(" THIS DIDNT CHANGE THE STRING, BCZ WE USE THE SAME REF, TO MAKE CHANGE ME NEED TO CHANGE THE REF");
        String concat = name.concat(" as a devops ");
        System.out.println(concat);
        System.out.println(" THIS STRING IS IMMUTABLE CLASS, THAT WE CANT CHANGE  THIS STRING");
        System.out.println();


        StringBuffer occ = new StringBuffer("manpreet");

        System.out.println(occ);
        StringBuffer append1 = occ.append(" as a RN ");
        System.out.println(append1 );
        System.out.println(" USING STRING BUILDER AND STRING BUFFER, WE CAN CHANGE THE STRING");
        System.out.println(" THREAD SAFE, ");
        System.out.println();


        StringBuilder og = new StringBuilder("manpreet");

        System.out.println(og);
        StringBuilder append = og.append(" as a wife ");
        System.out.println(append);
        System.out.println(" USING STRING BUILDER TO MAKE CHANGE IN STRING ");
        System.out.println(" NOT - THREAD SAFE ");
    }
}
