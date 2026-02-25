package inclass.feb15;

public class ifElse {
    static void main() {

        boolean IndiaWin = true;


        if (IndiaWin == false) {
            System.out.println("India will qualify for world cup ");
        } else  {
            System.out.println("India will not qualify for world cup ");
        }


        int noOfDays = 366;

        if (noOfDays % 4 == 0) {
            System.out.println("this is leap year ");
        } else if(noOfDays % 4 != 0){
            System.out.println("this is not leap year ");
        }


        int x = 5;

        if(x % 2 == 0 ){
            System.out.println("this is even number ");
        }else if (x % 2 != 0){
            System.out.println("this is not even number ");
        }

        System.out.println();
        System.out.println("GRADING SYSTEM ");
        System.out.println();


        int marks = 80;

        if (marks == 100 &&  marks >= 90 ){
            System.out.println("Grade is A+");
        }else if( marks < 90 && marks >= 80 ){
            System.out.println("Grade is B+");
        } else if (marks < 80 && marks >= 70 ) {
            System.out.println("Grade is C+");

        } else if (marks < 70 && marks >= 60 ) {
            System.out.println("Grade is D+");

        } else if (marks < 60 && marks >= 50 ) {
            System.out.println("Grade is E+");

        }else{
            System.out.println( "Grade is F = Fail");
        }

        System.out.println();
        System.out.println("GIVING CHARACTER IS CONSONANT OR VOWEL ");
        System.out.println();


        char ch  = 'D';

        if (ch == 'a' || ch =='e' || ch =='i'|| ch == 'o' || ch == 'u'|| ch == 'A' || ch =='E' || ch =='I'|| ch == 'O' || ch == 'U' ) {
            System.out.println("Character is vowel ");

        } else{
            System.out.println("Character is consonant");

        }


    }
}
