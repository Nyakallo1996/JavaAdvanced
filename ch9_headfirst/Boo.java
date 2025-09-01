package ch9;

public class Boo {
  public Boo(int i) { } // This is a constructor of the Boo class that takes an integer (int i) as a parameter. It doesn't contain any specific implementation here
  public Boo(String s) { } // This is another constructor for the Boo class, taking a String parameter
  public Boo(String s, int i) { } // This constructor accepts both a String and an int as parameters
}


class SonOfBoo extends Boo { // This declares a class SonOfBoo that extends the Boo class, inheriting its properties and methods
  public SonOfBoo() {
    super("boo");
  } //

  public SonOfBoo(int i) {
    super("Fred");
  } // Calls the Boo constructor that accepts a String argument

  public SonOfBoo(String s) {
    super(42);
  } // Takes an integer parameter. Calls the Boo constructor that accepts a String argument

//  public SonOfBoo(int i, String s) {
//  }

//  public SonOfBoo(String a, String b, String c) {
//    super(a, b);
//  }

  public SonOfBoo(int i, int j) {
    super("man", j);
  }

//  public SonOfBoo(int i, int x, int y) {
//    super(i, "star");
//  }
}

// The Boo class has three constructors that accept different combinations of parameters: an int, a String, and both.
//
//The SonOfBoo class extends Boo and provides three constructors, each of which calls a specific Boo constructor using the super keyword.
//
//The super keyword allows the SonOfBoo constructors to initialize the Boo part of the object with specific values. This showcases constructor chaining in inheritance.