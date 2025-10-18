package zstatic;

public class StaticMethodMain {
    public static void main(String[] args) {
        String s = "d";
        String result = StaticMethod1.doco(s);
        System.out.println(result);
    }
}
