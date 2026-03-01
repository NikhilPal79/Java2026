package inclass.Practice.OOPS.Abstraction;

public class Tesla extends Car{

    @Override
    void getNumberPlate() {
        System.out.println(" get a cool number plate ");
    }

    @Override
    void getColor() {
        System.out.println(" white color ");
    }

    @Override
    void getIgnition() {
        System.out.println(" electric car ");
    }
}
