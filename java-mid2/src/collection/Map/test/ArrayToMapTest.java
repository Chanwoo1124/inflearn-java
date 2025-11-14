package collection.Map.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrayToMapTest {
    public static void main(String[] args) {
        String[][] prodeuctArr = {{"Java","10000"},{"Spring","20000"},{"JPA","30000"}};

        Map<String,Integer> mapPro = new HashMap<>();

        for (String[] strings : prodeuctArr) {
            mapPro.put(strings[0],Integer.valueOf(strings[1]));
        }
        System.out.println(mapPro);




    }
}
