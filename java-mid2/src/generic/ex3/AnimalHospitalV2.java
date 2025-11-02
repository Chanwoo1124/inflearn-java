package generic.ex3;



public class AnimalHospitalV2<T> {
    private T animal;

    public void set(T animal) {

        this.animal = animal;
    }

    public void checkup(){
//        T 의 타입을 메소드를 정의하는 시점에는 알수 없다 object의 기능만 사용
//        컴파일 오류 나는 이유 : 어떤 타입이 들어올지 모르기 때문에 그 타입의 메소드를 사용 할수가없음.
//        System.out.println("동물이름" + animal.getName());
//        System.out.println("동물사이즈" + animal.getSize());
//        animal.sound();
    }
//    public T bigger(T target) {
//
//        //return animal.getSize() > target.getSize() ? animal : target;
//
//    }
}

