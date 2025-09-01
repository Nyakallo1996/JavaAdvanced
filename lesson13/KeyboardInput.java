package lesson13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//This program demonstrates how to read text input from the keyboard in java using BufferedReader and InputStreamReader

public class KeyboardInput {

    public static void main(String[] args) {
        String s = ""; // A String variable s is initialized to hold the input text entered by the user.
        try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) { // A BufferedReader object (in) is created to read input from the standard input stream (System.in).
            // InputStreamReader(System.in): Converts the byte stream from the keyboard into a character stream.
            //BufferedReader: Wraps the InputStreamReader to provide efficient reading of text lines.
            System.out.print("Type xyz to exit: "); // The program prompts the user to type text.
            s = in.readLine(); // in.readLine() reads a line of input from the keyboard and assigns it to the variable s.
            while (s != null) { // The loop runs as long as the user provides input (s != null).
                System.out.println("Read: " + s.trim()); // The trim() method removes leading and trailing whitespace from the input and prints it.
                if (s.equals("xyz")) { // If the user types "xyz", the program terminates immediately using System.exit(0), where 0 indicates a normal exit.
                    System.exit(0);
                }
                System.out.print("Type xyz to exit: "); // After processing the current input, the program prompts the user again to type more input or "xyz" to exit.
                s = in.readLine();
            }
        } catch (IOException e) { // Catch any IO exceptions.
            System.out.println("Exception: " + e);
        }
    }
}

 // Key Concepts
//BufferedReader: Enhances efficiency by buffering the input, allowing for faster and more convenient reading.
//
//InputStreamReader: Acts as a bridge to convert byte streams (System.in) into character streams.
//
//User Interaction: The program continuously accepts input from the user and only exits when the specific keyword "xyz" is typed.
//
//Exception Handling: Ensures the program does not crash unexpectedly due to input/output errors.