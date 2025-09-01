package lesson13;

import java.io.FileInputStream;
import java.io.FileNotFoundException; //These imports are required for handling file input/out and exceptions
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamCopyTest {

    public static void main(String[] args) {
//        if (args.length < 2) {
//            //copies one file to another
//            System.out.println ("Usage: ByteStreamCopyTest <original file> <copy>");
//            System.exit(-1);
//        }
                byte[] b = new byte[128]; //Byte Array Initialization. a byte array b of size 128 is created to temporarily store data read from the input
         // Example use of InputStream methods
         try (FileInputStream fis = new FileInputStream ("C:\\YourJavaDirectory\\Input.txt");// A FileInputStream (fis) is created to read data from Input.txt.
              //automatically creates file if doesn't exist
              FileOutputStream fos = new FileOutputStream ("C:\\YourJavaDirectory\\ByteOutput.txt")) { // A FileOutputStream (fos) is created to write data to ByteOutput.txt. If the file does not exist, it will be automatically created.
             System.out.println ("Bytes available: " + fis.available()); // checking availability of bytes
            int count = 0; int read = 0;
            //once the copying has ended while loop ends

            while ((read = fis.read(b)) != -1) {
                 fos.write(b);
                 //counts no. of characters
                count += read;
             }
             System.out.println ("Wrote: " + count); // After the loop ends, the total number of bytes written to the output file is printed.
         } catch (FileNotFoundException f) {
             System.out.println ("File not found: " + f); // FileNotFoundException is caught if the input file does not exist or cannot be opened.
         } catch (IOException e) {
             System.out.println ("IOException: " + e); // IOException is caught for other input/output errors (e.g., issues with file permissions).
         }
     }
 }

       // This example copies one file to another by using a byte array. Note that FileInputStream and FileOutputStream are meant for streams of raw bytes, such as image files.
    