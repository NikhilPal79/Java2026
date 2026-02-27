package inclass.mar11.superKeyword;

public class Vehicle {

    String name;
    String model;
    Double price = 3000.00;


    public Vehicle() {
    }

    public Vehicle(String name, String model, Double price) {
        this.name = name;
        this.model = model;
        this.price = price;
    }

    @Override
    public String toString() {
        return "vehicle{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }

    public void getDetails() {
        System.out.println(" vehicle specs");
        System.out.println(" name : " + name);
        System.out.println(" model : " + model);
        System.out.println(" price : " + price);
    }

    public void getAgency(){
        System.out.println("honda agency");
    }
}
