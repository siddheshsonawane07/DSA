package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SpiralMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int r = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];

        for(int i = 0; i < r; i++){
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
                }
        }

        System.out.println("Matrix output in Spiral Representation");

        int row_start = 0;
        int row_end =  r-1;
        int col_start = 0;
        int col_end = c-1;


        while (row_start<=row_end && col_start<=col_end) {
            for (int i = col_start; i <= col_end; i++) {
                System.out.println(matrix[row_start][i]);
            }
            row_start++;

            for (int i = row_start; i <= row_end; i++) {
                System.out.println(matrix[i][col_end]);
            }
            col_end--;
        }
    }
}
