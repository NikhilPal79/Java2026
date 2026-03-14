package inclass.apr26.Lambda;

public class Main {
    static void main(String[] args) {

    ///    IUtil util = new Util(); traditional way of creating object

        IUtil util = x -> x % 2 == 0;   /// lambda



        System.out.println(util.checkEven(4));
        System.out.println(util.checkEven(5));
    }
}
