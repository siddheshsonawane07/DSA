package Collections_Framework;

import java.util.Arrays;

public class Arrayss {
    public static void main(String[] args) {
        //traditional array
        int[] numbers = {9, 1, 2, 3, 4, 5, 6, 7, 8};
        Arrays.sort(numbers);
        int index = Arrays.binarySearch(numbers, 5);
        System.out.println(index);
        Arrays.fill(numbers, 1);
        System.out.println(numbers);
    }
}
