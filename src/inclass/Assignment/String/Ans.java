package inclass.Assignment.String;

public class Ans {
    static void main(String[] args) {


        String sting = " racecar";
        String reversed = new StringBuilder(sting).reverse().toString();

        if (sting.equals(reversed)) {
            System.out.println(" str is palindrome " + sting);

        }else {
            System.out.println(" str is not palindrome " + sting);
        }

        StringBuilder  sb = new StringBuilder("racecar");

        System.out.println(sb);
        int vowels = 0;
        int consonants = 0;
        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            } else if (ch >= 'a' && ch <= 'z') {
                consonants++;
            }
        }
        System.out.println(" vowels : " + vowels);
        System.out.println(" consonants : " + consonants);
    }
}
