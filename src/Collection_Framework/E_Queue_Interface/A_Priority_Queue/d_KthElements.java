package Collection_Framework.E_Queue_Interface.A_Priority_Queue;

import java.util.*;

public class d_KthElements {
    public static void main(String[] args) {
        HashMap<Integer, Integer> count = new HashMap<>();
        count.put(5, 4);
        count.put(8, 1);
        count.put(3, 7);

        Queue<Integer> heap = new PriorityQueue<>(
                (a, b) -> count.get(a) - count.get(b)
        );

        heap.add(5);   // freq 4
        heap.add(8);   // freq 1
        heap.add(3);   // freq 7

        while(!heap.isEmpty()) {
            int num = heap.poll();
            System.out.println(num + " -> " + count.get(num));
        }

    }
}
