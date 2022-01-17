package Searching;

public class BinarySearch {
    public static void main(String[] args) {
        //array must be sorted
        //ascending array
        int [] arr = {-5,-4,-2,0,2,3,4,6,9,10,14,28,65,99,105,108,110};
        int target = 110;
        int ans = AscendingBS(arr, target);
        System.out.println("Ascending: "+ans);

        //descending array
        int [] arr1 = {110,108,105,99,65,28,14,10,9,6,4,3,2,0,-2,-4,-5};
        int target1 = -4;
        int ans1 = DescendingBS(arr1, target1);
        System.out.println("Descending: "+ans1);
    }

    static int AscendingBS(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end){

            int mid = start + (end - start) / 2;

        if(target < arr[mid]){
            end = mid -1;
        }
        else if (target > arr[mid]){
            start = mid + 1;
        }
        else{
            return mid;
        }
    }
        return -1;
    }

    static int DescendingBS(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end){

            int mid = start + (end - start) / 2;

            if(target < arr[mid]){
                start = mid + 1;
            }
            else if (target > arr[mid]){
                end = mid - 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
