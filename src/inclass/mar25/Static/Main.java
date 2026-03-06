package inclass.mar25.Static;

public class Main {
    static void main(String[] args) {


        Computer computer = new Computer();
        computer.Keyboard();
        computer.Mouse();
        System.out.println();


        Computer.MotherBoard motherboard = new Computer.MotherBoard();
        motherboard.calculation();

    }
}
