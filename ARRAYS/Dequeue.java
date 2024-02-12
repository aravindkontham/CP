package CP.ARRAYS;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Dequeue {
    public static void main(String[] args) {
        Deque<Integer> dq=new ArrayDeque();
        dq.offer(12);
        dq.offer(13);
        dq.offer(10);
        System.out.println(dq.peek());
        System.out.println(dq.peekLast());

        System.out.println(dq.poll());
        System.out.println(dq.pollLast());


    }
}
