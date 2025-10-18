package zfinal1;

public class FinalLocalMain {
    public static void main(String[] args) {

        final int data1;
        data1 = 10;
        /*data1 = 20;*/     //파이널 변수는 최초 한번만 할당 가능
        method(10);
    }
    static void method(final int s){
        /*s = 20;  */   //매소드 내부에서 매개변수의 값을 변경 할 수 없다. 매개변수에 final이 붙을시
    }
}
