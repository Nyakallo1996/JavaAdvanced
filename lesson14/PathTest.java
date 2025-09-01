package lesson14;

import java.nio.file.Path;
import java.nio.file.Paths;

//This Java code demonstrates the use of the Path and Paths classes from the java.nio.file package, which are part of Java's New I/O (NIO) library. These classes provide functionality to work with file and directory paths in a platform-independent manner. Here's a breakdown of the code

public class PathTest {

 public static void main(String[] args) {
     Path p1 = Paths.get("C:\\YourJavaDirectory\\portfolio.ser");// Creates a Path object (p1) using a given file path (C:\\YourJavaDirectory\\portfolio.ser).
                                                                      // This path represents a file named portfolio.ser inside the directory YourJavaDirectory.
     System.out.format("getFileName: %s%n", p1.getFileName());
     System.out.format("getParent: %s%n", p1.getParent());
     System.out.format("getNameCount: %d%n", p1.getNameCount());
     System.out.format("getRoot: %s%n", p1.getRoot());
     System.out.format("isAbsolute: %b%n", p1.isAbsolute());
     System.out.format("toAbsolutePath: %s%n", p1.toAbsolutePath());
     System.out.format("toURI: %s%n", p1.toUri());
 }
}