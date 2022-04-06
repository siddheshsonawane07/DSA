package Collections_Framework;

import java.util.LinkedList;
import java.util.Queue;

//first in first out

public class queues {
    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);

        System.out.println(queue);

        //deletes and returns first value
        System.out.println(queue.poll());

        //returns the first value
        System.out.println(queue.peek());
    }
}
