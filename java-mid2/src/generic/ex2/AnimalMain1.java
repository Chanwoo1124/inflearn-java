package generic.ex2;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalMain1 {
    public static void main(String[] args) {
        Animal 동물 = new Animal("동물", 10);
        Dog 개 = new Dog("개", 5);
        Cat 고양이 = new Cat("고양이", 4);

        Box<Animal> animalBox = new Box<>();
        animalBox.set(개);
        animalBox.set(고양이);

        Animal value = animalBox.getValue();
        System.out.println(value);
    }
}
