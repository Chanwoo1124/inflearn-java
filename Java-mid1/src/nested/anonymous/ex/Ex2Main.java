package nested.anonymous.ex;

import java.util.Random;

public class Ex2Main {
    public static void hello(Process p){
        System.out.println("프로그램 시작 ");

        p.run();


        System.out.println("프로그램 종료 ");
    }

    public static void main(String[] args) {
        Process process = new Process() {
            @Override
            public void run() {
                int randomValue = new Random().nextInt(6) + 1;
                System.out.println("주사위=" + randomValue);
            }
        };
        Process process1 = new Process() {
            @Override
            public void run() {
                for (int i = 0; i < 3; i++) {
                    System.out.println("i = " + i);
                }
            }
        };
        hello(process1);


    }

}
