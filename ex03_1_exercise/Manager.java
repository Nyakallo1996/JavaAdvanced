package ex03_1_exercise;

public class Manager extends Employee2 {
    private String deptName; // Declares a private field deptName to store the name of the department the manager oversees.

    Manager(String name, int age, double salary,String deptName) { // This is the constructor for the Manager class.

        super(name, age, salary); // Calls the constructor of the superclass (Employee2) to initialize name, age, and salary.
        this.deptName = deptName; // Initializes the deptName field with the value passed to the constructor.
    }

    public String getDeptName() {
        return deptName;
    } // A getter method for deptName, allowing other classes to retrieve the department name.

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    } // A setter method for deptName, allowing other classes to change the manager’s department.

}

// The Manager class is a subclass of Employee2, meaning it inherits name, age, and salary. It adds a new field called deptName to store the department the manager is in charge of. The class includes a constructor to initialize all fields and provides getter and setter methods for deptName. This shows how inheritance is used in Java to extend the functionality of a base class (Employee2).
