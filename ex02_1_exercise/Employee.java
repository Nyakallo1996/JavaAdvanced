package ex02_1_exercise;

public class Employee {
    public String name, surname; // name and surname are variables of type String, and they will store the employee's first and last names.
    public int age; // age is an int (integer) and will store the employee's age.

    public static void main(String[] args) {
        Employee emp1 = new Employee(); // A new Employee object is created and assigned to the variable emp1.
        emp1.name = "Nyakallo"; // These lines set the values of emp1's fields
        emp1.surname = "Mbhele";
        emp1.age = 59;
        System.out.println("Employee Name:\n" + emp1.name + " " + emp1.surname); // This line prints the employee’s full name to the console.
        System.out.println(); // Prints a blank line for spacing.
        System.out.println("Employee Age:\n" + emp1.age); // This line prints the employee’s age to the console.

    }
}

// This Java program defines a class Employee with three fields: name, surname, and age. Inside the main method, it creates an Employee object, assigns it values, and prints out the employee’s name and age.
