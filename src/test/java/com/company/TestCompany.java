package com.company;

import company.Company;
import company.Developer;
import company.Manager;
import company.ScrumMaster;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class TestCompany {
    private String testCompanyName;
    private double testCompanyBudget;
    private double testRatePerHour;
    private int testWorkdays;
    private double testBonuses;

    public TestCompany(String testCompanyName, double testCompanyBudget, double testRatePerHour, int testWorkdays, double testBonuses) {
        this.testCompanyName = testCompanyName;
        this.testCompanyBudget = testCompanyBudget;
        this.testRatePerHour = testRatePerHour;
        this.testWorkdays = testWorkdays;
        this.testBonuses = testBonuses;
    }


    @Parameterized.Parameters
    public static Collection parameters() {
        return Arrays.asList(new Object[][] {
                {"Toshiba", 10000.00, 8, 5, 0},
                {"LG", 15000.00, 7, 6, 100},
                {"Sony", 20000.00, 8, 7, 150}
        });
    }

    @Before
    public void before() { // executes before every test case
        System.out.println("Before test");
    }

    @Test
    public void test() {
        Company test = new Company(testCompanyName, testCompanyBudget);
        test.addEmployee(new Manager( testRatePerHour, testWorkdays));
        test.addEmployee(new Developer(testRatePerHour, testWorkdays, testBonuses));
        test.addEmployee(new ScrumMaster(testRatePerHour, testWorkdays));
        test.getSalaryService();
    }

    @After
    public void after() {
        System.out.println("After test \n");
    }
}
