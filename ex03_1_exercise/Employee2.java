package ex03_1_exercise;

public class Employee2 {
    // private means these fields can only be accessed within this class, enforcing encapsulation
    private String name; //   the employee's name (text).
    private int age; // the employee's age (whole number).
    private double salary; // the employee’s salary (decimal number).

    public Employee2(String name, int age, double salary) { // This is a constructor that runs when a new Employee2 object is created.
                                                            // It accepts parameters (name, age, salary) and assigns them to the object’s fields using this.
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    } // A getter method for the name field. Allows other classes to access the private name

    public void setName(String name) {
        this.name = name;
    } // A setter method for name. Allows other classes to change the employee’s name.

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

// The Employee2 class models a basic employee with three attributes: name, age, and salary. It uses encapsulation, meaning its fields are private and accessed/modified through public getter and setter methods. A constructor is provided to initialize these fields when creating a new employee object. This is a common design pattern in object-oriented programming for creating well-structured and maintainable code.