package Collection_Framework.F_Map_InterFace;

import java.util.HashMap;
import java.util.Map;

public class g_HashMapValueCheck {
    public static void main(String[] args) {
        Map<Integer,Integer> count = new HashMap<>();
        count.put(1,10);
        count.put(2,1);
        count.put(3,1);
        count.put(1,1000);
        System.out.println(count.getOrDefault(1,10));
        System.out.println(count.getOrDefault(5, null));
    }
}
