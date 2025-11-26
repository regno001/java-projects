package in.regno.exception.Collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTEsting {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
         q.add(1);
         q.offer(2);

         utility.print(q);
        System.out.println(q.peek());
        System.out.println(q.element());
        System.out.println(q.peek());
        System.out.println(q.remove());
        utility.print(q);
        System.out.println(q.poll());

        System.out.println(q.peek());
    }
}

