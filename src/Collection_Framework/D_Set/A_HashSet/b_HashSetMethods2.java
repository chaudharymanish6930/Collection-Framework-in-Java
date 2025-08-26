package Collection_Framework.D_Set.A_HashSet;

import java.util.*;

public class b_HashSetMethods2 {
    public static void main(String[] args) {
        // Create HashSet
        HashSet<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");

        System.out.println("Initial HashSet: " + set);

        // 1. addAll(Collection)
        HashSet<String> moreFruits = new HashSet<>();
        moreFruits.add("Pineapple");
        moreFruits.add("Papaya");
        set.addAll(moreFruits);
        System.out.println("After addAll(): " + set);

        // 2. removeAll(Collection)
        set.removeAll(moreFruits);
        System.out.println("After removeAll(): " + set);

        // 3. retainAll(Collection)
        HashSet<String> commonFruits = new HashSet<>();
        commonFruits.add("Apple");
        commonFruits.add("Kiwi");
        set.retainAll(commonFruits);    // the elemennt u want to retain it, element should be present in it
        System.out.println("After retainAll() (common with Apple, Kiwi): " + set);

        // 4. clone()
        @SuppressWarnings("unchecked")
        HashSet<String> clonedSet = (HashSet<String>) set.clone();
        System.out.println("Cloned HashSet: " + clonedSet);

        // 5. toArray()
        Object[] arr = set.toArray();
        System.out.print("Converted to Array: ");
        for (Object obj : arr) {
            System.out.print(obj + " ");
        }
        System.out.println();

        // 6. clear()
        set.clear();
        System.out.println("After clear(): " + set);

        // 7. isEmpty() after clear
        System.out.println("Is HashSet empty now? " + set.isEmpty());
    }
}
