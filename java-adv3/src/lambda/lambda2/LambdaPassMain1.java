package lambda.lambda2;

import lambda.Myfunction;

public class LambdaPassMain1 {
    public static void main(String[] args) {
        Myfunction add = (a,b) -> a+b;
        Myfunction sub = (a,b) -> a-b;

        Myfunction cal = add;
        System.out.println(cal.apply(1,2));

        cal = sub;
        System.out.println(cal.apply(3,2));

    }
}
