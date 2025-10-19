package zpoly.classinterface;

public class Chicken extends AbstractAnimal implements Fly{
    @Override
    public void fiy() {
        System.out.println("닭이남");
    }

    @Override
    void sound() {
        System.out.println("꼬기오");

    }
}
