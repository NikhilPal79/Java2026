package inclass.mar11.superKeyword;

public class Car extends Vehicle {

    Double price = 5000.00;

    public void getDetails() {


        System.out.println(" vehicle specs");
        System.out.println(" name : " + super.name);
        System.out.println(" model : " + super.model);
        System.out.println(" price : " + super.price);
    }

    public void features() {
        super.getAgency();
        System.out.println(" vehicle features");
    }
}
