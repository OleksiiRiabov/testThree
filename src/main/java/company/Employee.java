package company;

public abstract class Employee {
    private double ratePerHour;
    private int workdays;
    public static final int CVAR = 8;

    public Employee(double ratePerHour, int workdays) {
        this.ratePerHour = ratePerHour;
        this.workdays = workdays;
    }
    public double getRatePerHour() {
        return ratePerHour;
    }
    public int getWorkdays() {
        return workdays;
    }

    public double getSalary() {
        return ratePerHour * workdays * CVAR;
    }

    public String getPosition() {
        return "Employee";
    }
}
