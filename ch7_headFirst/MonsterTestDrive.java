package ch7;

public class MonsterTestDrive {
  public static void main(String[] args) {
    Monster[] monsters = new Monster[3]; // Creates an array of Monster objects with three slots
    monsters[0] = new Vampire(); // Assigns a new Vampire object to the first slot in the monsters array
    monsters[1] = new Dragon(); // Assigns a new Dragon object to the second slot in the monsters array
    monsters[2] = new Monster(); // Assigns a new Monster object to the third slot in the monsters array
    for (int i = 0; i < monsters.length; i++) { // Starts a loop to iterate over the monsters array
      // uncomment to do the exercise
//      monsters[i].frighten(i);
    }
  }
}

class Monster { // Defines a base class named Monster. It doesn't have any properties or methods currently.

}

class Vampire extends Monster { // Defines a Vampire class that inherits from Monster. This class doesn't currently override or add any functionality


}

class Dragon extends Monster {  // Defines a Dragon class that inherits from Monster
  boolean frighten(int degree) {
    System.out.println("breathe fire");
    return true;
  }
}

// This code defines a MonsterTestDrive class to test a hierarchy of monster objects: Monster, Vampire, and Dragon. It initializes an array of Monster objects, populates it with instances of these classes, and prepares to call a frighten method (though this is currently commented out).

//boolean frighten(int d) {
//  System.out.println("arrrgh");
//  return true;
//}
//boolean frighten(int x) {
//  System.out.println("a bite?");
//  return false;
//}
//
//boolean frighten(int x) {
//  System.out.println("arrrgh");
//  return true;
//}
//int frighten(int f) {
//  System.out.println("a bite?");
//  return 1;
//}
//
//boolean frighten(int x) {
//  System.out.println("arrrgh");
//  return false;
//}
//boolean scare(int x) {
//  System.out.println("a bite?");
//  return true;
//}
//
//boolean frighten(int z) {
//  System.out.println("arrrgh");
//  return true;
//}
//boolean frighten(byte b) {
//  System.out.println("a bite?");
//  return true;
//}
