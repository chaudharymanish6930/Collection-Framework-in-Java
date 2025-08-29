package Collection_Framework.E_Queue_Interface.A_Priority_Queue;

import java.util.PriorityQueue;

public class a_PriorityDequeueExample {
    public static void main(String[] args) {
        // Create a PriorityQueue (min-heap by default)
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // 1. add() and offer() - insert elements
        pq.add(50);
        pq.add(20);
        pq.add(30);
        pq.offer(10);
        pq.offer(40);
        System.out.println("PriorityQueue: " + pq);

        // 2. peek() - retrieve head (smallest element), returns null if empty
        System.out.println("Peek (head): " + pq.peek());

        // 3. element() - retrieve head but throws exception if empty
        System.out.println("Element (head): " + pq.element());

        // 4. poll() - removes and returns head, returns null if empty
        System.out.println("Poll (remove head): " + pq.poll());
        System.out.println("After poll: " + pq);

        // 5. remove(Object) - remove specific element
        pq.remove(30);
        System.out.println("After remove(30): " + pq);

        // 6. remove() - removes and returns head, throws exception if empty
        System.out.println("Remove() (removes head): " + pq.remove());
        System.out.println("After remove(): " + pq);

        // 7. contains()
        System.out.println("Contains 40? " + pq.contains(40));

        // 8. size()
        System.out.println("Size: " + pq.size());

        // 9. Iteration
        System.out.print("Iterating: ");
        for (Integer num : pq) {
            System.out.print(num + " ");
        }
        System.out.println();

        // 10. clear()
        pq.clear();
        System.out.println("After clear(): " + pq);
    }

}
