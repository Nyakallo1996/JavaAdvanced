package ch7;

public class TestBoats {
  public static void main(String[] args) {
    Boat b1 = new Boat(); // Creates an object b1 of the Boat class. new Boat() instantiates the Boat class, calling its constructor
    Sailboat b2 = new Sailboat(); // Creates an object b2 of the Sailboat class. This assumes that Sailboat is a subclass of Boat
    Rowboat b3 = new Rowboat(); // Creates an object b3 of the Rowboat class. This assumes that Rowboat is also a subclass of Boat
    b2.setLength(32); // Calls the setLength method on the b2 object, setting its length to 32. This method must be defined in the Sailboat class or inherited from Boat
    b1.move(); // Calls the move method on the b1 object. The behavior depends on the implementation of the move method in the Boat class.
    b3.move();
    b2.move();
  }
}
