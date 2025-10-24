package zpoly.classinterface;



public class AnimalMain {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Dog dog = new Dog();
        Chicken chicken = new Chicken();

        soundAnimal(dog);
        flyAnimal(chicken);


    }
    private static void soundAnimal(AbstractAnimal a) {
        System.out.println("동물 소리 테스트 시작");
        a.sound();
        System.out.println("동물 소리 테스트 종료");
    }

    private static void flyAnimal(Fly fiy){
        fiy.fiy();
    }
}
