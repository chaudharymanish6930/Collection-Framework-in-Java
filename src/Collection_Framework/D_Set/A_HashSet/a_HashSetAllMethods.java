package Collection_Framework.D_Set.A_HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class a_HashSetAllMethods {
    public static void main(String[] args) {
        // Create HashSet
        HashSet<String> set = new HashSet<>();

        // 1. add()
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Mango");
        set.add("Banana"); // duplicate, ignored
        set.add(null);     // allows only one null only takes one time
        set.add(null);  // duplicate elements remove automatical

        System.out.println("Initial HashSet: " + set);

        // 2. size()
        System.out.println("Size of HashSet: " + set.size());

        // 3. contains()
        System.out.println("Contains 'Apple'? " + set.contains("Apple"));
        System.out.println("Contains 'Grapes'? " + set.contains("Grapes"));

        // 4. isEmpty()
        System.out.println("Is HashSet empty? " + set.isEmpty());

        // 5. remove(Object)
        set.remove("Mango");
        System.out.println("After removing 'Mango': " + set);

        // 6. iterator()
        System.out.print("Iterating with Iterator: ");
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        // 7. for-each loop
        System.out.print("Iterating with for-each: ");
        for (String fruit : set) {
            System.out.print(fruit + " ");
        }
        System.out.println();

    }
}
