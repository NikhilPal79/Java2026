package inclass.mar04;

public class StringMethod {
    static void main(String[] args) {

        String s1 = new String("Nikhil");

        System.out.println(s1.toString());
        System.out.println();
        System.out.println(s1.contains("nikhil"));
        System.out.println();
        System.out.println(s1.toUpperCase());
        System.out.println();
        System.out.println(s1.length());
        System.out.println();
        System.out.println(s1.toLowerCase());
        System.out.println();
        System.out.println(s1.toUpperCase());
        System.out.println();
        System.out.println(s1.substring(2));
        System.out.println();
        char[] charArray = s1.toCharArray();

        ///  reverse the array

        for (char i = (char) (charArray.length -1); i >= 0 ; i--){
            ;System.out.println(charArray[i]);
        }

    }
}
