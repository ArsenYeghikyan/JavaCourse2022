import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

public class SimpleIdentityHashMap {
    public static void main(String[] args) {
        IdentityHashMap<Integer,String> map = new IdentityHashMap<>();
        map.put(new Integer(2),"one");
        map.put(new Integer(2),"3");
        map.put(new Integer(2),"4");
        map.put(new Integer(2),"5");
        map.put(new Integer(2),"6");
        map.put(new Integer(2),"7");
        Set set = map.entrySet();
        for (Object o : set) {
            Map.Entry entry = (Map.Entry) o;
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        HashMap<Integer,String> hmap = new HashMap<>();
        hmap.put(new Integer(2),"one");
        hmap.put(new Integer(2),"3");
        hmap.put(new Integer(2),"4");
        hmap.put(new Integer(2),"5");
        hmap.put(new Integer(2),"6");
        hmap.put(new Integer(2),"7");
        Set set1 = hmap.entrySet();
        for (Object o : set1) {
            Map.Entry entry = (Map.Entry) o;
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
