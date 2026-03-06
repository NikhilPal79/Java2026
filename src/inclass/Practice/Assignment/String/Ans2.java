package inclass.Practice.Assignment.String;

public class Ans2 {
    static void main(String[] args) {


        /// Write a Java program that takes a sentence as input and reverses the order of words in it.
        /// A word is defined as a sequence of non-space characters. The program should maintain the order of
        /// characters within each word.
        /// For example:
        ///
        /// Input: "Hello World" Output: "World Hello"
        ///
        /// Input: "Java Programming is Fun" Output: "Fun is Programming Java"

        String st = "Java Programming is Fun";

        String[] words = st.split(" ");

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = words.length- 1; i >= 0 ; i--) {
            stringBuilder.append(words[i]);
            if (i != 0) {
                stringBuilder.append(" ");
            }
        }
        System.out.println(" input : " + st );
        System.out.println(" output : " + stringBuilder );


    }
}
