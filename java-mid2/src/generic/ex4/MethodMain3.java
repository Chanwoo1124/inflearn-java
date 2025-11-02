package generic.ex4;

import generic.animal.Cat;
import generic.animal.Dog;
import generic.test.ex1.Container;

public class MethodMain3 {
    public static void main(String[] args) {
        Dog dog = new Dog("멍멍이 ", 100);
        Cat cat = new Cat("야옹이 ", 50);

        ComplexBox<Dog> hospital = new ComplexBox<>();
        hospital.setAnimal(dog);

        Cat cat1 = hospital.printAndReturn(cat);
        System.out.println(cat1);

    }
}
