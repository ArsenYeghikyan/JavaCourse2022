import java.util.EnumMap;
import java.util.Map;
import java.util.Set;

public class Simple2EnumMap {
    public static void main(String[] args) {
        Map<E,String> em = new EnumMap<E,String>(E.class);
        em.put(E.M,"March");
        em.put(E.A,"Apr");
        em.put(E.F,"Feb");
        em.put(E.J,"Jan");
        Set s = em.entrySet();
        for (Object o : s) {
            Map.Entry me = (Map.Entry) o;
            System.out.println(((Map.Entry) o).getKey()+" "+((Map.Entry) o).getValue());
        }

    }
}


enum E{
    J,F,M,A


}
