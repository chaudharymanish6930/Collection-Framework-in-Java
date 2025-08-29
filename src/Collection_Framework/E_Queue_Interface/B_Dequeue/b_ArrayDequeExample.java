package Collection_Framework.E_Queue_Interface.B_Dequeue;

import java.util.*;

public class b_ArrayDequeExample {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();

        // Adding elements
        deque.add("A");
        deque.addFirst("B");
        deque.addLast("C");
        deque.offer("D");
        deque.offerFirst("E");
        deque.offerLast("F");

        System.out.println("ArrayDeque after additions: " + deque);

        // Access elements
        System.out.println("Peek first: " + deque.peekFirst());
        System.out.println("Peek last: " + deque.peekLast());

        // Removing elements
        System.out.println("Remove first: " + deque.removeFirst());
        System.out.println("Remove last: " + deque.removeLast());
        System.out.println("Poll first: " + deque.pollFirst());
        System.out.println("Poll last: " + deque.pollLast());

        System.out.println("ArrayDeque after removals: " + deque);

        // Iterating
        System.out.println("Iterating ArrayDeque:");
        for (String s : deque) {
            System.out.println(s);
        }
    }
}
