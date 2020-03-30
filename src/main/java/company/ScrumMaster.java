package company;

public class ScrumMaster extends Employee {

    public ScrumMaster (double ratePerHour, int workdays) {
        super(ratePerHour, workdays);
    }

    public String getPosition() {
        return "Scrum Master";
    }
}
