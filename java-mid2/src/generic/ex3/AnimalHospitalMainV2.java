package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV2 {
    public static void main(String[] args) {
        AnimalHospitalV2<Dog> dogHospital = new AnimalHospitalV2<>();
        AnimalHospitalV1 catHospital = new AnimalHospitalV1();

        Dog dog = new Dog("멍멍이! ", 100);
        Cat cat = new Cat("야옹이! ", 300);

        //개 병원
        dogHospital.set(dog);
        dogHospital.checkup();

        //고양이 병원
        catHospital.set(cat);
        catHospital.checkup();

        //문제1 : 개 병원에 고양이 전달
        //dogHospital.set(cat);  //다른 타입 입력: 컴파일 오류

        //문제 2 : 개 타입 반환
         //Dog  bigger= (Dog) dogHospital.bigger(new Dog("멍멍이2", 200));




    }
}
