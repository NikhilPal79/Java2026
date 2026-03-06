package inclass.Practice.StringStingBuilderStringBuffer;

public class Test {
    static void main(String[] args) {


        String str = "Java Programming is Fun";

        String concated = str.trim().concat(" i am enjoying");
        System.out.println(concated);

        System.out.println(str.toString());
        System.out.println(concated.toString());
        System.out.println(" just each string is immutable class, they create new object every time in memory with each new reference ");


        StringBuilder stringBuilder = new StringBuilder(" java is very funny language, anyone can use this ");

        System.out.println(stringBuilder.append(" with some hardworking and understanding "));
        System.out.println(stringBuilder.length());
        System.out.println(stringBuilder.reverse());
        System.out.println(stringBuilder.lastIndexOf("very"));
    }
}
