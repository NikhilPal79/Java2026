package inclass.mar18.Interface;

public class BankMain {
    static void main(String[] args) {

        Bank scotia = new Scotia();
        scotia.getRateOfInterest();
        System.out.println();
        Bank rbc = new Rbc();
        rbc.getRateOfInterest();
    }
}
