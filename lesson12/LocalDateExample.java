package lesson12;

import java.time.LocalDate; // Imports the LocalDate class to work with dates without time.

import static java.lang.System.out; // Imports the out static field from System class to simplify printing to the console.
import static java.time.DayOfWeek.TUESDAY; // Imports the TUESDAY constant from the DayOfWeek enumeration to reference it directly in the code.
import static java.time.temporal.TemporalAdjusters.next; // Imports the next method from the TemporalAdjusters class, which allows calculating the next occurrence of a specific day of the week.

public class LocalDateExample {

  public static void main(String[] args) {
    LocalDate now, bDate, nowPlusMonth, nextTues; // Variable declarations and current date
    now = LocalDate.now(); // Assigns the current date (system date) to the variable now.
    out.println("Now: " + now);
    bDate = LocalDate.of(1995, 5, 23); // Java's Birthday
    out.println("Java's Bday: " + bDate);
    out.println("Is Java's Bday in the past? " + bDate.isBefore(now));
    out.println("Is Java's Bday in a leap year? " + bDate.isLeapYear());
    out.println("Java's Bday day of the week: " + bDate.getDayOfWeek());
    nowPlusMonth = now.plusMonths(1);
    System.out.println("Now: " + now);
    out.println("The date a month from now: " + nowPlusMonth);
    nextTues = now.with(next(TUESDAY));
    out.println("Next Tuesday's date: " + nextTues);
  }
}
