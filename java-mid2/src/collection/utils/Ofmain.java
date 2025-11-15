package collection.utils;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Ofmain {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3);
        Set<Integer> set = Set.of(1, 2, 3, 4);
        Map<Integer, String> integerStringMap = Map.of(1, "one", 2, "two");

        System.out.println(list);
        System.out.println(set);
        System.out.println(integerStringMap);




    }
}
