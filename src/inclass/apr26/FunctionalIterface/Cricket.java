package inclass.apr26.FunctionalIterface;

public class Cricket implements ICalculator, ISport{
    @Override
    public void calculate() {

    }

    @Override
    public void play() {
        ISport.super.play();
    }
    @Override
    public void work() {

    }
}
