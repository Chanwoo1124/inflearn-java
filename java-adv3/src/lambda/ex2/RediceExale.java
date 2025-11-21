package lambda.ex2;

import java.util.List;

public class RediceExale {
    public static int reduce(List<Integer> list,  int initial, MyReducer reducer){
        int result = initial;
        for (Integer i : list) {
            reducer.reduce(result, i);

        }

        return result;
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4);
        System.out.println("원본 리스트:" + numbers);

        int reduce = reduce(numbers, 0, (a, b) -> a + b);
        System.out.println(reduce);


    }



}
