package ch3;

// This Java code is a simple example demonstrating the use of arrays of objects

class Books {
  String title; // A String to store the title of a book
  String author; //  A String to store the name of the author of the book
}

class BooksTestDrive {
  public static void main(String[] args) {
    Books[] myBooks = new Books[3]; // An array named myBooks is declared to hold references to Books objects
    int x = 0;
    myBooks[0] = new Books(); // Now, each element of myBooks refers to a Books object
    myBooks[1] = new Books();
    myBooks[2] = new Books();
    myBooks[0].title = "The Grapes of Java"; // The title and author fields of each Books object in the array are set using dot notation
    myBooks[1].title = "The Java Gatsby";
    myBooks[2].title = "The Java Cookbook";
    myBooks[0].author = "bob";
    myBooks[1].author = "sue";
    myBooks[2].author = "ian";

    while (x < 3) { // A while loop iterates over the array (myBooks)
      System.out.print(myBooks[x].title);
      System.out.print(" by ");
      System.out.println(myBooks[x].author);
      x = x + 1;
    }
  }
}

// Key Concepts
//Array of Objects:
//
//myBooks is an array of Books objects, demonstrating how to use arrays to manage multiple objects.
//
//Object Creation:
//
//new Books() creates new Books objects, and these are stored in the array.
//
//Accessing Object Fields:
//
//The fields (title, author) of each object are accessed and modified using dot notation.
//
//Iteration:
//
//A while loop iterates over the array to process each book.
//
//This program showcases basic object-oriented programming principles, such as encapsulating data in objects and managing multiple objects using arrays