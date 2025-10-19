package zpoly.ex1;

import java.util.List;

public class AnimalSoundMain {
    public static void main(String[] args) {
        Animal[] animals = {new Dog(), new Cow(), };

        for (Animal a : animals){
            soundAnimal(a);
        }




    }

    private static void soundAnimal(Animal a) {
        System.out.println("동물 소리 테스트 시작");
        a.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
