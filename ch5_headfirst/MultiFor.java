package ch5;

class MultiFor {

  public static void main(String[] args) {
    for (int i = 0; i < 4; i++) { // the for loop increments i starting from 0

      for (int j = 4; j > 2; j--) { // the for loop decrements j starting from 4
        System.out.println(i + " " + j);
      }

      if (i == 1) { // will run i and j at the same time
        i++;
      }
    }
  }
}
