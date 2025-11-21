package lambda.ex1;

import lambda.StringFunction;

import java.util.ArrayList;
import java.util.List;

public class MapExample {
    public static List<String> map(List<String> list, StringFunction func){
        ArrayList<String> arrayList = new ArrayList<>();
        for (String s : list) {
            String apply = func.apply(s);
            arrayList.add(apply);
        }return arrayList;
    }

    public static void main(String[] args) {
        List<String> wordes = List.of("hello","java","lambda");
        System.out.println("원본 리스트:" + wordes);

        List<String> map = map(wordes, s -> s.toUpperCase());
        List<String> map1 = map(wordes, s -> "***" + s + "***");
        System.out.println(map);
        System.out.println(map1);
    }
}
