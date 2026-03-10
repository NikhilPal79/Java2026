package inclass.apr26.FunctionalIterface;

@FunctionalInterface
public interface ICalculator {
    void calculate();

    default void play() {
        System.out.println(" playing calculator ");
    }

    default void work() {
        System.out.println(" working calculator ");
    }

    static void info(){
        System.out.println(" calculator info ");
    }
}
