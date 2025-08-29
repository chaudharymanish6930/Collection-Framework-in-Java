package Collection_Framework.E_Queue_Interface.B_Dequeue;
import java.util.*;
public class c_LinkedListDequeExample {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();

        // Adding elements
        deque.add(10);
        deque.addFirst(20);
        deque.addLast(30);
        deque.offer(40);
        deque.offerFirst(50);
        deque.offerLast(60);

        System.out.println("LinkedList Deque after additions: " + deque);

        // Access elements
        System.out.println("Peek first: " + deque.peekFirst());
        System.out.println("Peek last: " + deque.peekLast());

        // Removing elements
        System.out.println("Remove first: " + deque.removeFirst());
        System.out.println("Remove last: " + deque.removeLast());

        System.out.println("LinkedList Deque after removals: " + deque);

        // Iterating with Iterator
        System.out.println("Iterating LinkedList Deque:");
        Iterator<Integer> it = deque.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
