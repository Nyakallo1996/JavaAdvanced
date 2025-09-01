package ch7;

class A {
  int ivar = 7; // Declares an integer instance variable ivar in class A and initializes it with the value 7

  void m1() {
    System.out.print("A's m1, ");
  } // m1, m2, and m3 are methods in class A that print specific strings indicating which method is being called

  void m2() {
    System.out.print("A's m2, ");
  }

  void m3() {
    System.out.print("A's m3, ");
  }
}

class B extends A { // Class B is a subclass of A, inheriting all its members and methods
  void m1() {
    System.out.print("B's m1, ");
  }
}

class C extends B { // Class C is a subclass of B, inheriting all its members and methods
  void m3() {
    System.out.print("C's m3, " + (ivar + 6));
  }
}

public class Mixed2 {
  public static void main(String[] args) {
    A a = new A();
    B b = new B();
    C c = new C();
    A a2 = new C();


  }
}

//This code demonstrates inheritance and polymorphism in Java:
//
//B inherits from A, and C inherits from B.
//
//Methods can be overridden in subclasses to provide specific functionality.
//
//Polymorphism allows a superclass reference (A) to point to a subclass object (C), but method calls will be resolved based on the actual object's type at runtime.
//
//Although the main method creates instances, no method calls are present, so the program will not produce output unless method calls are added.

//b.m1();
//c.m2();
//a.m3();
//
//c.m1();
//c.m2();
//c.m3();
//
//a.m1();
//b.m2();
//c.m3();
//
//a2.m1();
//a2.m2();
//a2.m3();
//
