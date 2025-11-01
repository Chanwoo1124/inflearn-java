package generic.test.ex1;

public class Container<T> {
    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public boolean isEmpty(){
        return value == null;
    }
}
