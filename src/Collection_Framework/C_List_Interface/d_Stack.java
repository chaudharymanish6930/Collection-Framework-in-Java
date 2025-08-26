package Collection_Framework.C_List_Interface;

import java.util.*;

public class d_Stack {
    public static void main(String[] args) {
        // 1. Create a Stack
        Stack<Integer> stack = new Stack<>();

        // 2. Push elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println("After push: " + stack);

        // 3. Peek the top element
        System.out.println("Peek top element: " + stack.peek());

        // 4. Pop the top element
        System.out.println("Pop top element: " + stack.pop());
        System.out.println("After pop: " + stack);

        // 5. Search for an element (returns 1-based position from top)
        System.out.println("Position of 20 from top: " + stack.search(20));
        System.out.println("Position of 50 from top: " + stack.search(50));

        // 6. Check if stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());

        // 7. Size of stack
        System.out.println("Size of stack: " + stack.size());

        // 8. Traverse using for-each
        System.out.println("Traverse using for-each:");
        for (int num : stack) {
            System.out.print(num + " ");
        }
        System.out.println();

        // 9. Traverse using Iterator
        System.out.println("Traverse using Iterator:");
        Iterator<Integer> it = stack.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        // 10. Traverse using ListIterator
        System.out.println("Traverse using ListIterator forward:");
        ListIterator<Integer> listIt = stack.listIterator();
        while (listIt.hasNext()) {
            System.out.print(listIt.next() + " ");
        }
        System.out.println();

        System.out.println("Traverse using ListIterator backward:");
        while (listIt.hasPrevious()) {
            System.out.print(listIt.previous() + " ");
        }
        System.out.println();

        // 11. Clear the stack
        stack.clear();
        System.out.println("After clear: " + stack);
    }
}
