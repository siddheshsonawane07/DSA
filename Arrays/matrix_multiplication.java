package Arrays;

import java.util.Scanner;

public class matrix_multiplication {

    static int[][] matrix(int row, int col) {

        Scanner in = new Scanner(System.in);


        int[][] matrix = new int[row][col];


        for (int i = 0; i < row; i++) {

        }

        return matrix;
    }

    static int[][] multiply(int[][] arr1, int[][] arr2) {

        int[][] result = new int[3][3];

        return result;
    }

    public static void main(String[] args) {

        System.out.println("Program for matrix multiplication");

        Scanner in = new Scanner(System.in);

        System.out.println("Enter row size for matrix 1");
        int row1 = in.nextInt();
        System.out.println("Enter column size for matrix 1");
        int col1 = in.nextInt();

        System.out.println("Enter row size for matrix 1");
        int row2 = in.nextInt();
        System.out.println("Enter column size for matrix 1");
        int col2 = in.nextInt();

        int[][] matrix1 = matrix(row1, col1);

        int[][] matrix2 = matrix(row2, col2);

        int[][] result = multiply(matrix1, matrix2);


    }
}
