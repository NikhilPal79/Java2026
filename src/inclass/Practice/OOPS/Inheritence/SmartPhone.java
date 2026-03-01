package inclass.Practice.OOPS.Inheritence;

public class SmartPhone extends Rogers implements Bell, Telus{

    @Override
    public void getNewPlan() {
        System.out.println(" new plan of 2026");
    }

    @Override
    public void getDetails() {
        System.out.println(" new details in 2026");
    }

    @Override
    public void getRange() {
        System.out.println(" more in range in 2026 as compared to 2025");
    }

    public void getNewSim(){
        System.out.println(" get new sim with new rogers phone ");
    }
}
