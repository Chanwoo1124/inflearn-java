package collection.array;

import java.util.Arrays;

public class ArrayMain1 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        //index 입력:
        System.out.println("== index 입력:" );
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;

        System.out.println(Arrays.toString(arr));

        System.out.println("첫번째 위치에 3 추가");
        int newValue = 3;
        addFirst(arr, newValue);
        System.out.println(Arrays.toString(arr));

        System.out.println("index 위치에 값 추가");
        int index = 2;
        int value = 4;
        addAtIndex(arr,index,value);

    }

    private static void addAtIndex(int[] arr, int index, int value) {
        for (int i = arr.length -1 ; i < index ; i--) {
            arr[i] = arr[i - 1];

        }
        arr[index] = value;

    }

    private static void addFirst(int[] arr, int newValue) {
        for (int i  = arr.length -1 ; i > 0 ; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = newValue;
    }
}

