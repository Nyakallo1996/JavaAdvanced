package ch4;

class XCopy {

  public static void main(String[] args) {
    int orig = 42; // A variable orig is initialized with the value 42
    XCopy x = new XCopy(); // An object x of class XCopy is created using the new keyword
    int y = x.go(orig); // The go method of the XCopy class is called with orig as an argument. The result is assigned to the variable y
    System.out.println(orig + " " + y);
  }

  int go(int arg) { // Defines a method that takes an integer parameter arg
    arg = arg * 2; // Multiplies the input argument arg by 2
    return arg; // Returns the updated value of arg to the caller
  }
}

// Pass-by-Value:
//
//Java is pass-by-value, even for objects. For primitive types like int, a copy of the value is passed to the method.
//
//The original variable orig remains unchanged because the method modifies only the local copy arg.
//
//Output:
//
//The method go calculates 42 * 2 = 84 and returns 84.
//
//The main method prints orig (still 42) and y (which is 84).