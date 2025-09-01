package ex05_2_exercise;

public class Main {
    public static void main(String[] args) {
        Employee jane = new Employee("Jane Doe", "Manager", "HR", 65000); // Creates an instance of the Employee class for a person named Jane Doe.
        Employee john = new Employee("John Doe", "Staff", "HR", 55000);

        System.out.println("Jane's withholding: " + jane.getWithholding());
        System.out.println("John's bonus: " + john.getBonus());
    }
}
