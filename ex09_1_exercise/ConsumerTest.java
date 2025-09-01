package ex09_1_exercise;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerTest {
  
  public static void main(String[] args) {
    
    List<Employee> eList = Employee.createShortList();// Calls a static method createShortList() from the Employee class, which presumably returns a list of Employee objects
    Employee first = eList.get(0);// Retrieves the first employee in the list and stores it in the variable first.
    
    Consumer<Employee> eCons = e -> System.out.println( // Defines a lambda expression that implements the Consumer<Employee> functional interface.
            "Name: " + e.getSurName() + "\nRole: " // The lambda takes an Employee object e and prints its surname, role, and salary.
            + e.getRole() + "\nSalary: " + e.getSalary() // This lambda is stored in the variable eCons.
    ); // Write your consumer lambda here
    
    System.out.println("=== First Salary"); // Prints a header to indicate that the first employee's salary information will follow.
    eCons.accept(first); // Calls the accept method of the Consumer interface.
                         // This applies the lambda to the first employee, triggering the print statement defined above.
    
  }
}

// This Java program demonstrates the use of the Consumer functional interface and lambda expressions. It creates a list of employees, retrieves the first one, and prints that employee's surname, role, and salary using a Consumer<Employee> lambda expression.
