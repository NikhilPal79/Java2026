package inclass.Practice.OOPS.Abstraction;

public class Honda extends Car{

    @Override
    void getNumberPlate() {
        System.out.println(" lov mapaa number plate");
    }

    @Override
    void getColor() {
        System.out.println("black colour ");
    }

    @Override
    void getIgnition() {
        System.out.println("petrol engine");
    }
}
