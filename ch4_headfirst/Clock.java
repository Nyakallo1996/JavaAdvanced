package ch4;

class Clock {
  String time; // A variable to store the time as a string

  void setTime(String t) {
    time = t;
  } // A method to assign a value to the time variable

  String getTime() {
    return time;
  } // A method to retrieve the current value of the time variable
}

class ClockTestDrive {
  public static void main(String[] args) {
    Clock c = new Clock(); // A new Clock object (c) is created
    c.setTime("1245"); // The setTime method is called to set the time to "1245"
    String tod = c.getTime(); // The getTime method retrieves the time and stores it in the variable tod
    System.out.println("time: " + tod);
  }
}

// The code defines a Clock class with a time field and methods to set and get the time. The ClockTestDrive class tests the Clock class by setting the time to "1245" and printing it