package ch2;

// This Java code defines two classes, Episode and EpisodeTestDrive

class Episode {
  int seriesNumber; // Stores the series number of the episode (e.g., Season 1, Season 2, etc.).
  int episodeNumber; //  Stores the episode number within the series

  void play() {
    System.out.println("Playing episode " + episodeNumber);
  } // Playing episode {episodeNumber}

  void skipIntro() {
    System.out.println("Skipping intro...");
  } // This simulates skipping the intro portion of the episode

  void skipToNext() {
    System.out.println("Loading next episode...");
  } // This simulates skipping to the next episode
}

class EpisodeTestDrive {
  public static void main(String[] args) {
    Episode episode = new Episode(); // An object of the Episode class is created
    episode.seriesNumber = 4; // The seriesNumber attribute is set
    episode.play(); // The play() method is called
    episode.skipIntro(); // The skipIntro() method is called
  }
}

// Key Points:
//Default Values: Since episodeNumber is not explicitly set, it defaults to 0 because int types in Java default to 0.
//
//Incomplete Usage: The skipToNext() method is defined but not used in the main method.
//
//Object-Oriented Programming (OOP): This code demonstrates encapsulation:
//
//The Episode class encapsulates the data (attributes) and behavior (methods) related to an episode.
//
//The EpisodeTestDrive class is used to test the functionality of the Episode class.