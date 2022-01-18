package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDimensionalArrays {
    public static void main(String[] args) {
        /*
           1 2 3
           4 5 6
           7 8 9
           Multidimensional Arrays

           2_D Array

           the first "[]" shows rows and the second bracket shows columns

           int[][] = new int [3][3];

           int[][] arr2D = {
                {1,2,3} //0th index
                {4,5} //1st index
                {6,7,8,9} //2nd index -> arr2D[2] = {6,7,8,9}
           }

           memory consumption = rows X columns X data types
        */

        Scanner in = new Scanner(System.in);

        int[][] arr = new int[3][3];

        //           input in 2D array

        for (int row = 0; row < arr.length; row++) {
            //for each column in every row
            for (int column = 0; column < arr[row].length; column++) {
                arr[row][column] = in.nextInt();
            }
        }

        //         output in 2D array


        for (int row = 0; row < arr.length; row++) {
            //for each column in every row
            for (int column = 0; column < arr[row].length; column++) {
                System.out.print(arr[row][column] + "");
            }
            System.out.println();
        }


        //output in to String method

        /*
        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }
        */

        //enhanced for loop
//        for(int[] a : arr){
//            System.out.println(Arrays.toString(a));
//
//        }
    }
}
