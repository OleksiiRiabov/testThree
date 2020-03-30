package company;

public class Developer extends Employee {
    private double bonuses;

    public Developer (double ratePerHour, int workdays, double bonuses) {
        super(ratePerHour, workdays);
        this.bonuses = bonuses;
    }
    Developer (double ratePerHour, int workdays) {
        this(ratePerHour, workdays, 0.0);
    }

    public String getPosition() {
        return "Developer";
    }

    public double getSalary() {
        return getRatePerHour() * getWorkdays() * 8 + bonuses;
    }
}
