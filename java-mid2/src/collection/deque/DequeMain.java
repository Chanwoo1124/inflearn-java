package collection.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeMain {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();

        deque.offerFirst(1);
        deque.offerFirst(2);
        deque.offerFirst(3);
        System.out.println(deque);
        deque.offerLast(5);
        System.out.println(deque);
        Integer first = deque.getFirst();
        System.out.println(first);
        System.out.println(deque);

        //다음 꺼낼 데이터 확인
        System.out.println(deque.peekFirst());

        Integer i = deque.pollFirst();
        System.out.println(i);
        System.out.println(deque);


    }

}
