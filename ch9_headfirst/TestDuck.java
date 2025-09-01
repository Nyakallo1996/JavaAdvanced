package ch9;

public class TestDuck {

  public static void main(String[] args) {
    int weight = 8; // Initializes various variables with different data types to represent the properties of a duck
    float density = 2.3F;
    String name = "Donald";
    long[] feathers = {1, 2, 3, 4, 5, 6};
    boolean canFly = true;
    int airspeed = 22;

    Duck[] d = new Duck[7]; // Creates an array of 7 Duck objects

    d[0] = new Duck(); // Creates a Duck object using the default constructor and assigns it to the first index of the array

    d[1] = new Duck(density, weight); // Creates a Duck object using the constructor that accepts a float (density) and an int (weight)

    d[2] = new Duck(name, feathers); // Creates a Duck object using the constructor that accepts a string (name) and a long array (feathers)

    d[3] = new Duck(canFly); // Creates a Duck object using the constructor that accepts a boolean (canFly)

    d[4] = new Duck(3.3F, airspeed); // Creates a Duck object using the constructor that accepts a float (density) and an int (max speed)

    d[5] = new Duck(false); // Creates a Duck object using the constructor that accepts a boolean (canFly)

    d[6] = new Duck(airspeed, density); // Attempts to create a Duck object using a constructor that takes an int (airspeed) and a float (density). (Compilation error: There is no such constructor defined in the Duck class)
  }

  static class Duck { // Defines a nested static class Duck
    private int kilos = 6; // Declares and initializes private attributes to store duck properties
    private float floatability = 2.1F;
    private String name = "Generic";
    private long[] feathers = {1, 2, 3,
            4, 5, 6, 7};
    private boolean canFly = true;
    private int maxSpeed = 25;

    public Duck() {
      System.out.println("type 1 duck");
    } // Default constructor, prints "type 1 duck"

    public Duck(boolean fly) { // Constructor that sets canFly and prints "type 2 duck"
      canFly = fly;
      System.out.println("type 2 duck");
    }

    public Duck(String n, long[] f) { // Constructor that sets name and feathers and prints "type 3 duck"
      name = n;
      feathers = f;
      System.out.println("type 3 duck");
    }

    public Duck(int w, float f) { // Constructor that sets kilos and floatability and prints "type 4 duck"
      kilos = w;
      floatability = f;
      System.out.println("type 4 duck");
    }

    public Duck(float density, int max) { // Constructor that sets floatability and maxSpeed and prints "type 5 duck"
      floatability = density;
      maxSpeed = max;
      System.out.println("type 5 duck");
    }
  }
}

// This program demonstrates constructor overloading in Java. The Duck class has five constructors, each initializing the object differently depending on the input parameters. The TestDuck class initializes an array of Duck objects using various constructors to showcase the flexibility of the Duck class. A compilation error occurs when trying to use a constructor that does not exist.
