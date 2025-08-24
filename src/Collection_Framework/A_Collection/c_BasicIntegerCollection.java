package Collection_Framework.A_Collection;

import java.util.*;

public class c_BasicIntegerCollection {
    public static void main(String[] args){
        // Create a Collection (ArrayList implementation) with Integer
        Collection<Integer> cl = new ArrayList<>();

        // add()
        cl.add(10);
        cl.add(20);
        cl.add(30);
        cl.add(40);
        cl.add(50);
        cl.add(60);
        System.out.println("After add(): " + cl);

        // size()
        System.out.println("Size: " + cl.size());

        // isEmpty()
        System.out.println("Is empty? " + cl.isEmpty());

        // contains()
        System.out.println("Contains 20? " + cl.contains(20));

        // remove()
        cl.remove(20);
        System.out.println("After remove(20): " + cl);

        // addAll()
        Collection<Integer> moreNumbers = new ArrayList<>();
        moreNumbers.add(70);
        moreNumbers.add(80);
        moreNumbers.add(90);
        cl.addAll(moreNumbers);
        System.out.println("After addAll(): " + cl);

        // containsAll()
        System.out.println("Contains all [10, 50, 90]? " + cl.containsAll(List.of(10, 50, 90)));

        // removeAll()
        cl.removeAll(List.of(10, 30));
        System.out.println("After removeAll([10, 30]): " + cl);

        // retainAll() -> keep only selected numbers
        cl.retainAll(List.of(40, 50, 90));
        System.out.println("After retainAll([40, 50, 90]): " + cl);

        // clear()
        cl.clear();
        System.out.println("After clear(): " + cl);
    }
}
