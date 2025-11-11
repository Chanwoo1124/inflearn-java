package collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class HashStart {
    static final int CAPACTIY = 10;

    public static void main(String[] args) {
        // {1,2,5,8,14,99}
        LinkedList<Integer>[] buckets = new LinkedList[CAPACTIY];
        for (int i = 0; i < CAPACTIY; i++) {
            buckets[i] = new LinkedList<>();
        }
        System.out.println(Arrays.toString(buckets));
        add(buckets,1);
        add(buckets,2);
        add(buckets,5);
        add(buckets,8);
        add(buckets,14);
        add(buckets,99);
        add(buckets,9);
        System.out.println(Arrays.toString(buckets));

        //검색
        int serachValue = 9;

    }
    private static void add(LinkedList<Integer>[] buckets, int value){
        int hashIndex = hashIndex(value);
        LinkedList<Integer> bucket = buckets[hashIndex];
        if (!bucket.contains(value)){
            bucket.add(value);
        }
    }
    private static boolean contains(LinkedList<Integer>[] buckets,int serachValue){
        int hashIndex = hashIndex(serachValue);
        LinkedList<Integer> bucket = buckets[hashIndex];
        return bucket.contains(serachValue);
    }


    static int hashIndex(int value){
        return value % CAPACTIY;
    }
}
