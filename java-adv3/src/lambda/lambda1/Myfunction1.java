package lambda.lambda1;

import lambda.Myfunction;

public class Myfunction1 {
    public static void main(String[] args) {
        Myfunction myfunction = (a, b) -> a+b;

        int result = myfunction.apply(1, 2);
        System.out.println(result
        );
    }
}
