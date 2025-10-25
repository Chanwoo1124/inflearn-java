package lang.wrapper;

public class WrapperClassMain {
    static void main(String[] args) {
        Integer i = Integer.valueOf(10);
        Long l = Long.valueOf(100);
        Double v = Double.valueOf(0.5);

        System.out.println(i.intValue());
    }
}
