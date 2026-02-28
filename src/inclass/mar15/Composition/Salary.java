package inclass.mar15.Composition;

public class Salary {

    private String gross;
    private String tax;
    private String afterDeduction;

    public Salary(String gross, String tax, String afterDeduction) {
        this.gross = gross;
        this.tax = tax;
        this.afterDeduction = afterDeduction;

    }

    public String getGross() {
        return gross;
    }

    public void setGross(String gross) {
        this.gross = gross;
    }

    public String getTax() {
        return tax;
    }

    public void setTax(String tax) {
        this.tax = tax;
    }

    public String getAfterDeduction() {
        return afterDeduction;
    }

    public void setAfterDeduction(String afterDeduction) {
        this.afterDeduction = afterDeduction;
    }

    @Override
    public String toString() {
        return "Salary{" +
                "gross='" + gross + '\'' +
                ", tax='" + tax + '\'' +
                ", afterDeduction='" + afterDeduction + '\'' +
                '}';
    }
}
