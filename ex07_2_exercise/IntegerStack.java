package ex07_2_exercise;

import java.util.ArrayDeque;
import java.util.Deque;

public class IntegerStack {

    private Deque<Integer> data = new ArrayDeque<Integer>(); // Declares a double-ended queue (Deque) using an ArrayDeque to store stack elements.
public void push(Integer e) {
    data.addFirst(e);
} // Adds the element e to the top of the stack.
public Integer pop() { // Removes and returns the top element of the stack.
    if(data.isEmpty()) {
        System.out.println("Stack is empty");
    }
    return data.removeFirst();
}
    public Integer peek() {
        return data.peekFirst();
    } // Returns the top element without removing it. Returns null if the stack is empty.

    @Override
    public String toString() {
        return data.toString();
    } // Returns a string representation of the stack for printing.

    public static void main(String[] args) { // Creates a new stack.
        IntegerStack stack = new IntegerStack();
        for(int i = 0; i < 5; i++) { // Pushes 0, 1, 2, 3, 4 onto the stack (so 4 will be on top).
            stack.push(i);
        }
        System.out.println("After pushing 5 elements: " + stack); // Prints: [4, 3, 2, 1, 0] (top of stack is first)

        int e = stack.pop(); // Removes and prints the top element (4), then shows stack as [3, 2, 1, 0]
        System.out.println("Popped element: " + e);
        System.out.println("After popping 1 element: " + stack);

        int top = stack.peek(); // Peeks at the top (3), doesn't remove it. Stack remains [3, 2, 1, 0].
        System.out.println("Peeked element: " + top);
        System.out.println("After peeking 1 element: " + stack);
    }
}

// This code defines a simple custom stack of integers using ArrayDeque.
//It includes basic stack operations:
//
//push() – adds an element to the top
//
//pop() – removes and returns the top element
//
//peek() – views the top element without removing it
//
//The main() method shows how the stack behaves with typical operations.