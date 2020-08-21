import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class SimpleWaekHashMap {
    public static void main(String[] args) {
      Map<String, String> weakHM = new WeakHashMap<>();
      Map<String, String> hashMap = new HashMap<>();
      String keyWeakHashMap = new String("KeyWeakHashMap");
      String keyHashMap = new String("KeyHashMap");
weakHM.put(keyWeakHashMap,"weakHash");
hashMap.put(keyHashMap,"hashMap");
keyWeakHashMap = null;
keyHashMap = null;
        System.out.println("before gc"+ "weak = "+ weakHM.get("KeyWeakHashMap")+" hash = "+hashMap.get("KeyHashMap"));
        System.gc();
        System.out.println("after gc"+ "weak = "+weakHM.get("KeyWeakHashMap")+" hash  = "+hashMap.get("KeyHashMap"));
    }
}
