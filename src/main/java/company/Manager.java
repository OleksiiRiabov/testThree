package company;

public class Manager extends Employee {

   public Manager (double ratePerHour, int workdays) {
        super(ratePerHour, workdays);
    }

    public String getPosition() {
        return "Manager";
    }
}
