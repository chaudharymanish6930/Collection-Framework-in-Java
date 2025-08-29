package Collection_Framework.F_Map_InterFace;
import java.util.*;
public class d_WeakHashMap {
    public static void main(String[] args) {
        WeakHashMap<Object, String> weakMap = new WeakHashMap<>();

        Object key1 = new String("temp1");
        Object key2 = new String("temp2");

        weakMap.put(key1, "Data1");
        weakMap.put(key2, "Data2");

        System.out.println("WeakHashMap before GC: " + weakMap);

        // Make key1 eligible for GC
        key1 = null;
        System.gc();

        // Pause to allow GC
        try { Thread.sleep(1000); } catch (Exception e) {}

        System.out.println("WeakHashMap after GC: " + weakMap);
    }
}
