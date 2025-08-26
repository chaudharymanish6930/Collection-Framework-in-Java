package Collection_Framework.E_Queue_Interface;

import java.util.*;

public class c_DequeueExample {
    public static void main(String[] args) {
        // Create a Deque (ArrayDeque implementation)
        Deque<String> dq = new ArrayDeque<>();

        // 1. addFirst() & addLast() - insert at both ends
        dq.addFirst("A");
        dq.addLast("B");
        dq.addLast("C");
        dq.addFirst("Start");
        System.out.println("After addFirst & addLast: " + dq);

        // 2. offerFirst() & offerLast() - safe insertion
        dq.offerFirst("X");
        dq.offerLast("Y");
        System.out.println("After offerFirst & offerLast: " + dq);

        // 3. peekFirst() & peekLast() - get first & last elements
        System.out.println("Peek first: " + dq.peekFirst());
        System.out.println("Peek last: " + dq.peekLast());

        // 4. element() - returns first element (throws exception if empty)
        System.out.println("Element (first): " + dq.element());

        // 5. pollFirst() & pollLast() - remove and return elements
        System.out.println("Poll first: " + dq.pollFirst());
        System.out.println("Poll last: " + dq.pollLast());
        System.out.println("After pollFirst & pollLast: " + dq);

        // 6. removeFirst() & removeLast() - remove elements from both ends
        dq.removeFirst();
        dq.removeLast();
        System.out.println("After removeFirst & removeLast: " + dq);

        // 7. contains()
        System.out.println("Contains 'B'? " + dq.contains("B"));

        // 8. size() & isEmpty()
        System.out.println("Size: " + dq.size());
        System.out.println("Is empty? " + dq.isEmpty());

        // 9. Iterating forward
        System.out.print("Iterating forward: ");
        for (String s : dq) {
            System.out.print(s + " ");
        }
        System.out.println();

        // 10. Iterating backward
        System.out.print("Iterating backward: ");
        Iterator<String> it = dq.descendingIterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        // 11. clear()
        dq.clear();
        System.out.println("After clear(): " + dq);
    }
}
