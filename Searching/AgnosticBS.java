package Searching;

public class AgnosticBS {
    public static void main(String[] args) {
        //if we dont know that array is sorted in ascending or descending, we use AgnosticBS
        int[] arr = {-5, -4, -2, 0, 2, 3, 4, 6, 9, 10, 14, 28, 65, 99, 105, 108, 110};
        int target = -5;
        int ans = AgnosticBS(arr, target);
        System.out.println(ans);
    }

    static int AgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return  -1;
    }
}

