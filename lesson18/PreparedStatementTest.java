package lesson18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;

public class PreparedStatementTest {

    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/Project1 - EmployeeDB";
        String username = "postgres";
        String password = "Hlapi1971";
        String input = "";
        double searchValue;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); // Prepares a BufferedReader to read input from the console.
        try (Connection con = DriverManager.getConnection(url, username, password)) {
            PreparedStatement pStmt = con.prepareStatement("SELECT * FROM employees WHERE salary_id > ?");
            // Loop 
            while (true) {
                System.out.print("Enter salary id to search for or Q to quit: ");
                input = in.readLine();
                if (input.equals("q") || input.equals("Q")) {
                    break;
                }
                searchValue = Double.valueOf(input);
                pStmt.setDouble(1, searchValue);
                ResultSet rs = pStmt.executeQuery();
                while (rs.next()) {
                    int empID = rs.getInt("emp_id");
                    String first = rs.getString("first_name");
                    String last = rs.getString("surname");
                    //Date birth_date = rs.getDate("BIRTHDATE");
                    float salary = rs.getFloat("salary_id");
                    System.out.format("Employee ID:   %s%n"
                            + "Employee Name: %s %s%n"
                           // + "Birth Date:    %s%n"
                            + "Salary:        %s%n%n",
                            empID, first, last, salary);
                }
            }// end of while
        } catch (NumberFormatException n) {
            System.out.println("Please enter a valid number.");
        } catch (IOException | SQLException e) {
            System.out.println("SQLException: " + e);
        } // end of try-with-resources
    }
}