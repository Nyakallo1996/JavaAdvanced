package ch6;

import java.util.ArrayList; // Imports the ArrayList class from Java's util package, allowing the program to use dynamic array-like structures

public class ArrayListMagnet {
  public static void main(String[] args) {
    ArrayList<String> a = new ArrayList<String>(); // Creates an ArrayList named a that can hold String objects
    a.add(0, "zero"); // Adds the string "zero" at index 0
    a.add(1, "one"); // Adds the string "one" at index 1
    a.add(2, "two"); // Adds the string "two" at index 2
    a.add(3, "three"); // Adds the string "three" at index 3
    printList(a); // Calls the printList method to print the current elements in the ArrayList

    if (a.contains("three")) { // Checks if the list contains the string "three"
      a.add("four"); // Adds the string "four" to the end of the list if the condition is true
    }
    a.remove(2); // Removes the element at index 2, which is "two" after the previous addition
    printList(a); // Prints the updated list

    if (a.indexOf("four") != 4) { // Checks if the index of "four" is not 4
      a.add(4, "4.2"); // Adds the string "4.2" at index 4 if the condition is true
    }
    printList(a); // Prints the updated list

    if (a.contains("two")) { // Checks if the list contains the string "two"
      a.add("2.2"); // Adds the string "2.2" to the end of the list if the condition is true
    }
    printList(a); // Prints the final state of the list
  }

  public static void printList(ArrayList<String> list) { // Defines a helper method to print the elements of an ArrayList
    for (String element : list) { // Loops through each element in the ArrayList
      System.out.print(element + "  "); // Prints each element followed by two spaces
    }
    System.out.println(); // Moves to the next line after printing all elements
  }
}


// The program demonstrates basic operations on a Java ArrayList, including adding, removing, and checking elements, as well as dynamically updating the list based on conditions. The printList method is used to display the state of the list after each operation.