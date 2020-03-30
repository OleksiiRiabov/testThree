package company;

public class test {
    public static void main(String[] args) {


        Company c = new Company("Toshiba",10000.00);
        c.addEmployee(new Manager(1.1, 5));
        c.addEmployee(new Developer(2.2, 5));
        c.addEmployee(new ScrumMaster(1.1, 5));
        c.getSalaryService();
    }
}
