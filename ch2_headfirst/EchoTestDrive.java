package ch2;

// This Java program demonstrates basic object manipulation and a loop structure.

public class EchoTestDrive {
  public static void main(String[] args) {
    Echo e1 = new Echo(); // Two separate Echo objects (e1 and e2) are created, each with its own count variable initialized to 0
    Echo e2 = new Echo();   // correct answer
//       - or -
//    Echo e2 = e1;    // bonus "24” answer
    int x = 0;
    while (x < 4) { // A while loop iterates as long as x < 4
      e1.hello(); // Call hello()
      e1.count = e1.count + 1;
      if (x == 3) {
        e2.count = e2.count + 1;
      }
      if (x > 0) {
        e2.count = e2.count + e1.count;
      }
      x = x + 1;
    }
    System.out.println(e2.count);
  }
}

class Echo {
  int count = 0;

  void hello() {
    System.out.println("helloooo... ");
  }
}


