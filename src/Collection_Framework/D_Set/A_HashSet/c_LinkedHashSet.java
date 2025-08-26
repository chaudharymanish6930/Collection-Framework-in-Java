package Collection_Framework.D_Set.A_HashSet;

import java.util.*;

public class c_LinkedHashSet {
    public static void main(String[] args) {
        // 1. Create a LinkedHashSet
        LinkedHashSet<String> lhs = new LinkedHashSet<>();

        // 2. add()
        lhs.add("Apple");
        lhs.add("Banana");
        lhs.add("Orange");
        lhs.add("Grapes");
        lhs.add("Mango");
        System.out.println("After add(): " + lhs);

        // 3. add() - duplicate (will not add)
        lhs.add("Apple");
        System.out.println("After adding duplicate 'Apple': " + lhs);

        // 4. addAll()
        LinkedHashSet<String> moreFruits = new LinkedHashSet<>();
        moreFruits.add("Pineapple");
        moreFruits.add("Guava");
        lhs.addAll(moreFruits);
        System.out.println("After addAll(): " + lhs);

        // 5. contains()
        System.out.println("Contains 'Banana'? " + lhs.contains("Banana"));

        // 6. remove()
        lhs.remove("Orange");
        System.out.println("After remove('Orange'): " + lhs);

        // 7. removeAll()
        lhs.removeAll(moreFruits);
        System.out.println("After removeAll(moreFruits): " + lhs);

        // 8. retainAll()
        LinkedHashSet<String> keep = new LinkedHashSet<>();
        keep.add("Apple");
        keep.add("Banana");
        lhs.retainAll(keep);
        System.out.println("After retainAll(keep): " + lhs);

        // 9. clear()
        lhs.clear();
        System.out.println("After clear(): " + lhs);

        // 10. isEmpty()
        System.out.println("Is empty? " + lhs.isEmpty());

        // Re-add elements for iteration examples
        lhs.add("Red");
        lhs.add("Green");
        lhs.add("Blue");
        lhs.add("Yellow");
        lhs.add("Pink");

        // 11. size()
        System.out.println("Size: " + lhs.size());

        // 12. iterator()
        System.out.print("Iterating with Iterator: ");
        Iterator<String> itr = lhs.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println();

        // 13. for-each loop
        System.out.print("Iterating with for-each: ");
        for (String color : lhs) {
            System.out.print(color + " ");
        }
        System.out.println();

        // 14. toArray()
        Object[] arr = lhs.toArray();
        System.out.print("Converted to Array: ");
        for (Object obj : arr) {
            System.out.print(obj + " ");
        }
        System.out.println();

        // 15. clone()
        @SuppressWarnings("unchecked")
        LinkedHashSet<String> cloned = (LinkedHashSet<String>) lhs.clone();
        System.out.println("Cloned LinkedHashSet: " + cloned);

        // 16. equals()
        System.out.println("lhs equals cloned? " + lhs.equals(cloned));

        // 17. hashCode()
        System.out.println("HashCode of lhs: " + lhs.hashCode());
        System.out.println("HashCode of cloned: " + cloned.hashCode());

        // 18. spliterator() - for advanced traversal
        System.out.print("Spliterator traversal: ");
        Spliterator<String> spl = lhs.spliterator();
        spl.forEachRemaining(e -> System.out.print(e + " "));
        System.out.println();

        // 19. containsAll()
        System.out.println("lhs containsAll cloned? " + lhs.containsAll(cloned));
    }

}
