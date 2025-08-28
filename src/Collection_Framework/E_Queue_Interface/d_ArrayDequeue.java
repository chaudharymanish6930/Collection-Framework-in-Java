package Collection_Framework.E_Queue_Interface;

import java.util.*;

public class d_ArrayDequeue {
    public static void main(String[] args) {
        // Create ArrayDeque
        ArrayDeque<Integer> dq = new ArrayDeque<>();

        // ---------------- Add / Offer Methods ----------------
        dq.add(10);   // add at tail
        dq.add(20);
        dq.add(30);
        dq.offer(40); // add at tail safely
        dq.addFirst(5);  // add at head
        dq.addLast(50);  // add at tail
        dq.offerFirst(1); // safe add at head
        dq.offerLast(60); // safe add at tail
        System.out.println("After adding: " + dq);

        // ---------------- Peek / Element Methods ----------------
        System.out.println("peek() (head): " + dq.peek());         // head element
        System.out.println("peekFirst(): " + dq.peekFirst());      // first element
        System.out.println("peekLast(): " + dq.peekLast());        // last element
        System.out.println("element() (head): " + dq.element());   // head (throws exception if empty)

        // ---------------- Poll / Remove Methods ----------------
        System.out.println("poll() (remove head): " + dq.poll());
        System.out.println("pollFirst(): " + dq.pollFirst());
        System.out.println("pollLast(): " + dq.pollLast());
        System.out.println("remove() (remove head): " + dq.remove());
        dq.removeFirst();  // remove from head
        dq.removeLast();   // remove from tail
        dq.remove(30);     // remove specific element
        System.out.println("After removals: " + dq);

        // ---------------- Contains / Size ----------------
        System.out.println("Contains 40? " + dq.contains(40));
        System.out.println("Size: " + dq.size());
        System.out.println("Is Empty? " + dq.isEmpty());

        // ---------------- Iteration ----------------
        System.out.print("Iterating forward: ");
        for (Integer num : dq) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.print("Iterating backward: ");
        Iterator<Integer> it = dq.descendingIterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        // ---------------- Stack Operations ----------------
        dq.push(100); // addFirst()
        dq.push(200);
        System.out.println("After push(): " + dq);

        System.out.println("pop(): " + dq.pop()); // removeFirst()
        System.out.println("After pop(): " + dq);

        // ---------------- Clear ----------------
        dq.clear();
        System.out.println("After clear(): " + dq);

    }
}
