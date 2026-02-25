package inclass.feb22;

public class Computer {


    int memory;
    String brandName;

    /// DEFAULT CONSTRUCTOR
    Computer(){

    }

    ///  PARAMETERIZED CONTRIBUTOR
    public Computer(int memory, String brandName) {
        this.memory = memory;
        this.brandName = brandName;
    }

    static void main(String[] args) {


        Computer computer = new Computer(256, "Dell");
        System.out.println(computer.brandName);
        System.out.println(computer.memory);
        computer.brandName = "HP";
        System.out.println(computer.brandName);
        System.out.println(computer.memory);
    }
}
