package collection.set;

public class JavaHashCodeMain {
    public static void main(String[] args) {
        Object o1 = new Object();
        Object o2 = new Object();
        System.out.println("o1 = " + o1.hashCode());
        System.out.println("o2 = " + o2.hashCode());

        //각 클래스마다 hashCode를 이미 오버라이딩 해두었다

    }
}
