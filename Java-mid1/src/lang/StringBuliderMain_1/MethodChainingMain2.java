package lang.StringBuliderMain_1;

public class MethodChainingMain2 {
    static void main(String[] args) {
        ValueAdder adder = new ValueAdder();
        adder.add(1);
        adder.add(2);
        adder.add(3);
        int result = adder.getValue();
        System.out.println("result =" + result);

        


    }

}
