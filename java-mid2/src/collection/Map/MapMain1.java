package collection.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMain1 {
    public static void main(String[] args) {
        Map<String,Integer> studentMap = new HashMap<>();

        studentMap.put("김영한", 90);
        studentMap.put("정우영", 80);
        studentMap.put("이찬우", 70);
        studentMap.put("ㅇㅇ", 60);
        studentMap.put("김영한", 90);

        System.out.println(studentMap );

        Set<Map.Entry<String, Integer>> entries = studentMap.entrySet();




        Set<String> studentkey = studentMap.keySet();
        for (String s : studentkey) {
            Integer i = studentMap.get(s);
            System.out.println("s =" +s + "i =" +i);
        }


    }
}
