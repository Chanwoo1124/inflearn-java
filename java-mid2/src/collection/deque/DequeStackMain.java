package collection.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeStackMain {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.push(1);
        deque.push(2);
        deque.push(3);
        System.out.println(deque);

        Integer pop1 = deque.pop();
        Integer pop2 = deque.pop();
        Integer pop3 = deque.pop();
        System.out.println(deque);

        deque.offer(1);
        deque.offer(2);
        deque.offer(3);

        System.out.println(deque);

        Integer poll = deque.poll();
        Integer poll2 = deque.poll();
        Integer poll3 = deque.poll();

        System.out.println(deque);

    }
}
