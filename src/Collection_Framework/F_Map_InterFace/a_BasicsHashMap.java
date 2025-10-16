package Collection_Framework.F_Map_InterFace;

import java.util.*;
public class a_BasicsHashMap {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        // Adding elements
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");
        map.put(4, "Mango");

        System.out.println("HashMap: " + map);

        // Access value
        System.out.println("Get value at key 2: " + map.get(2)); // access by the keys
        System.out.println("value of 3: "+map.get(3));

        // Remove
        map.remove(3);
        System.out.println("After removing key 3: " + map);
        System.out.println(map.remove(2));

        // Contains
        System.out.println("Contains key 1? " + map.containsKey(1));
        System.out.println("Contains value 'Mango'? " + map.containsValue("Mango"));

        // Iterating
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key=" + entry.getKey() + ", Value=" + entry.getValue());
        }

        System.out.println("Size: " + map.size());
    }
}
