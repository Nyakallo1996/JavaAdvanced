package ch6;

import java.util.ArrayList;

public class SharpenYourPencil {
  void arrayListCode() {
    ArrayList<String> myList = new ArrayList<String>();// Creates an ArrayList to store String objects dynamically

    String a = "whoohoo"; // Declares a String variable a and initializes it with "whoohoo"
    myList.add(a); // Adds the string "whoohoo" to the ArrayList

    String b = "Frog"; // Declares a String variable b and initializes it with "Frog"
    myList.add(b); // Adds the string "Frog" to the ArrayList

    int theSize = myList.size(); // Gets the number of elements in the ArrayList and assigns it to theSize

    String str = myList.get(1); // Retrieves the second element (at index 1) from the ArrayList, which is "Frog", and assigns it to str

    myList.remove(1); // Removes the element at index 1 (i.e., "Frog") from the ArrayList

    boolean isIn = myList.contains(b); // Checks if "Frog" is still in the ArrayList and assigns the result (false) to isIn
  }

  void arrayCode() {
    String [] myList = new String[2]; // Declares a String array with a fixed size of 2

    String a = "whoohoo"; // Declares a String variable a and initializes it with "whoohoo"
    myList[0] = a; // Assigns the string "whoohoo" to the first position (index 0) of the array

    String b = "Frog"; // Declares a String variable b and initializes it with "Frog"
    myList[1] = b; // Assigns the string "Frog" to the second position (index 1) of the array

    int theSize = myList.length; // Gets the size (number of elements) of the array (always 2 for this array) and assigns it to theSize

    String str = myList[1]; // Retrieves the second element (index 1) from the array, which is "Frog", and assigns it to str

    myList[1] = null; // Removes "Frog" from the array by setting the second position (index 1) to null

    boolean isIn = false; // Initializes a boolean variable isIn to false
    for (String item : myList) {
      if (b.equals(item)) {
        isIn = true;
        break;
      }
    }
  }
}

//The SharpenYourPencil class demonstrates the difference between using an ArrayList and a regular array in Java:
//
//ArrayList: A flexible and dynamic collection that allows operations like resizing, element removal, and built-in utility methods.
//
//Array: A fixed-size structure that requires manual handling for element removal and searches.