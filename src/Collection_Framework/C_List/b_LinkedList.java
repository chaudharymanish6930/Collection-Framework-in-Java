package Collection_Framework.C_List;

import java.util.*;

public class b_LinkedList {
    public static void main(String[] args) {
        // 1. Create a LinkedList
        LinkedList<Integer> numbers = new LinkedList<>();

        // 2. Add elements
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        System.out.println("After add: " + numbers);

        // 3. Add element at specific index
        numbers.add(2, 25); // inserts 25 at index 2
        System.out.println("After add at index 2: " + numbers);

        // 4. Add element at first and last
        numbers.addFirst(5);
        numbers.addLast(50);
        System.out.println("After addFirst and addLast: " + numbers);

        // 5. Access elements
        System.out.println("Element at index 3: " + numbers.get(3));
        System.out.println("First element: " + numbers.getFirst());
        System.out.println("Last element: " + numbers.getLast());

        // 6. Update elements
        numbers.set(1, 15); // set index 1 to 15
        System.out.println("After set at index 1: " + numbers);

        // 7. Remove elements
        numbers.remove(0); // remove element at index 0
        //  remove(datatype.valueof("value"))
        numbers.remove(Integer.valueOf(30)); // remove element 30
        numbers.removeFirst(); // remove first element
        numbers.removeLast();  // remove last element
        System.out.println("After remove operations: " + numbers);

        // 7a. Peek and Poll
        System.out.println("Peek first element: " + numbers.peek()); // just view top element
        System.out.println("Poll first element: " + numbers.poll()); // remove first element
        System.out.println("After poll: " + numbers);


        // 8. Size of LinkedList
        System.out.println("Size of LinkedList: " + numbers.size());

        // 9. Check if element exists
        System.out.println("Contains 25? " + numbers.contains(25));
        System.out.println("Contains 100? " + numbers.contains(100));

        // 10. Check if LinkedList is empty
        System.out.println("Is LinkedList empty? " + numbers.isEmpty());

        // 11. Traverse using for-each
        System.out.println("Traverse using for-each:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // 12. Traverse using Iterator
        System.out.println("Traverse using Iterator:");
        Iterator<Integer> it = numbers.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        // 13. Traverse using ListIterator
        System.out.println("Traverse using ListIterator forward:");
        ListIterator<Integer> listIt = numbers.listIterator();
        while (listIt.hasNext()) {
            System.out.print(listIt.next() + " ");
        }
        System.out.println();

        System.out.println("Traverse using ListIterator backward:");
        while (listIt.hasPrevious()) {
            System.out.print(listIt.previous() + " ");
        }
        System.out.println();

        // 14. Clear LinkedList
        numbers.clear();
        System.out.println("After clear: " + numbers);

        // 15. Add elements again for sorting
        numbers.add(50);
        numbers.add(20);
        numbers.add(40);
        numbers.add(10);

        // 16. Sort LinkedList
        Collections.sort(numbers);
        System.out.println("After sort: " + numbers);

        // 17. Reverse LinkedList
        Collections.reverse(numbers);
        System.out.println("After reverse: " + numbers);

        // 18. Shuffle LinkedList
        Collections.shuffle(numbers);
        System.out.println("After shuffle: " + numbers);
        // order changes randomly

        // --- Collection methods on LinkedList ---

        // addAll(Collection)
        LinkedList<Integer> moreNumbers = new LinkedList<>();
        moreNumbers.add(60);
        moreNumbers.add(70);
        moreNumbers.add(80);
        numbers.addAll(moreNumbers);
        System.out.println("After addAll: " + numbers);

        // removeAll(Collection)
        numbers.removeAll(moreNumbers);
        System.out.println("After removeAll: " + numbers);

        // retainAll(Collection) - keeps only common elements
        LinkedList<Integer> retainSet = new LinkedList<>();
        retainSet.add(20);
        retainSet.add(25);
        numbers.retainAll(retainSet);
        System.out.println("After retainAll (keeping only 20 and 25): " + numbers);

    }
}
