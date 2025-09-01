package ch1;

// This code is a simple Java program that implements a variation of the song "10 Green Bottles," where it counts down the bottles in a loop and prints lyrics accordingly. Here's a breakdown of how the code works

public class BottleSong {
  public static void main(String[] args) {
    int bottlesNum = 10; // bottlesNum is initialized to 10. This variable represents the current number of bottles on the wall
    String word = "bottles"; // word is initialized to "bottles". This helps handle the plural form of "bottle."

    while (bottlesNum > 0) { // The while loop runs as long as there is at least 1 bottle left

      if (bottlesNum == 1) {
        word = "bottle"; // singular, as in ONE bottle.
      }

      System.out.println(bottlesNum + " green " + word + ", hanging on the wall"); // These System.out.println statements print the lyrics, including the current number of bottles and whether it's singular or plural.
      System.out.println(bottlesNum + " green " + word + ", hanging on the wall");
      System.out.println("And if one green bottle should accidentally fall,");
      bottlesNum = bottlesNum - 1; // Decreases the number of bottles by 1 to simulate one falling.

      if (bottlesNum > 0) {
        System.out.println("There'll be " + bottlesNum +
                           " green " + word + ", hanging on the wall");
      } else {
        System.out.println("There'll be no green bottles, hanging on the wall");
      } // end else
    } // end while loop
  } // end main method
} // end class