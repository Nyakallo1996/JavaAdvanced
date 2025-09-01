package lesson14;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import static java.nio.file.StandardOpenOption.*;

//This Java program, CopyAllLinesTest, reads all lines from a source text file and writes them to a target file. It allows the option to overwrite the target file if specified. Below is a detailed explanation of its components

public class CopyAllLinesTest {

    private boolean overwrite = false; // overwrite (boolean): Determines whether the program can overwrite an existing target file. Defaults to false.
    private Path source = null; // source (Path): Path to the source file.
    private Path target = null; // target (Path): Path to the target file.

    public static void main(String[] args) {
        CopyAllLinesTest copy = new CopyAllLinesTest();
        copy.checkArguments(args);
        try {
            copy.copyFile();
        } catch (IOException i) {
            System.out.println("Exception thrown: " + i);
        }
        System.out.println ("Successfully copied!");
    }

    private void copyFile() throws IOException {
        List<String> fileLines = null;
        Charset cs = Charset.defaultCharset();
        // Read the entire file into the List
        fileLines = Files.readAllLines(source, cs);
        // Write the lines back out
        Files.write(target, fileLines, cs, CREATE, TRUNCATE_EXISTING, WRITE);
    }

    private void checkArguments(String args[]) {
        // Check for a minimum of two arguments
        if (args.length < 2) {
            System.out.println ("Not enough arguments.");
            usage();
        }
        // If there are three arguments, check for the option to overwrite
        if (args.length == 3) {
            if (!args[0].equals("-o")) {
                System.out.println ("Check for the proper options.");
                usage();
            } else {
                overwrite = true;
                source = Paths.get(args[1]);
                target = Paths.get(args[2]);
            }
            // Else there are two - assume they are source and target file
        } else {
            source = Paths.get(args[0]);
            target = Paths.get(args[1]);
        }
        // check that the source is a file
        if (Files.isDirectory(source)) {
            System.out.println(source + " must be a file!");
            usage();
        }
        // check that the target does not exist, or we can overwrite it
        if (Files.exists(target) && !overwrite) {
            System.out.println("Target file " + target.getFileName() + " exists. Use the -o option to overwrite.");
            usage();
        }
    }

    private void usage() {
        System.out.println("Usage: CopyAllLinesTest {-o} <source file> <target file>");
        System.exit(-1);
    }
}