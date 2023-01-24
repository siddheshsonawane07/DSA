

package Arrays;

import java.util.*;

public class Arrays1 {
    public static void main(String[] args) {
        //DSA ARRAYS
        // syntax
        // datatype[] variable_name = new datatype[size];

        int[] arr = {6 ,5, 4, 3, 2, 1};

        //find minimum and max in array

        //approach 1
        Arrays.sort(arr);
        int min = arr[0];
        int max = arr[arr.length - 1];
        System.out.println("minimum number is " + min);
        System.out.println("maximum number is " + max);

        // the data types of all the elements in the array should be same.
        // new is used to create an object and allocate the memory in the heap
        //int[] ros; //declaration of array. ros is a variable and is getting defined in the stack
        //ros = new int[5]; //initialisation: actually here object is being created in the memory (heap)
        //if we just declared an empty array without declaration then the value is automatically set to null;

        //Dynamic memory allocation: at the runtime, memory is allocated
        //direct array
        //int [] arr = {1,2,3,4,5,6}
        //java does not have continuous memory locations
        //primitive data types cannot be broken into smaller data type


    }
}
