package inclass.feb15;

import javax.swing.*;

public class practice {
    static void main() {

         int x = 10;
         int y = 20;
         int a = 30;
         int b = 20;

         boolean result1 = (x > y ) && (x==10);
        System.out.println(result1);                    ///FALSE
         boolean result2 = (a > y ) || ( x < a);
        System.out.println(result2);                    /// TRUE
         boolean result3 = (x < y ) && (x > b );
        System.out.println(result3);                    /// FALSE
         boolean result4 = (x > y ) || (y > a );
        System.out.println(result4);                    /// FALSE
         boolean result5 = (a > y ) && (y == 20);
        System.out.println(result5);                    /// TRUE
         boolean result6 = (x >= 10 ) || (a == b);
        System.out.println(result6);                     /// TRUE
         boolean result7 = (a > x ) && (x <= 10);
        System.out.println(result7);                     /// TRUE
        boolean result8 = !((x >= 10 ) || (a == b));
        System.out.println(result8);                     /// TRUE
        boolean result9 = !((a > x ) && (x <= 10));
        System.out.println(result9);                     /// TURE
    }
}
