package Collection_Framework.B_Cursors_in_Collection.B_List_Iterator;

import  java.util.*;

public class a_ExampleListIterator {
    public static void main(String[] args){
        // Create a list of integers
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        // Get the ListIterator
        // forward, backward, set(replace)
        ListIterator<Integer> listIt = numbers.listIterator();

        System.out.println("Forward traversal:");

        // Traverse forward
        while (listIt.hasNext()) {
            int num = listIt.next();
            System.out.println(num + " at index " + listIt.previousIndex());

            // Replace 20 with 25
            if (num == 20) {
                listIt.set(25);
            }
        }

        System.out.println("\nBackward traversal:");

        // Traverse backward
        while (listIt.hasPrevious()) {
            System.out.println(listIt.previous() + " at index " + listIt.nextIndex());
        }

    }
}
