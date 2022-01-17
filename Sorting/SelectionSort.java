package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        //searching for lowest number in the array and swapping it with the first element
        //or searching for largest number in the array and swapping it with the last element
        int [] arr = {8,7,6,4,5,1,0,2};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selection(int[] arr){
        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++){
                if (arr[j] > arr[index]){
                    index = j;  //searching for lowest index
                }
            }
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
    }

}

