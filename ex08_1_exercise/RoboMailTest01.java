package ex08_1_exercise;

import java.util.List;
import java.util.function.Predicate;

public class RoboMailTest01 {
  
  public static void main(String[] args) {
    
    List<Employee> pl = Employee.createShortList(); // Creates a List of Employee objects by calling a static method createShortList() from the Employee class. This likely returns a sample list of employees.
    RoboMail01 robo = new RoboMail01(); // Creates an instance of the RoboMail01 class, which likely contains methods to send emails and text messages to employees.

    Predicate<Employee> salesExecutives =  // Defines a lambda predicate to filter only those employees whose role is EXECUTIVE and department is "Sales".
      p -> p.getRole().equals(Role.EXECUTIVE) 
        && p.getDept().equals("Sales");
    
    Predicate<Employee> salesEmployeesOver50 = // Defines a lambda predicate to filter employees who are 50 years or older and work in the "Sales" department.
      p -> p.getAge() >= 50 && p.getDept().equals("Sales");
    
    System.out.println("\n==== RoboMail 01"); // Prints a section header.
    System.out.println("\n=== Sales Execs ===");
    //mail stream
    pl.stream() // Streams the list of employees, filters using the salesExecutives predicate, and sends email to each matching employee using roboMail().
            .filter(salesExecutives)
            .forEach(p -> robo.roboMail(p));
    //text stream
    pl.stream() // Does the same as above, but sends text messages using roboText().
            .filter(salesExecutives)
            .forEach(p -> robo.roboText(p));
    
    System.out.println("\n=== All Sales ==="); // Prints a subsection header for all sales employees over 50.
    //mail stream
    pl.stream() // Filters employees who are 50+ and in sales, and sends them an email.
            .filter(salesEmployeesOver50)
            .forEach(p -> robo.roboMail(p));
    //text stream
    pl.stream() // Sends those same employees a text message.
            .filter(salesEmployeesOver50)
            .forEach(p -> robo.roboText(p));
  }
}

// This program filters a list of employees and sends messages based on specific criteria:
//
//Sales Executives receive both email and text.
//
//Sales employees over age 50 also receive both email and text.
//
//It uses Java Streams and lambda expressions (Predicate<Employee>) to process and filter the employee list in a clean, functional style.
