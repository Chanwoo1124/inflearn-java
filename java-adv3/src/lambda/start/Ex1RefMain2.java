package lambda.start;

import lambda.Procedure;

import java.util.Random;

public class Ex1RefMain2 {

    public static void hello(Procedure procedure){
        long startNs = System.nanoTime();

        procedure.run();

        long endNs = System.nanoTime();
        System.out.println("실행시간 =" + (endNs - startNs)+"Ns");
    }

    public static void main(String[] args) {


        hello(()-> {
                int randamValue = new Random().nextInt(6)+1;
                System.out.println("주사위 =" + randamValue);
            });
        hello(() -> {
                for (int i = 1; i <= 3; i++) {
                    System.out.println("i =" + i);
                }
            });
    }

}
