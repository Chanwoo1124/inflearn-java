package generic.test.ex2;

public class PairTestGeneric<T,S> {
    private T integer;
    private S string;

    public void setFirst(T integer) {
        this.integer = integer;
    }

    public void setSecond(S string) {
        this.string = string;
    }

    public T getFirst() {
        return integer;
    }

    public S getSecond() {
        return string;
    }

    @Override
    public String toString() {
        return "PairTestGeneric{" +
                "integer=" + integer +
                ", string=" + string +
                '}';
    }
}
