package collection.Map.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CommonKeyValueSum1 {
    public static void main(String[] args) {
        Map<String,Integer> map1 = new HashMap<>(Map.of("A",1,"B",2,"c",3));

        Map<String,Integer> map2 = new HashMap<>(Map.of("B",2,"C",3,"F",5));


        Map<String,Integer> result = new HashMap<>();

        for(String key : map1.keySet()){
            if(map2.containsKey(key)){
                result.put(key,map1.get(key)+map2.get(key));
            }
        }
        System.out.println(result);


    }
}
