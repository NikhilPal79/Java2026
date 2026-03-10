package inclass.apr26.Lambda;

public class Main {
    static void main(String[] args) {


        IUtil util = x -> x % 2 == 0;

        System.out.println(util.checkEven(4));
        System.out.println(util.checkEven(5));
    }
}
