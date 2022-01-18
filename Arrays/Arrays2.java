package Arrays;

import java.util.Arrays;

public class Arrays2 {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3, 4, 5},
                {5, 6},
                {7, 8, 9}
        };

        /*
        //normal loop input
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                System.out.println(arr[row][column]+"");
            }
        }
         */
        //enhanced for loop output
        for (int[] a : array) {
            System.out.println(Arrays.toString(a));

        }
    }
}