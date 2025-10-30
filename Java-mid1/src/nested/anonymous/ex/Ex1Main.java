package nested.anonymous.ex;

import java.util.Random;

public class Ex1Main {
    public static void hello(Process p){
        System.out.println("프로그램 시작 ");

        p.run();


        System.out.println("프로그램 종료 ");
    }

    public static void main(String[] args) {
        Random1 random1 = new Random1();
        Sum1 sum1 = new Sum1();
        hello(random1);
        hello(sum1);

    }
}
class Random1 implements Process{
    @Override
    public void run() {
        int randomValue = new Random().nextInt(6)+1;
        System.out.println("주사위=" + randomValue);
    }
}
class Sum1 implements Process {
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("i = " + i);
        }
    }
}