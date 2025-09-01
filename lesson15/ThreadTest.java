package lesson15;

public class ThreadTest {

    public static void main(String[] args) {
        Thread thread1 = new Thread(new ExampleRunnable("one"));
        ExampleThread thread2 = new ExampleThread("two");
        
        // Start Threads
        thread1.start();
        thread2.start();
    }

    //static classes, variables and methods
    //stored in memory, are global and can't be deleted
    //don't have to be instantiated
    //can't lock static fields so don't use in threads
}
