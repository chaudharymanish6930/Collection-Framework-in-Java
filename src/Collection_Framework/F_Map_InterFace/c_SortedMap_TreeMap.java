package Collection_Framework.F_Map_InterFace;
import java.util.*;
public class c_SortedMap_TreeMap {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(50, "One");
        map.put(20, "Two");
        map.put(10, "Three");
        map.put(40, "Four");

        System.out.println("TreeMap (Sorted): " + map);

        // First and Last Keys
        System.out.println("First Key: " + map.firstKey());
        System.out.println("Last Key: " + map.lastKey());

        // HeadMap, TailMap
        System.out.println("HeadMap (keys < 40): " + map.headMap(40));
        System.out.println("TailMap (keys >= 20): " + map.tailMap(20));

        // Remove
        map.remove(10);
        System.out.println("After removing key 10: " + map);

        // Iterating in sorted order
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key=" + entry.getKey() + ", Value=" + entry.getValue());
        }

        System.out.println("Size: " + map.size());
    }

}
