package Bit_Manipulation;
/*
1) 5 ^ 5 = 0
2) 0 ^ n = n

Find the two non-repeating element in an array where every element repeats twice

a = [5,4,1,4,3,5,1,2]

Dry run
int res = 0
res = 0 ^ 5
res = 5 ^ 4 ^ 1 ^ 4
res = 5 ^ 1 ^ 3 ^ 2
res = 5 ^ 1 ^ 3 ^ 5 ^ 2
res = 1 ^ 3 ^ 1 ^ 2
res = 3 ^ 2

*/

public class que_3 {
    public static void UniqueNumbers2(int[] arr, int n)
    {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = (sum ^ arr[i]);
        }

        // Bitwise & the sum with it's 2's Complement
        // Bitwise & will give us the sum contain in only the rightmost set bit
        sum = (sum & -sum);

        // sum1 and sum2 will contain 2 unique elements, elements initialized with 0 box number xored with 0 is number itself
        int sum1 = 0;
        int sum2 = 0;

        // traversing the array again
        for (int i = 0; i < arr.length; i++) {

            // Bitwise & the arr[i] with the sum
            // Two possibilities either result == 0
            // or result > 0
            if ((arr[i] & sum) > 0) {

                // if result > 0 then arr[i] xored
                // with the sum1
                sum1 = (sum1 ^ arr[i]);
            }
            else {
                // if result == 0 then arr[i]
                // xored with sum2
                sum2 = (sum2 ^ arr[i]);
            }
        }

        System.out.println("The non-repeating elements are " + sum1 + " and " + sum2);
    }
    public static void main(String[] args) {
        int[] arr = new int[] { 2, 3, 7, 9, 11, 2, 3, 11 };
        int n = arr.length;
        UniqueNumbers2(arr, n);

    }
}
