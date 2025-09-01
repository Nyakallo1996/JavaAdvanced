package lesson16;

// This Java program retrieves and prints the number of processors (or CPU cores) available to the Java Virtual Machine (JVM) on the system where it is running. Here's an explanation of each part of the code

public class ProcessorCountMain {

    public static void main(String[] args) {
        //counting the number of processors
        int count = Runtime.getRuntime().availableProcessors(); // This retrieves the current runtime instance of the JVM, which provides methods for interacting with the runtime environment
        System.out.println("Processor Count:" + count);
    }
}