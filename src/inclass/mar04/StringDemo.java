package inclass.mar04;

public class StringDemo {
    static void main(String[] args) {

        String s1 = "Apple";
        String s2 = "Orange";
        String s3 = "Apple";
        String s4 = new String("Apple");


        System.out.println(s1 == s2);
        System.out.println(" FALSE,  == check reference");
        System.out.println(s1.equals(s2));
        System.out.println("FALSE, BOTH REF AND MEMORY DIFF");
        System.out.println(s1 == s3);
        System.out.println(" TURE, BOTH MEMORY IN STRING CONSTANT POOL  ");
        System.out.println(s1 == s4);
        System.out.println("FALSE , DIFFERENT MEMORY");
        System.out.println(s2.equals(s4));
        System.out.println("FALSE, DIFF REF, MEMORY");
    }
}
