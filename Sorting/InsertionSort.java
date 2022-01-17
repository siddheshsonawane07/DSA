package Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int [] arr = {8,7,6,4,5,1,0,2};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertion(int [] array){
        int n = array.length;

        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;


            while (j>=0 && array[j]>key){
                array[j + 1] = array[j];
                j = j - 1;
            }
         array[j+1]= key;
        }
    }
}


