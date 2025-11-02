package generic.ex4;

public class MethodMain1 {
    public static void main(String[] args) {
        Integer i = 10;
        Object i1 = GenericMethod.objectMethod(i);

        System.out.println("명시적 타입 인자 전달");
        Integer i2 = GenericMethod.<Integer>genericMethod(i);
        GenericMethod.<Integer>numberMethod(10);
        GenericMethod.<Double>numberMethod(20.0);



    }
}
