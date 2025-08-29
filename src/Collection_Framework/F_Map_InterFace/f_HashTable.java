package Collection_Framework.F_Map_InterFace;
import java.util.*;
public class f_HashTable {
    public static void main(String[] args) {
        Hashtable<Integer, String> table = new Hashtable<>();

        table.put(1, "Dog");
        table.put(2, "Cat");
        table.put(3, "Horse");
        table.put(4, "Elephant");

        System.out.println("Hashtable: " + table);

        // Access
        System.out.println("Value at key 2: " + table.get(2));

        // Remove
        table.remove(3);
        System.out.println("After removing key 3: " + table);

        // Iterating
        for (Map.Entry<Integer, String> entry : table.entrySet()) {
            System.out.println("Key=" + entry.getKey() + ", Value=" + entry.getValue());
        }

        System.out.println("Size: " + table.size());
    }
}
