package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        //also known as sinking sort and exchange sort.
        //space complexity = O(1) no extra space required ie copying the array not required
        //time complexity:
        //best case : O(n) = sorted
        //worst case: O(n*n) = array is sorted in descending

        int [] arr = {5,4,2,4,8,4};
        bubble_sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble_sort(int[] arr){
        //run the steps (n-1) times

        boolean swapped;

        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            //for each step, max item will come at the last respective index
            for (int j = 1; j < arr.length - i; j++) {
                //swap if the item is smaller than the previous item
                if(arr[j] < arr[j-1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            //if u did not swap for a particular value of i, it means that the array is sorted and hence stop the program
            if(swapped==false){
                break;
            }
        }
    }
}
