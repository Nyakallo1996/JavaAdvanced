package lesson13;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// This program demonstrates how to copy the contents of a text file character-by-character using character streams in Java.

public class CharStreamCopyTest {

    public static void main(String[] args) {
//        if (args.length < 2) {
//            System.out.println("Usage: CharStreamCopyTest <original file> <copy>");
//            System.exit(-1);
//        }
        char[] c = new char[128]; // A character array c of size 128 is created to temporarily store chunks of characters read from the input file.
        // Example use of InputStream methods
        // The try-with-resources block ensures these resources are automatically closed after use, avoiding resource leaks.
        try (FileReader fr = new FileReader("C:\\YourJavaDirectory\\Input.txt"); // A FileReader object (fr) is created to read characters from the file Input.txt.
                FileWriter fw = new FileWriter("C:\\YourJavaDirectory\\CharOutput.txt")) { // A FileWriter object (fw) is created to write characters to the file CharOutput.txt.
            int count = 0; // count accumulates the total number of characters copied.
            int read = 0; // read holds the number of characters read in each iteration.
            //The loop continues until the end of the file is reached, indicated by fr.read(c) returning -1.
            while ((read = fr.read(c)) != -1) { // fr.read(c) reads up to 128 characters (the size of c) from the input file and stores them in the array c.
                fw.write(c); // fw.write(c) writes the characters from the array c to the output file.
                count += read;
            }
            System.out.println("Wrote: " + count + " characters."); // After the loop ends, the total number of characters written to the output file is displayed.
        } catch (FileNotFoundException f) {
            System.out.println("File " + args[0] + " not found."); // file not found or cannot be opened
        } catch (IOException e) {
            System.out.println("IOException: " + e); // other error issues
        }
    }
}
