package ch5;

// This code demonstrates a simple implementation of a game where the player tries to "hit" all the cells of a "startup" by guessing their locations

public class SimpleStartupTestDrive {
  public static void main(String[] args) {
    SimpleStartup dot = new SimpleStartup(); // Creates an instance of the SimpleStartup class and assigns it to the variable dot. This instance represents the "startup" object in the game

    int[] locations = {2, 3, 4}; // Sets the startup's location cells to {2, 3, 4}
    dot.setLocationCells(locations); // Calls the setLocationCells method of the dot object, passing the locations array. This sets the startup’s location cells to the values in the array

    int userGuess = 2; // Declares a variable userGuess and assigns it the value 2. This represents a player's guess
    String result = dot.checkYourself(userGuess);// Calls the checkYourself method of the dot object, passing the player's guess (2)
    String testResult = "failed"; // Initializes the testResult variable with the value "failed". This is used to store the outcome of the test
    if (result.equals("hit")) { // Checks if the result from checkYourself is "hit". If true, updates testResult to "passed"
      testResult = "passed";
    }
    System.out.println(testResult);// Prints the value of testResult to the console. It will display either "passed" or "failed" based on the test outcome
  }
}

class SimpleStartup { // Defines the SimpleStartup class, which contains the game logic
  private int[] locationCells; // locationCells: An array that stores the positions of the startup
  private int numOfHits = 0; // numOfHits: Tracks the number of successful hits made by the player, initialized to 0

  public void setLocationCells(int[] locs) {
    locationCells = locs;
  }

  public String checkYourself(int guess) { // Assigns locs to the locationCells instance variable, setting the startup's location
    String result = "miss";
    for (int cell : locationCells) { // Starts a for-each loop to iterate over each value (cell) in the locationCells array
      if (guess == cell) { // Compares the player's guess to the current cell
        result = "hit";
        numOfHits++;
        break;
      } // end if
    } // end for
    if (numOfHits == locationCells.length) {
      result = "kill";
    } // end if
    System.out.println(result);
    return result;
  } // end method
} // close class

// This code implements a simplified guessing game where the player guesses the location of a "startup." The SimpleStartup class tracks the startup's location and checks if a player's guess is a "hit," "miss," or "kill." The SimpleStartupTestDrive class serves as a test driver to validate the functionality with a predefined scenario