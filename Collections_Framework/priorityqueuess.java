package Collections_Framework;

import java.util.Comparator;
import java.util.PriorityQueue;

public class priorityqueuess {

    public static void main(String[] args) {

        //implements a min heap data structure
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        //implements a max heap data structure
        //PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.offer(4);
        pq.offer(3);
        pq.offer(2);
        pq.offer(6);

        System.out.println(pq);

        //removes the smallest number and changes the tree order accordingly
        pq.poll();
        System.out.println(pq);

        //returns the element next in line
        System.out.println(pq.peek());
    }
}
