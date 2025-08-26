package Collection_Framework.C_List;

import java.util.*;

public class c_Vector {
    public static void main(String[] args) {
        // 1. Create a Vector
        Vector<Integer> numbers = new Vector<>();

        // 2. Add elements
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        System.out.println("After add: " + numbers);

        // 3. Add element at specific index
        numbers.add(2, 25);
        System.out.println("After add at index 2: " + numbers);

        // 4. Add element at first and last
        numbers.insertElementAt(5, 0); // add at first
        numbers.addElement(50); // add at last
        System.out.println("After insertElementAt and addElement: " + numbers);

        // 5. Access elements
        System.out.println("Element at index 3: " + numbers.get(3));
        System.out.println("First element: " + numbers.firstElement());
        System.out.println("Last element: " + numbers.lastElement());

        // 6. Update elements
        numbers.set(1, 15);
        System.out.println("After set at index 1: " + numbers);

        // 7. Remove elements
        numbers.remove(0); // remove element at index 0
        numbers.remove(Integer.valueOf(30)); // remove element 30
        numbers.removeElementAt(2); // remove element at index 2
        numbers.removeElement(50);  // remove element 50
        System.out.println("After remove operations: " + numbers);

        // 8. Size of Vector
        System.out.println("Size of Vector: " + numbers.size());

        // 9. Check if element exists
        System.out.println("Contains 25? " + numbers.contains(25));
        System.out.println("Contains 100? " + numbers.contains(100));

        // 10. Check if Vector is empty
        System.out.println("Is Vector empty? " + numbers.isEmpty());

        Vector<Integer> clonedV = (Vector<Integer>) numbers.clone();
        System.out.println("Clone :"+clonedV);  // [10, 20]

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

        // 14. Traverse using Enumeration (legacy cursor)
        System.out.println("Traverse using Enumeration:");
        Enumeration<Integer> en = numbers.elements();
        while (en.hasMoreElements()) {
            System.out.print(en.nextElement() + " ");
        }
        System.out.println();

        // 15. Clear Vector
        numbers.clear();
        System.out.println("After clear: " + numbers);

        // --- Collection methods on Vector ---

        // addAll(Collection)
        Vector<Integer> moreNumbers = new Vector<>();
        moreNumbers.add(60);
        moreNumbers.add(70);
        moreNumbers.add(80);
        numbers.addAll(moreNumbers);
        System.out.println("After addAll: " + numbers);

        // removeAll(Collection)
        numbers.removeAll(moreNumbers);
        System.out.println("After removeAll: " + numbers);

        // retainAll(Collection) - keeps only common elements
        Vector<Integer> retainSet = new Vector<>();
        retainSet.add(20);
        retainSet.add(25);
        numbers.retainAll(retainSet);
        System.out.println("After retainAll (keeping only 20 and 25): " + numbers);
    }
}
