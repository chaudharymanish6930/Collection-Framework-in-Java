package Collection_Framework.B_Cursors_in_Collection.A_Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class a_ExampleIterator {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");

        // Get the iterator
        // only 3 methods - hasNext(), next(), remove()
        Iterator<String> it = fruits.iterator();

        System.out.println("Fruits list using Iterator:");

        // Traverse elements using Iterator
        while (it.hasNext()) {
            String fruit = it.next();
            System.out.println(fruit);

            // Example: remove Mango
            if (fruit.equals("Mango")) {
                it.remove();
            }
        }

        System.out.print("\nAfter removing Mango: ");
        System.out.println(fruits);
    }
}
