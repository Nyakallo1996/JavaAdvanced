package ch3;

class TestArrays {
  public static void main(String[] args) {
    int[] index = new int[4]; // index array is created, which can hold up to 4 objects
    index[0] = 1;
    index[1] = 3;
    index[2] = 0;
    index[3] = 2;
    String[] islands = new String[4]; // array created which can also hold up to 4 objects
    islands[0] = "Bermuda";
    islands[1] = "Fiji";
    islands[2] = "Azores";
    islands[3] = "Cozumel";
    int y = 0;
    int ref;
    while (y < 4) {
      ref = index[y];
      System.out.print("island = ");
      System.out.println(islands[ref]);
      y = y + 1;
    }
  }
}

// the code creates two arrays then asigns the objects of the second array to the first array