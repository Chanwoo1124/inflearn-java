package nested.nested.local;

public class LocalOuterV1 {
    //멤버변수
    private int outInstanceVar = 3;
    //메소드
    public void process(int paramaVar){
        //지역변수
        int lovalVal = 1;
        //지역클래스
        class LocalPrinter{

            int value = 0;

            public void printData(){
                System.out.println("value = " + value);
                System.out.println("lovalVal = " + lovalVal);
                System.out.println("paramaVar = " + paramaVar);
                System.out.println("outInstanceVar = " + outInstanceVar);

            }
        }
        LocalPrinter localPrinter = new LocalPrinter();
        localPrinter.printData();
    }

    public static void main(String[] args) {
        LocalOuterV1 localOuterV1 = new LocalOuterV1();
        localOuterV1.process(2);
    }
}
