package Sorting;
import java.util.Arrays;


class QuickSort {
    public static void main(String[] args) {
        int [] arr = {7,6,4,2, 2,1,-4};
        quickSort(arr,0,arr.length-1);
        for(int element: arr){
            System.out.print(element + " ");
        }
    }
    
    
public static void quickSort(int [] arr, int s, int e){
  if(s>=e){
    return;
  }

  int p = partition(arr, s, e);
  quickSort(arr, s, p-1);
  quickSort(arr, p+1, e);

}

public static int partition(int [] arr, int s, int e){

  int pivot = arr[s];

  int count = 0;

  for(int i = s; i<=e; i++){
      if(arr[i] <= pivot){
        count++;
      }
  }

  int pivotIndex = s + count - 1;
  swap(arr, pivotIndex, s);
  int i = s, j = e;

  while(i<pivotIndex && j>pivotIndex){

    while(arr[i] <= pivot){
      i++;
    }
    while(arr[j] > pivot){
      j--;
    }

    if(i<pivotIndex && j>pivotIndex){
      swap(arr, i, j);
      i++;
      j--;
    }
  }
   return pivotIndex;
 }
 
 public static void swap(int [] arr, int a, int b){
  int temp = arr[a];
  arr[a] = arr[b];
  arr[b] = temp;
}
}
