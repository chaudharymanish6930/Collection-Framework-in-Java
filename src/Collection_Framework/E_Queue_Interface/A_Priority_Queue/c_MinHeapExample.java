package Collection_Framework.E_Queue_Interface.A_Priority_Queue;
import java.util.*;

public class c_MinHeapExample {
    public static void main(String[] args) {
        // Min-Heap: smallest element always at the head
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // Adding elements
        minHeap.add(10);
        minHeap.add(5);
        minHeap.add(20);
        minHeap.add(15);

        System.out.println("Min-Heap elements: " + minHeap);

        // Access head
        System.out.println("Peek (smallest): " + minHeap.peek());

        // Removing elements
        while (!minHeap.isEmpty()) {
            System.out.println("Removed: " + minHeap.poll());
        }
    }
}
