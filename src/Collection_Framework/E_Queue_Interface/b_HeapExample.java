package Collection_Framework.E_Queue_Interface;

import java.util.*;

public class b_HeapExample {
    public static void main(String[] args) {
        // ---------------- MIN HEAP (default) ----------------
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        minHeap.add(50);
        minHeap.add(20);
        minHeap.add(30);
        minHeap.add(10);
        minHeap.add(40);

        System.out.println("Min Heap (PriorityQueue default): " + minHeap);
        System.out.println("Peek (smallest): " + minHeap.peek());
        System.out.println("Poll (remove smallest): " + minHeap.poll());
        System.out.println("After poll: " + minHeap);

        // ---------------- MAX HEAP ----------------
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        maxHeap.add(50);
        maxHeap.add(20);
        maxHeap.add(30);
        maxHeap.add(10);
        maxHeap.add(40);

        System.out.println("\nMax Heap (using Comparator): " + maxHeap);
        System.out.println("Peek (largest): " + maxHeap.peek());
        System.out.println("Poll (remove largest): " + maxHeap.poll());
        System.out.println("After poll: " + maxHeap);
    }
}
