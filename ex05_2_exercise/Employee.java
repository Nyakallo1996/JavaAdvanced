package ex05_2_exercise;

public class Employee {

    // These are private instance variables to store employee details
    private String name;
    private String role;
    private String dept;
    private double salary;

    BenefitsHelper helper = new BenefitsHelper(); // Instantiates a BenefitsHelper object.

    public Employee() {
        super();
    } // A default constructor that calls the superclass constructor (usually Object)

    public Employee(String name, String role, String dept, double salary) { // A parameterized constructor to initialize an Employee with all details
        this.name = name;
        this.role = role;
        this.dept = dept;
        this.salary = salary;
    }

    public String getName() {
        return name;
    } // Standard getter methods for each field, allowing access to private variables

    public String getRole() {
        return role;
    }

    public String getDept() {
        return dept;
    }

    public double getSalary() {
        return salary;
    }

    public double getBonus() {
        return helper.calcBonus(salary);
    }

    public double getWithholding() {
        return helper.calcWithholding(salary);
    }

    private class BenefitsHelper {
        private final double bonusRate = 0.02;

        private final double withholdingRate = 0.07;

        protected double calcBonus(double salary) {
            return salary * bonusRate;
        }

        protected double calcWithholding(double salary) {
            return salary * withholdingRate;
        }
    }

}

// The Employee class models an employee with fields for name, role, department, and salary. It includes a private inner class BenefitsHelper that calculates a bonus (2% of salary) and withholding (7% of salary). The main class accesses these calculations through getBonus() and getWithholding() methods.
