package Sorting;
import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int [] arr = {5,4,3,2,1};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
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

public static swap(int [] arr, int a, int b){
  int temp = arr[a];
  arr[a] = arr[b];
  arr[b] = temp;
}

public static int partition(int [] arr, int s, int e){

  int pivot = arr[s];

  int count = 0;

  for(int i = s+1; s<=e; i++){
      if(arr[i] <= pivot{
        count++;
      }
  }

  int pivotIndex = s + count;
  swap(arr, pivotIndex, s);
  int i = s, j = e;

  while(i<pivotIndex && j>pivotIndex){

    while(arr[i] < pivot){
      i++;
    }
    while(arr[j] < pivot){
      j--;
    }

    if(i<pivotIndex && j>pivotIndex){
      swap(arr, i, j);
      i++;
      j--;
  }
}
}
