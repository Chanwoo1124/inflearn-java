package collection.set.test;

import java.util.*;

public class UniqueNamesTest1 {
    public static void main(String[] args) {
        Integer[] inputArr = {30,20,20,10,10};
        List<Integer> list = List.of(inputArr);
        Set<Integer> treeSet = new TreeSet<>(list);
        System.out.println("integers = " + treeSet);


    }
}
