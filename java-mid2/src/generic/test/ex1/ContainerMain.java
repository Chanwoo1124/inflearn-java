package generic.test.ex1;

public class ContainerMain {
    public static void main(String[] args) {
        Container<String> stringContainer = new Container<>();
        System.out.println(stringContainer.isEmpty());

        stringContainer.setValue("안녕");

        System.out.println(stringContainer.getValue());
        System.out.println(stringContainer.isEmpty());

        Container<Integer> integerContainer = new Container<>();
        integerContainer.setValue(10);
        System.out.println(integerContainer.getValue());


    }
}