package Collection_Framework.B_Cursors_in_Collection.A_Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class b_example {
    public static void main(String[] args){
        ArrayList nums = new ArrayList();

        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(40);
        nums.add(50);

        // only 3 methods - hasNext(), next(), remove()
        Iterator its = nums.iterator();
            System.out.print("list using Iterator:");
            // Traverse elements using Iterator
            while (its.hasNext()) {
                System.out.print(its.next()+" ");
            }
    }
}
