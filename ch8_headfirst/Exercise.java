package ch8;

public class Exercise {

  public interface Foo { } // Declares an interface Foo. Interfaces are abstract by nature and do not provide implementation.
  public class Bar implements Foo { } // Defines a class Bar that implements the Foo interface. This means Bar must provide implementations for methods defined in Foo (if any).

  public interface Vinn { } // Declares another interface Vinn.
  public abstract class Vout implements Vinn { } // Defines an abstract class Vout that implements the Vinn interface. Being abstract, Vout doesn't have to implement Vinn methods directly.


  public abstract class Muffie implements Whuffie { } // Declares an abstract class Muffie that implements the Whuffie interface. Since it’s abstract, it doesn’t need to provide Whuffie's implementations yet.
  public class Fluffie extends Muffie { } // Declares a concrete class Fluffie that extends Muffie. This means Fluffie inherits from Muffie and is responsible for implementing Whuffie's methods.
  public interface Whuffie { } // Declares the Whuffie interface. It might contain method signatures to be implemented by its subclasses.


  public class Zoop { } // A basic class Zoop with no parent class (implicitly extends Object).
  public class Boop extends Zoop { } // Boop is a subclass of Zoop, inheriting all its properties and methods
  public class Goop extends Boop { } // Goop extends Boop, forming a three-level inheritance hierarchy: Zoop -> Boop -> Goop.


  public class Gamma extends Delta implements Epsilon { } // Gamma is a concrete class extending Delta (another class) and implementing the Epsilon interface.
  public interface Epsilon { } // Declares the Epsilon interface
  public interface Beta { } // Declares the Beta interface.
  public class Alpha extends Gamma implements Beta { } // Alpha is a subclass of Gamma and implements the Beta interface. It combines behaviors from both its superclass and the interface.
  public class Delta { }  // A base class for Gamma. It doesn’t implement or extend anything
}

// Structure: The Exercise class defines a variety of interfaces, abstract classes, and concrete classes. These demonstrate inheritance, interface implementation, and class hierarchies in Java.
//
//Hierarchy:
//
//Single inheritance: Classes like Bar and Goop.
//
//Multi-level inheritance: Hierarchies such as Zoop -> Boop -> Goop and Delta -> Gamma -> Alpha.
//
//Interface implementation: Foo, Vinn, Whuffie, Epsilon, and Beta.
//
//Abstract classes: Muffie and Vout are abstract and cannot be instantiated directly.
//
//The design showcases fundamental concepts of Java’s object-oriented programming, including interfaces, abstract classes, and inheritance.