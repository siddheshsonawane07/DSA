package Sorting;
import java.util.Arrays;
//After sorting
//index = value - 1;
//because index value starts from 0




public class CyclicSort {
    public static void main(String[] args) {
        //the elements in the array should be continuous
        int [] arr = {3,5,2,1,4,6};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void cyclic(int[] arr) {
        int i = 0;
        while (i < arr.length){
            int correct = arr[i]-1;
            if(arr[i]!= arr[correct]){
                swap(arr, i, correct);
            }
            else {
                i++;
            }
        }
    }

    private static void swap(int[] arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
