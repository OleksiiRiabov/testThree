package company;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private String name;
    private double budget;
    private List<Employee> employees = new ArrayList<Employee>();

    public Company(String name, double budget) {
        this.name = name;
        this.budget = budget;
    }

   public void addEmployee(Employee e) {
        employees.add(e);
    }

   public void getSalaryService() {
        SalaryService s = new SalaryService();
        s.pay(name, budget, employees);
    }
}
