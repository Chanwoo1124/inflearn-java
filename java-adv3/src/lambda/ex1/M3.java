package lambda.ex1;

import lambda.MyPredicate;

import java.util.ArrayList;
import java.util.List;



public class M3 {
    public static List<Integer>filter(List<Integer> list, MyPredicate predicate){
        List<Integer> result = new ArrayList<>();
        for (int val: list){
            if(predicate.test(val)){
                result.add(val);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, -2, 3, 0, 5, -10, 7);
        System.out.println("원본 리스트:" + numbers);

        List<Integer> filter = filter(numbers, (i) -> i < 0 ? true : false);
        List<Integer> filter1 = filter(numbers, (i -> i % 2 == 0 ? true : false));
        System.out.println(filter);
        System.out.println(filter1);

    }

}