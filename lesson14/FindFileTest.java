package lesson14;


import java.io.IOException;
import java.nio.file.*;

// This Java program demonstrates a way to search for a specific file in a directory (and its subdirectories). Here's a breakdown of the code and its components

public class FindFileTest {

    public static void main(String[] args) {
//        if (args.length < 2) {
//            System.out.println("Usage: FindFileExample <start path> <search string>");
//            System.exit(-1);
//        }
        Path root = Paths.get("C:\\YourDirectory"); // This initializes the starting directory (root) as "C:\\YourJavaDirectory".
        if (!Files.isDirectory(root)) { // Checks if the specified path (root) is a valid directory.
            System.out.println("Is a directory!");
            System.exit(-1);
        }

        PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob:" + "Input.txt"); // This creates a PathMatcher to match files with the name "Input.txt".
        Finder finder = new Finder(root, matcher); // This presumably initializes a Finder object to manage the file search.
        try {
            Files.walkFileTree(root, finder); // It uses the Finder object to process each file/directory encountered during the traversal.
        } catch (IOException e) {
            System.out.println("Exception: " + e);
        }
        finder.done();
    }
}