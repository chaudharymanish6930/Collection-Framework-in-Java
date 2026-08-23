package Collection_Framework.C_List_Interface.b_ArrayListInArray;

import java.util.ArrayList;
import java.util.List;

public class a_ArrayListInArray {
    public static void main(String[] args) {
        List<int[]> list = new ArrayList<>();

        list.add(new int[]{1,6});
        list.add(new int[]{8,10});
        list.add(new int[]{15,18});
        System.out.println(list);
    }
}
