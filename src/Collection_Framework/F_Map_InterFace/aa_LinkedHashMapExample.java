package Collection_Framework.F_Map_InterFace;

import java.util.*;

public class aa_LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();

        map.put(10, "Red");
        map.put(20, "Green");
        map.put(30, "Blue");
        map.put(40, "Yellow");

        System.out.println("LinkedHashMap: " + map);

        // Access
        System.out.println("Value at key 20: " + map.get(20));

        // Remove
        map.remove(30);
        System.out.println("After removing key 30: " + map);

        // Iterating (in insertion order)
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key=" + entry.getKey() + ", Value=" + entry.getValue());
        }

        System.out.println("Size: " + map.size());
    }
}
