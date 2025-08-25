package Collection_Framework.B_Cursors_in_Collection.B_List_Iterator;

import java.util.*;

public class b_ExampleListIterator {
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        // Use generic ListIterator
        ListIterator<Integer> its = numbers.listIterator();

        // Add 40 at the beginning
        its.add(40);

        System.out.println("Forward traversal after adding 40:");
        while (its.hasNext()) {
            System.out.print("->" + its.next());
        }

        // Remove 10
        ListIterator<Integer> itss = numbers.listIterator();
        while (itss.hasNext()) {
            if (itss.next().equals(10)) { // use equals() for Integer comparison
                itss.remove();            // remove from current iterator
            }
        }

        System.out.println("\nAfter removing 10:");
        System.out.println(numbers);
    }
}
