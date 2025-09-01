package ch3;

class Hobbits {
  String name; //  This will store the name of each Hobbit

  public static void main(String[] args) {
    Hobbits[] h = new Hobbits[3]; // An array h of size 3 is created to hold references to Hobbits objects
    int z = -1; // An integer z is initialized to -1. This will control the loop
    while (z < 2) { // The loop runs as long as z is less than 2
      z = z + 1; // z is incremented by 1 at the start of each iteration
      h[z] = new Hobbits(); // A new Hobbits object is created and assigned to the zth position in the array
      h[z].name = "bilbo"; // By default, the name of each Hobbits object is set to "bilbo"
      if (z == 1) {
        h[z].name = "frodo"; // If z is 1, the name is changed to "frodo"
      }
      if (z == 2) {
        h[z].name = "sam"; // If z is 2, the name is changed to "sam"
      }
      System.out.print(h[z].name + " is a "); // The name of the current Hobbit is printed along with the message "is a good Hobbit name"
      System.out.println("good Hobbit name");
    }
  }
}

// Key Points
//The loop ensures all three elements in the array are populated and printed.
//
//Each Hobbits object is dynamically created and assigned a name based on the value of z.
//
//The program demonstrates basic array manipulation and object-oriented concepts in Java.