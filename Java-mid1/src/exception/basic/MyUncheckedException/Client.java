package exception.basic.MyUncheckedException;

public class Client {
    public void call() {
        throw new MyUncheckedException("ex");
    }
}
