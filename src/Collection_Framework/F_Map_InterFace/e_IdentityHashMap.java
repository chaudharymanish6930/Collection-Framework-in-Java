package Collection_Framework.F_Map_InterFace;
import java.util.*;
public class e_IdentityHashMap {
    public static void main(String[] args) {
        IdentityHashMap<String, String> idMap = new IdentityHashMap<>();

        // Two different objects with same content
        String a = new String("Java");
        String b = new String("Java");

        idMap.put(a, "Language1");
        idMap.put(b, "Language2");

        System.out.println("IdentityHashMap: " + idMap);

        // Normal HashMap would overwrite since keys are equal
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put(a, "Language1");
        hashMap.put(b, "Language2");

        System.out.println("HashMap: " + hashMap);
    }
}
