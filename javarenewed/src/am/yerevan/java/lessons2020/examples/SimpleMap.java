package am.yerevan.java.lessons2020.examples;

import java.util.HashMap;
import java.util.Map;

public class SimpleMap {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("World",1);
        System.out.println(map.size());
        map.put("World1",2);
        System.out.println(map.size());
        map.put("World2",3);
        System.out.println(map.size());
        System.out.println(map);
        for ( Map.Entry<String,Integer> tmp: map.entrySet()
             ) {
            System.out.println(tmp.getKey()+" "+tmp.getValue());
        }



    }
}
