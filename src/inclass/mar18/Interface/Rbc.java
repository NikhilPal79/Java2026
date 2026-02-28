package inclass.mar18.Interface;

public class Rbc implements Bank{


    @Override
    public void getRateOfInterest() {
        System.out.println("Rate of Interest of Rbc : "  + 2.5 + " % ");

    }
}
