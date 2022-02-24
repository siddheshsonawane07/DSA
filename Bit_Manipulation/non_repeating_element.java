package Bit_Manipulation;

/*
1) 5 ^ 5 = 0
2) 0 ^ n = n

Find the only non-repeating element in an array where every element repeats twice

a = [5,4,1,4,3,5,1]
Dry run
int res = 0
res = 0 ^ 5
res = 5 ^ 4 ^ 1 ^ 4
res = 5 ^ 1 ^ 3
res = 5 ^ 1 ^ 3 ^ 5
res = 1 ^ 3 ^ 1
res = 3

*/

import java.util.Scanner;

public class non_repeating_element {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int[] a = {5,4,4,1,3,5,1};
        int result = 0;
        for (int i = 0; i < a.length; i++) {
            result ^= a[i];
        }
        System.out.println(result);
    }
}
