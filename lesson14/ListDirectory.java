package lesson14;

import java.io.IOException;
import java.nio.file.*;
import java.util.regex.PatternSyntaxException;

// This Java program is used to list the contents of a directory (files and subdirectories) that match a specific filter pattern. The filter can be a wildcard (e.g., * for all files) or any other pattern supported by the DirectoryStream class.

public class ListDirectory {

    public static void main(String[] args) {
//        if (args.length < 1) {
//            System.err.println("Usage: java ListDirectory <directory name> {<filter>}");
//            System.exit(-1);
//        }

        Path dir = Paths.get("C:\\YourJavaDirectory"); // Paths.get("C:\\YourJavaDirectory") converts the given directory string into a Path object.
        String filter = "*"; // By default, the filter is set to "*", which matches all files.
        if (args.length == 2) {
            filter = args[1]; // If the program is run with two command-line arguments, the second argument (args[1]) is used as the filter.
        }
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir, filter)) { // Files.newDirectoryStream(dir, filter) creates a DirectoryStream that iterates over the contents of the directory, filtering them based on the specified pattern.
            for (Path file : stream) { // This loop iterates over the DirectoryStream, printing each file's name (file.getFileName()).
                System.out.println(file.getFileName());
            }
        } catch (PatternSyntaxException | DirectoryIteratorException | IOException x) {
            //IOException can never be thrown by the iteration.
            //In this snippet, it can only be thrown by newDirectoryStream.
            System.err.println(x);
        }
    }
}