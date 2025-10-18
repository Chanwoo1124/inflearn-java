package zstatic;

public class MathArrayUtils {

    //생성자를 프라이빗으로 선언하면 인스턴스 생성을 막을 수가 있다
    private MathArrayUtils() {

    }

    static int sum(int[] array){
        int i = 0;

        for (int a : array){
            i += a;
        }
        return i;
    }

    static int average(int[] array) {
        int i = 0;
        int result = 0;
        for (int r = 0; r < array.length;r++){
            i += array[r];
            result++;
        }return i / result;
    }
    static int min(int[] array) {
        int i = array[0];
        for(int a : array){
            if (i > a){
                i = a;
            }
        }
        return i;
    }
    static int max(int[] array) {
        int i = array[0];
        for (int a : array){
            if (i < a){
                i = a;
            }
        }
        return i;
    }
}
