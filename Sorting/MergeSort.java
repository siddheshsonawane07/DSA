package Sorting;


import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int [] arr = {5,4,3,2,1};
        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void merge(int[] arr, int low, int mid, int high)
    {
        // Find sizes of two sub arrays to be merged
        int n1 = mid - low + 1;
        int n2 = high - mid;

        /* Create temp arrays */
        int[] Left = new int[n1];
        int[] Right = new int[n2];

        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            Left[i] = arr[low + i];
        for (int j = 0; j < n2; ++j)
            Right[j] = arr[mid + 1 + j];

        /* Merge the temp arrays */

        // Initial indexes of first and second sub arrays
        int i = 0, j = 0;

        // Initial index of merged sub array array
        int k = low;
        while (i < n1 && j < n2) {
            if (Left[i] <= Right[j]) {
                arr[k] = Left[i];
                i++;
            }
            else {
                arr[k] = Right[j];
                j++;
            }
            k++;
        }

      // Copy remaining elements of L[] if any
        while (i < n1) {
            arr[k] = Left[i];
            i++;
            k++;
        }

        // Copy remaining elements of R[] if any
        while (j < n2) {
            arr[k] = Right[j];
            j++;
            k++;
        }
    }

    static void mergeSort(int [] arr, int low, int high){

        if(low<high) {
            int mid = low + (high - low) / 2;
            mergeSort(arr,low, mid);
            mergeSort(arr,mid + 1, high);

            merge(arr,low,mid,high);
        }
    }

//    static int [] merge(int[] first, int [] second){
//
//        int [] mix = new int[first.length + second.length];
//
//        int i = 0;
//        int j = 0;
//        int k = 0;
//
//        while(i< first.length && j < second.length){
//            if(first[i]<second[j]){
//                mix[k] = first[i];
//                i++;
//            }
//            else{
//                mix[k] = second[j];
//                j++;
//            }
//            k++;
//        }
//
//        //it may be possible that length of both arrays are not same
//        while (i< first.length){
//            mix[k] = first[i];
//            i++;
//            k++;
//        }
//
//        while (j< second.length){
//            mix[k] = second[j];
//            j++;
//            k++;
//        }
//        return mix;
//    }
}
