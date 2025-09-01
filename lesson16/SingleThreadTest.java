package lesson16;

import java.util.concurrent.ThreadLocalRandom;

public class SingleThreadTest {
    public static void main(String[] args) {
        int[] data = new int[1024*1024*128]; //512MB big
        // This line initializes an array named data with a size of
        //128
        //×
        //1024
        //×
        //1024
        //128×1024×1024 elements.
        //Each integer occupies 4 bytes in Java, so the array consumes approximately
        //128
        //×
        //4
        // 
        //MB
        //=
        //512
        // 
        //MB
        //128×4MB=512MB of memory.

        //populates array with values
        for(int i=0; i < data.length; i++) {
            data[i] = ThreadLocalRandom.current().nextInt(); // The ThreadLocalRandom.current().nextInt() method generates a random integer and assigns it to the current index of the data array.


        }

        //min value = -2147483648
        int max = Integer.MIN_VALUE;
        // The variable max is initialized to Integer.MIN_VALUE, the smallest possible integer value (
        //−
        //2
        //31
        //−2
        //31
        //  or
        //−
        //2147483648
        //−2147483648).

        for(int value : data) { // A for-each loop iterates through all elements in the data array
            if(value > max) {
                max = value;
                //System.out.println(max + " ");
            }
        }
        System.out.println("Max value found: " + max);
    }
}
