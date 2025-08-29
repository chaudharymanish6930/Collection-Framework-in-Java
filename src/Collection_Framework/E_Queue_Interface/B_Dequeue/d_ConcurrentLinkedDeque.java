package Collection_Framework.E_Queue_Interface.B_Dequeue;
import java.util.*;
//   important....
import java.util.concurrent.ConcurrentLinkedDeque;
public class d_ConcurrentLinkedDeque {
    public static void main(String[] args) {
        Deque<String> deque = new ConcurrentLinkedDeque<>();

        // Adding elements
        deque.add("One");
        deque.addFirst("Two");
        deque.addLast("Three");
        deque.offer("Four");
        deque.offerFirst("Five");
        deque.offerLast("Six");

        System.out.println("ConcurrentLinkedDeque after additions: " + deque);

        // Access elements
        System.out.println("Peek first: " + deque.peekFirst());
        System.out.println("Peek last: " + deque.peekLast());

        // Removing elements
        System.out.println("Poll first: " + deque.pollFirst());
        System.out.println("Poll last: " + deque.pollLast());

        System.out.println("ConcurrentLinkedDeque after removals: " + deque);

        // Iterating using forEach
        System.out.println("Iterating ConcurrentLinkedDeque:");
        deque.forEach(System.out::println);
    }
}
