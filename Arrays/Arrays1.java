package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays1 {
    public static void main(String[] args) {
        //DSA ARRAYS
        // syntax
        // datatype[] variable_name = new datatype[size];

        //int[] rnos = new int[5];

        // the datatypes of all the elements in the array should be same.
        // new is used to create an object
        //int[] ros; //declaration of array. ros is getting defined in the stack
        //ros = new int[5]; //initialisation: actually here object is being created in the memory (heap)

        //Dynamic memory allocation: at the runtime, memory is allocated.d
        //direct array
        //int [] arr = {1,2,3,4,5,6}
        //java does not have continuous memory locations
        //primitive datatypes cannot be broken into smaller datatypes

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
     /*
        for (int row = 0; row < arr.length; row++) {
            //for each column in every row
            for (int column = 0; column < arr[row].length; column++) {
                System.out.print(arr[row][column] + "");
            }
            System.out.println();
        }
        */

        //output in to String method

        /*
        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }

        */
        //enhanced for loop

        for(int[] a : arr){
            System.out.println(Arrays.toString(a));

        }
    }
}
