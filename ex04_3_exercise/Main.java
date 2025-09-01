package ex04_3_exercise;

public class Main {
  public static void main(String[] args) {
    PeerSingleton peer01 = PeerSingleton.getInstance();// Calls a static method getInstance() from the PeerSingleton class.
                                                       // Stores the returned object in the variable peer01.
                                                       // This implies PeerSingleton is a singleton class, so getInstance() always returns the same instance.
    PeerSingleton peer02 = PeerSingleton.getInstance();

    for(String hostName: peer01.getHostNames()) { // Begins a for-each loop over the list (or array) returned by peer01.getHostNames().
                                                  // This suggests getHostNames() returns a collection of strings, likely host names (e.g., computer or server names).
      System.out.println("Host Name: " + hostName);
    }

    System.out.println();

    for(String hostName: peer02.getHostNames()) {
      System.out.println("Host Name: " + hostName);
    }
  }  
}

// This program demonstrates the singleton pattern using a class called PeerSingleton. It obtains the same instance of the singleton twice (peer01 and peer02) and then prints out a list of host names from that shared instance. Since both references point to the same object, the output of both loops will be identical.
//
//Let me know if you'd like to see the PeerSingleton class implementation next.