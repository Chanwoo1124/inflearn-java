package generic.ex4;

import generic.animal.Animal;

public class AnimalMethod {
    public static <T extends Animal> T checkup(T t) {
//        T 의 타입을 메소드를 정의하는 시점에는 알수 없다 object의 기능만 사용
//        컴파일 오류 나는 이유 : 어떤 타입이 들어올지 모르기 때문에 그 타입의 메소드를 사용 할수가없음.
        System.out.println("동물이름" + t.getName());
        System.out.println("동물사이즈" + t.getSize());
        t.sound();
        return t;
    }

    public static <T extends Animal> T bigger(T t1, T t2) {

        return t1.getSize() > t2.getSize() ? t1 : t2;
    }
}