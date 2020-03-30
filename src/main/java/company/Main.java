package company;

public class Main {

    public static void main(String[] args) {
        Company c = new Company("Toshiba",10000.00);
        c.addEmployee(new Manager(8, 5));
        c.addEmployee(new Developer(10, 5, 100));
        c.addEmployee(new ScrumMaster(9, 5));
        c.getSalaryService();

    }
}
