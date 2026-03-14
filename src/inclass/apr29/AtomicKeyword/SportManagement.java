package inclass.apr29.LmbdaLocalVariable;

import inclass.apr26.FunctionalIterface.ICalculator;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class SportManagement implements IPlay {

    void run(){

        int x = 10;

        AtomicInteger atomicInteger = new AtomicInteger(10);

        Runnable iCalculator = () -> {
            atomicInteger.set(20);
            System.out.println(atomicInteger.get());
        };

        iCalculator.run();

    };

    @Override
    public void play() {
        System.out.println(" how to change local variable with the help of atomicInteger using in lambda  ");
    }
}
