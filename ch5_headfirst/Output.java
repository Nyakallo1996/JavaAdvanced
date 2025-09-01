package ch5;

class Output {
  public static void main(String[] args) {
    Output output = new Output(); // Creates an instance of the Output class
    output.go(); // Calls the go method on the Output instance
  }

  void go() { // Defines the go method, which contains the program logic
    int value = 7; // Initializes an integer variable value with 7
    for (int i = 1; i < 8; i++) { // Starts a for loop that runs with i ranging from 1 to 7 (inclusive)
      value++; // Increments value by 1 at the start of each iteration
      if (i > 4) { // Checks if i is greater than 4
        System.out.print(++value + " "); // If i > 4, increments value by 1 (prefix increment) and prints it, followed by a space
      }
      if (value > 14) { // Checks if value is greater than 14
        System.out.println(" i = " + i); // If value > 14, prints the current value of i
        break; // Exits the loop when value > 14
      }
    }
  }
}

// The program creates an instance of the Output class and executes its go method. The go method runs a loop from i = 1 to i = 7. Inside the loop:
//
//value is incremented each time.
//
//For i > 4, it prints an incremented value.
//
//If value exceeds 14, it prints the current i value and exits the loop.