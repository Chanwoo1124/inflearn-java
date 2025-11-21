package lambda.ex1;

import lambda.Procedure;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class M1Before {
    static void measuer(Procedure procedure) {
        long start = System.currentTimeMillis();
        procedure.run();
        long end = System.currentTimeMillis();

        System.out.println(end - start);
    }


    public static void main(String[] args) {
        measuer(() -> {
            int N = 100;
            long sum = 0;
            for (int i = 0; i < N; i++) {
                sum += i;
            }
            System.out.println("[1부터 " + N + "까지의 합] 결과:" + sum);
        });

        measuer(() -> {
            int[] arr = {4, 3, 2, 1};
            System.out.println(Arrays.toString(arr));
            Arrays.sort(arr);
            System.out.println(Arrays.toString(arr));
        });


    }
}

