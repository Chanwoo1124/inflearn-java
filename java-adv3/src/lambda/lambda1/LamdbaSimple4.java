package lambda.lambda1;

public class LamdbaSimple4 {
    public static void main(String[] args) {
        MyCall myCall = value -> value * 2;
        int call = myCall.call(5);
        System.out.println(call);

    }
    interface MyCall{
        int call(int value);
    }
}
