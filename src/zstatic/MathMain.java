package zstatic;


import static zstatic.MathArrayUtils.*;

public class MathMain {
    public static void main(String[] args) {
        int[] values ={1,2,3,4,5};
        System.out.println(sum(values));
        System.out.println(average(values));
        System.out.println(min(values));
        System.out.println(max(values));

    }
}
