package generic.ex4;

import generic.animal.Cat;
import generic.animal.Dog;

public class MethodMain2 {
    public static void main(String[] args) {
        Dog 멍멍이 = AnimalMethod.checkup(new Dog("멍멍이", 100));
        Cat 야옹이 = AnimalMethod.checkup(new Cat("야옹이", 300));

        Dog 큰_멍멍이 = new Dog("큰 멍멍이", 300);
        Dog bigger = AnimalMethod.bigger(멍멍이, 큰_멍멍이);
        System.out.println(bigger);
    }
}
