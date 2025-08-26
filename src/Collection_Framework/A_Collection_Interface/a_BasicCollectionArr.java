package Collection_Framework.A_Collection_Interface;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Arrays; // specifically for Arrays.toString()

public class a_BasicCollectionArr {
    public static void main(String[] args){
        Collection<String> cl = new ArrayList<>();
        // add()
        cl.add("Apple");
        cl.add("Banana");
        cl.add("Orange");
        System.out.println("After add(): " + cl);

        // size()  --> count elements
        System.out.println("Size: " + cl.size());

        // isEmpty()  --> return boolean value
        System.out.println("Is empty? " + cl.isEmpty());

        // contains()   --> return boolean value
        System.out.println("Contains Banana? " + cl.contains("Banana"));

        // toArray()
        Object[] arr = cl.toArray();
        System.out.println("toArray(): " + Arrays.toString(arr));

        // remove()
        cl.remove("Banana");
        System.out.println("After remove(): " + cl);

        // addAll()
        Collection<String> moreFruits = new ArrayList<>();
        moreFruits.add("Grapes");
        moreFruits.add("Mango");
        cl.addAll(moreFruits);
        System.out.println("After addAll(): " + cl);

        // containsAll()
        System.out.println("Contains all [Apple, ango]? " + cl.containsAll(Arrays.asList("Apple", "ango")));
        System.out.println("Contains all [Apple, Mango]? " + cl.containsAll(Arrays.asList("Apple", "Mango")));

        // removeAll()
        cl.removeAll(Arrays.asList("Apple", "Orange"));
        System.out.println("After removeAll(): " + cl);

        // retainAll()
        cl.retainAll(Arrays.asList("Mango"));
        System.out.println("After retainAll(): " + cl);

        // clear()
        cl.clear();
        System.out.println("After clear(): " + cl);

    }
}
