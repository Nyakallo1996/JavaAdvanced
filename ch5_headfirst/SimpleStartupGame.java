package ch5;

public class SimpleStartupGame {
  public static void main(String[] args) {
    int numOfGuesses = 0; // Declares and initializes a variable numOfGuesses to track the number of guesses the player makes
    GameHelper helper = new GameHelper(); // Creates an instance of the GameHelper class to assist with user input

    SimpleStartup theStartup = new SimpleStartup(); // Creates an instance of the SimpleStartup class, which represents the game logic
    int randomNum = (int) (Math.random() * 5); // Generates a random number between 0 and 4 (inclusive) as the starting location of the "Startup" object

    int[] locations = {randomNum, randomNum + 1, randomNum + 2}; // Creates an array locations representing the positions of the "Startup" on a linear grid (e.g., [randomNum, randomNum+1, randomNum+2])
    theStartup.setLocationCells(locations); // Passes the locations array to the SimpleStartup object to set its location cells
    boolean isAlive = true; // Initializes a boolean variable isAlive to indicate whether the game is still active

    while (isAlive) { // Starts a loop that continues as long as isAlive is true
      int guess = helper.getUserInput("enter a number"); // Uses the GameHelper instance to get the user's guess as input
      String result = theStartup.checkYourself(guess); // Checks the user's guess against the "Startup's" location cells and stores the result (e.g., "hit," "miss," or "kill")
      numOfGuesses++; // Increments the numOfGuesses counter by 1
      if (result.equals("kill")) {
        isAlive = false;
        System.out.println("You took " + numOfGuesses + " guesses");
      } // close if
    } // close while
  } // close main

}

// This program is a simple guessing game. A "Startup" occupies three consecutive positions on a linear grid, determined randomly. The user guesses the positions until they "kill" the Startup by correctly guessing all its locations. The game counts and displays the number of guesses taken
