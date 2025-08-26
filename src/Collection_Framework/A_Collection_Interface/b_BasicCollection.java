package Collection_Framework.A_Collection_Interface;

import java.util.Collection;
import java.util.List;
import java.util.ArrayList;

public class b_BasicCollection {
    public static void main(String[] args){
        // Create a Collection (ArrayList implementation)
        Collection<String> cl = new ArrayList<>();

        // add()
        cl.add("Apple");
        cl.add("Banana");
        cl.add("Orange");
        System.out.println("After add(): " + cl);

        // size()
        System.out.println("Size: " + cl.size());

        // isEmpty()
        System.out.println("Is empty? " + cl.isEmpty());

        // contains()
        System.out.println("Contains Banana? " + cl.contains("Banana"));

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
        System.out.println("Contains all [Apple, Mango]? " + cl.containsAll(List.of("Apple", "Mango")));

        // removeAll()
        // retainAll acts like an intersection between two collections
        cl.removeAll(List.of("Apple", "Orange"));
        System.out.println("After removeAll(): " + cl);

        // retainAll()
        cl.retainAll(List.of("Mango","Apple","Banana"));
        System.out.println("After retainAll(): " + cl);

        cl.retainAll(List.of("Mango","organge","grapes"));
        System.out.println("After retainAll(): " + cl);

        // clear()
        cl.clear();
        System.out.println("After clear(): " + cl);
    }
}
