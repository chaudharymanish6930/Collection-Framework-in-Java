package Collection_Framework.C_List_Interface;

import java.util.*;

public class a_ArrayList {
    public static void main(String[] args) {
        // 1. Create an ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();

        // 2. Add elements
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        System.out.println("After add: " + numbers);

        // 3. Add element at specific index
        numbers.add(2, 25); // inserts 25 at index 2
        System.out.println("After add at index 2: " + numbers);

        // 4. Access elements
        System.out.println("Element at index 3: " + numbers.get(3));

        // 5. Update elements
        numbers.set(1, 15); // set index 1 to 15
        System.out.println("After set at index 1: " + numbers);

        // 6. Remove elements
        numbers.remove(0); // remove element at index 0
        System.out.println("After remove index 0: " + numbers);
        numbers.remove(Integer.valueOf(30)); // remove element 30
        System.out.println("After remove element 30: " + numbers);

        // 7. Size of ArrayList
        System.out.println("Size of ArrayList: " + numbers.size());

        // 8. Check if element exists
        System.out.println("Contains 25? " + numbers.contains(25));
        System.out.println("Contains 50? " + numbers.contains(50));

        // 9. Check if ArrayList is empty
        System.out.println("Is ArrayList empty? " + numbers.isEmpty());

        // clone
        ArrayList<String> cloned = (ArrayList<String>) numbers.clone();
        System.out.println("Clones :"+cloned);

        // 10. Traverse using for-each
        System.out.println("Traverse using for-each:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // 11. Traverse using Iterator
        System.out.println("Traverse using Iterator:");
        Iterator<Integer> it = numbers.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        // 12. Traverse using ListIterator
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

        // 13. Clear ArrayList
        numbers.clear();
        System.out.println("After clear: " + numbers);

        // 14. Add elements again for sorting
        numbers.add(50);
        numbers.add(20);
        numbers.add(40);
        numbers.add(10);

        // 15. Sort ArrayList with collection
        Collections.sort(numbers);
        System.out.println("After sort: " + numbers);

        // 16. Reverse ArrayList with collection
        Collections.reverse(numbers);
        System.out.println("After reverse: " + numbers);

        // 17. Shuffle ArrayList
        Collections.shuffle(numbers);
        System.out.println("After shuffle: " + numbers);

        // --- Collection methods on ArrayList ---

        // addAll(Collection)
        ArrayList<Integer> moreNumbers = new ArrayList<>();
        moreNumbers.add(60);
        moreNumbers.add(70);
        moreNumbers.add(80);
        numbers.addAll(moreNumbers);
        System.out.println("After addAll: " + numbers);

        // removeAll(Collection)
        numbers.removeAll(moreNumbers);
        System.out.println("After removeAll: " + numbers);

        // retainAll(Collection) - keeps only common elements
        ArrayList<Integer> retainSet = new ArrayList<>();
        retainSet.add(20);
        retainSet.add(25);
        numbers.retainAll(retainSet);
        System.out.println("After retainAll (keeping only 20 and 25): " + numbers);
    }
}
