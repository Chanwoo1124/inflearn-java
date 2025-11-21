package lambda.ex1;

import lambda.Myfunction;

public class M2 {
    public static void main(String[] args) {
        Myfunction add = getOperation("add");
        int addd = add.apply(1, 3);
        System.out.println(addd);
    }
    static Myfunction getOperation(String operater){
        switch (operater){
            case "add":
                return (a,b) -> a+b;
          case "sub":
                return (a,b) -> a-b;
            default:
                return (a,b) -> 0;

        }
    }
}
