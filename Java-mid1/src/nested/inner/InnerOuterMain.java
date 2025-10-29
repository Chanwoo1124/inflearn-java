package nested.inner;

public class InnerOuterMain {
    public static void main(String[] args) {
        InnerOuter Outer = new InnerOuter();
        //Inner 클래스는 Outer클래스의 인스턴스변수에 접근 하기 위해서는 Outer클래스의 참조값을 알아야하기 때문에 이렇게 객체 생성함. (OuterClass 부터 객체 생성후 만듬)
        InnerOuter.Inner inner1 = Outer.new Inner();
        inner1.print();

        System.out.println("inner1 = " + inner1.getClass());
    }
}
