package lesson7;

import java.util.ArrayDeque;
import java.util.Deque;

public class TestStack {
    public static void main(String[] args) {
        Deque<String> stack = new ArrayDeque<>();
        //last in first out (LIFO)
        stack.push("one");
        stack.push("two");
        stack.push("three");

        System.out.println(stack);

        int size = stack.size() - 1;
        while(size >= 0) {
            //removes elements
            System.out.println(stack.pop());
            size--;
        }
    }
}
