package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        // searching for the smallest number in the array and swapping it with the first element
        int[] arr = {8, 7, 6, 4, 5, 1, 0, 2};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selection(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            // searching for the smallest index (ascending order)
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[index]) {
                    index = j;
                }
            }
            // swapping the found smallest element with the current element at index i
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
    }
}
