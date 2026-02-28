package inclass.mar15.Abstaction;

public class Honda extends Car{

    @Override
    public void brand() {
        System.out.println("Honda brand");
    }

    @Override
    public void model() {
        System.out.println("civic-T model");
    }

    @Override
    public void makeYear() {
        System.out.println("2018");
    }

    @Override
    public void color() {
        System.out.println(" colour is black");
    }


}
