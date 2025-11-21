package lambda.lambda2;

import lambda.MyPredicate;
import lambda.Myfunction;

import java.util.ArrayList;
import java.util.List;

public class LambdaPassMain3 {
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
        List<Integer> numbers = List.of(1, -2, 3, 0, 5, 10, 7);
        System.out.println("원본 리스트:" + numbers);

        filter(numbers,(i)-> i > 0? true:false);
        filter(numbers,(i -> i % 2 == 0? true:false));

    }


}

