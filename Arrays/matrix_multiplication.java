package Arrays;

import java.util.Scanner;

public class matrix_multiplication {

    static int[][] matrix(int row, int col) {

        Scanner in = new Scanner(System.in);

        int[][] matrix = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Enter value for " + i + j);
                matrix[i][j] = in.nextInt();
            }
        }

        return matrix;
    }

    static void multiply(int[][] arr1, int[][] arr2, int row1, int row2, int col1, int col2) {

        int[][] result = new int[row1][col2];

        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                result[i][j] = 0;
                for (int k = 0; k < col1; k++) {
                    result[i][j] += arr1[i][k] * arr2[k][j];
                }
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }


    }

    public static void main(String[] args) {

        System.out.println("Program for matrix multiplication");

        Scanner in = new Scanner(System.in);

        System.out.println("Enter row size for matrix 1");
        int row1 = in.nextInt();
        System.out.println("Enter column size for matrix 1");
        int col1 = in.nextInt();

        System.out.println("Enter row size for matrix 2");
        int row2 = in.nextInt();
        System.out.println("Enter column size for matrix 2");
        int col2 = in.nextInt();

        int[][] matrix1 = matrix(row1, col1);

        int[][] matrix2 = matrix(row2, col2);

        multiply(matrix1, matrix2, row1, row2, col1, col2);


    }
}
