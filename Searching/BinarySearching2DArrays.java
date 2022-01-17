package Searching;

import java.util.Arrays;

public class BinarySearching2DArrays {
    public static void main(String[] args) {
        //matrix sorted in row and column wise
        int [][] matrix = {
                {10,20,30,40,50},
                {11,25,35,45,52},
                {28,29,37,49,55},
                {33,34,38,50,57},
                {40,45,48,60,62}
        };
        int target = 37;
        System.out.println(Arrays.toString(search(matrix, target)));
    }

    //for matrix sorted in row and column wise
    static int [] search(int [][] matrix, int target) {
        int row = 0;
        int column = matrix.length - 1;

        while (row < matrix.length && column >= 0) {
            if (matrix[row][column] == target) {
                return new int[]{row, column};
            }
            if (matrix[row][column] < target) {
                row++;
            } else {
                column--;
            }
        }
        return new int[]{-1, -1};
    }
}