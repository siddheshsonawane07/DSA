package Heap;

import java.util.ArrayList;

public class heap {

    /*
        heap : a complete binary tree that satisfies heap's property
        max heap's property: the children nodes are smaller than root
        min heap's property: the children nodes are greater than root
         in the last level of complete binary tree, preference must be given to left side

        heap is created to represent it as array
        if the current node's index is i, then to calculate:
        parent's index = (i/2)
        left child = 2 * i
        right child = 2 * i + 1
        height of the tree is logn
    */

    void heapify(ArrayList<Integer> heap, int i) {
        int size = heap.size();
        int left = 2 * i;
        int right = (2 * i) + 1;
        int largest = i;

        if (left < size && heap.get(left) > heap.get(right)) {

        }

    }

    public static void main(String[] args) {

    }
}
