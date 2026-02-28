package inclass.mar18.Interface;

public class Scotia implements Bank{
    @Override
    public void getRateOfInterest() {
        System.out.println("Rate of Interest of scotia : "  + 2.5 + " % " );
    }
}
