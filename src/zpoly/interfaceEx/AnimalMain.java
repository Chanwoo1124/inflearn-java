package zpoly.interfaceEx;



public class AnimalMain {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Cow cow = new Cow();
        Dog dog = new Dog();

        soundAnimal(cat);
        soundAnimal(cow);
        soundAnimal(dog);


    }

    private static void soundAnimal(InterfaceAnimal a) {
        System.out.println("동물 소리 테스트 시작");
        a.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}