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

    static void heapify(int[] heap, int size, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;


        if (left < size && heap[left] > heap[largest]) {
            largest = left;
        }

        if (right < size && heap[right] > heap[largest]) {
            largest = right;
        }

        if (largest != i) {
            int temp = heap[i];
            heap[i] = heap[largest];
            heap[largest] = temp;

            heapify(heap, size, i);
        }
    }

    static void buildheap(int[] heap, int size) {

        int startIndex = (size / 2) - 1;

        for (int i = startIndex; i >= 0; i--) {
            heapify(heap, size, i);
        }
    }

    static void print(int[] heap, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr = {1, 3, 5, 4, 6, 13, 10, 9, 8, 15, 17};
        int size = arr.length;
        buildheap(arr, size);
        print(arr, size);


    }
}
