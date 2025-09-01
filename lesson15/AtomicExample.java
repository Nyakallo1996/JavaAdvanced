package lesson15;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicExample {

    public static void main(String[] args) {
        AtomicInteger ai = new AtomicInteger(5);
        //increments 5 once (6)
        System.out.println("New value: " 
          + ai.incrementAndGet());
        //increments 5 once (6)
        System.out.println("New value: " 
          + ai.getAndIncrement());
        //increments 5++ once more (7)
        System.out.println("New value: " 
          + ai.getAndIncrement());

    }
}
