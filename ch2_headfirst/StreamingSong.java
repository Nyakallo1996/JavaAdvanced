package ch2;

// The code consists of two classes: StreamingSong and StreamingSongTestDrive. Here's a breakdown of what each part does

class StreamingSong {
  String title; // Stores the title of the song
  String artist; // Stores the artist's name
  int duration; // Stores the duration of the song (in seconds)

  void play() {
    System.out.println("Playing song");
  } // Outputs a message to indicate that the song is being played

  void printDetails() { // Outputs the song's title and artist in a formatted message
    System.out.println("This is " + title +
                       " by " + artist);
  }
}

class StreamingSongTestDrive {
  public static void main(String[] args) {
    StreamingSong song = new StreamingSong();
    song.artist = "The Beatles";
    song.title = "Come Together";
    song.play();
    song.printDetails();
  }
}

// Key Concepts Demonstrated
//Object-Oriented Programming
//
//Attributes (title, artist, duration) represent the state of a StreamingSong object.
//
//Methods (play, printDetails) represent the behavior of a StreamingSong object.
//
//Encapsulation
//
//Attributes and methods are grouped within the StreamingSong class.
//
//Method Invocation
//
//The play and printDetails methods are called on the song object.
//
//Setting Attributes Directly
//
//Attributes are directly set for simplicity in this example, but good practice would involve using getters and setters.