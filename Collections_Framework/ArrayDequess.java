package Collections_Framework;

import java.util.ArrayDeque;

public class ArrayDequess {
    public static void main(String[] args) {
        //queue where we can remove elements from front as well as rear
        //used in sliding window questions

        ArrayDeque<Integer> adq = new ArrayDeque<>();

        adq.offer(2);

        //adds element front
        adq.offerFirst(1);

        //adds element last
        adq.offerLast(3);

        adq.offerLast(4);

        System.out.println(adq);

        System.out.println(adq.peek() + " returns first front number");
        System.out.println(adq.peekLast() + " returns first rear number");

        //poll first and poll last are used to remove and delete accordingly

    }
}
