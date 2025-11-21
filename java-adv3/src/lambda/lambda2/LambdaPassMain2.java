package lambda.lambda2;

import lambda.Myfunction;

public class LambdaPassMain2 {
    public static void main(String[] args) {
        Myfunction sub =  (a,b) -> a - b;

        System.out.println("변수를 통해 전달");
        calulate((a, b) -> a + b);
        calulate(sub);


    }
    static void calulate(Myfunction myfunction){
        int a = 1;
        int b = 2;
        System.out.println("계산 시작");
        int apply = myfunction.apply(a, b);
        System.out.println(apply);

    }
}
