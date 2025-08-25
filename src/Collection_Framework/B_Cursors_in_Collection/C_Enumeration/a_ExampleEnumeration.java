package Collection_Framework.B_Cursors_in_Collection.C_Enumeration;

import java.util.*;

public class a_ExampleEnumeration {
    public static void main(String[] args) {
        // Create a Vector (legacy collection)
        Vector<Integer> numbers = new Vector<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        // Get the Enumeration
        // it is only for reading the data
        Enumeration en = numbers.elements();

        System.out.println("Elements using Enumeration:");

        // Traverse elements
        while (en.hasMoreElements()) {
            System.out.print(en.nextElement()+" ");
        }
    }
}
