package collection.utils;

import java.util.ArrayList;
import java.util.List;

public class immutableMain {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3);

        ArrayList<Integer> mutableList = new ArrayList<>(list);


    }
}
