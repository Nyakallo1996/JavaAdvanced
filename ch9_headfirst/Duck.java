package ch9;

public class Duck {
  int size; // int variable

  public Duck() { // Duck class
  }

  public Duck(int duckSize) {
    System.out.println("Quack");

    size = duckSize;

    System.out.println("size is " + size);
  }
}

// terrible way to provide a default value:
//public Duck(int newSize) {
//  if (newSize == 0) {
//    size = 27;
//  } else {
//    size = newSize;
//  }
//}
