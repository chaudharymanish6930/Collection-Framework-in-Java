package Collection_Framework.D_Set_Interface.B_SortedSet_NavigableSet;

import java.util.*;

public class a_TreeSet {
    public static void main(String[] args) {
        // Create a SortedSet (TreeSet implementation)
        SortedSet<Integer> set = new TreeSet<>();

        // 1. add() - Adding elements
        set.add(40);
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(50);
        System.out.println("After add(): " + set);

        // 2. remove() - Removing element
        set.remove(20);
        System.out.println("After remove(20): " + set);

        // 3. contains() - Check if element exists
        System.out.println("Contains 30? " + set.contains(30));

        // 4. size() - Get size
        System.out.println("Size of set: " + set.size());

        // 5. isEmpty() - Check if empty
        System.out.println("Is set empty? " + set.isEmpty());

        // 6. first() and last() - Get first and last elements
        System.out.println("First element: " + set.first());
        System.out.println("Last element: " + set.last());

        // 7. headSet() - Elements less than given element
        System.out.println("headSet(40): " + set.headSet(40));
        System.out.println(set);

        // 8. tailSet() - Elements greater than or equal to given element
        System.out.println("tailSet(30): " + set.tailSet(30));

        // 9. subSet() - Range of elements
        System.out.println("subSet(10, 50): " + set.subSet(10, 50));

        // 10. iterator() - Iterating
        System.out.print("Iterating with iterator: ");
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        // 11. clear() - Removing all elements
        set.clear();
        System.out.println("After clear(): " + set);
    }
}
