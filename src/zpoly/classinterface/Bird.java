package zpoly.classinterface;

public class Bird extends AbstractAnimal implements Fly{
    @Override
    void sound() {
        System.out.println("짹짹");
    }

    @Override
    public void fiy() {
        System.out.println("새가 남");
    }
}
