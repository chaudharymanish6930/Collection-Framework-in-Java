package Collection_Framework.F_Map_InterFace;

import java.util.HashMap;
import java.util.Map;

public class b_MainHashMap {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        // Adding elements
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");
        map.put(4, "Mango");

        System.out.println(map.get(4));   // mango
        System.out.println(map.get(6));  // null

        // remove method for remove from the hashmap and return null if key not exist
        System.out.println(map.remove(3));
        System.out.println(map.remove(9));

        // contains method like containskey and containsvalue
        System.out.println(map.containsKey(5));
        System.out.println(map.containsKey(3));
        System.out.println(map.containsKey(1));
        System.out.println(map.containsValue("apple"));

        // put method for update and inserts in the hashmap
        map.put(1,"Tomato");
        System.out.println(map);
        // insert new values
        System.out.println(map.put(5,"Brinjal"));
        System.out.println(map);

        System.out.println(map.putIfAbsent(1,"Apple"));
        System.out.println(map.putIfAbsent(2,"Apple"));
    }
}
