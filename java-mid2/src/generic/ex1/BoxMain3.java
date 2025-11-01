package generic.ex1;

public class BoxMain3 {
    public static void main(String[] args) {
        //제네릭은 객체생성시점에 타입을 정한뒤 그 타입만 넣을 수있음  타입 안전성과 코드 재활용성이 좋아짐
        GenericBox<Integer> integerBox = new GenericBox<Integer>();
        integerBox.set(10);

        //제네릭에서 값 반환받을 때 타입 캐스팅을 할 필요가 없음 ( 오브젝트로 할시 타입 캐스팅 해줘야함 )
        Integer i = integerBox.get();

        GenericBox<String> stringBox = new GenericBox<String>();
        stringBox.set("헬로");
        String s = stringBox.get();
        System.out.println(s);

        //타입추론 : 생성하는 제네릭 타입 생략 가능             - 여기 생략가능
        GenericBox<Integer> integBox2 = new GenericBox<>();
    }
}
