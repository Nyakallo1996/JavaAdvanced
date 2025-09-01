package ex08_2_exercise;

import java.util.List;
import java.util.function.Predicate;

public class RoboMailTest01 {
  
  public static void main(String[] args) {
    
    List<Employee> pl = Employee.createShortList(); // Retrieves a list of Employee objects using the createShortList() method. This is likely a static utility method that returns a sample list for testing.
    RoboMail01 robo = new RoboMail01();   // Creates an instance of the RoboMail01 class, which likely has methods for sending communications (like email or SMS) to employees.

    Predicate<Employee> mailSales = p -> p.getAge() >= 60 && p.getDept().equals("Sales"); // Defines a predicate (a boolean-returning condition) to filter employees age 60 or older
    System.out.println("\n==== RoboMail 01");// Prints headers to indicate the section of the report or output.
    System.out.println("\n=== Sales Execs");
    
    pl.stream() // Uses Java's Stream API to: Stream the list p1, Apply the mailSales filter, for each matching employee, call roboMail( to send an email.
            .filter(mailSales)
            .forEach(p -> robo.roboMail(p));
  }
}

// This program:
//
//Loads a list of employees.
//
//Filters out Sales department employees aged 60 and older.
//
//Sends each of them an email using the roboMail() method.
//
//It demonstrates the use of Java Streams, lambda expressions, and predicates for clean, functional-style filtering and processing.