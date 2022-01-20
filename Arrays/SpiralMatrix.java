package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SpiralMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int r = sc.nextInt();
       int c = sc.nextInt();

       int[][] matrix = new int[r][c];

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                matrix[row][col] = sc.nextInt();
            }
        }

        int rmin = 0;
        int rmax = matrix.length - 1 ;
        int cmin = 0;
        int cmax = matrix[0].length - 1;

        int tne = r * c;
        int count = 0;

        while(count<tne){

            if(count<tne) {
                for (int i = rmin; i <= rmax; i++) {
                    System.out.println(matrix[i][cmin]);
                    count++;
                }
            }
            cmin++;

            if(count<tne) {
                for (int i = cmin; i <= cmax; i++) {
                    System.out.println(matrix[rmax][i]);
                    count++;
                }
            }
            rmax--;

            if(count<tne) {
                for (int i = rmax; i >= rmin; i--) {
                    System.out.println(matrix[i][cmax]);
                    count++;
                }
            }
            cmax--;

            if(count<tne) {
                for (int i = cmax; i >= cmin; i--) {
                    System.out.println(matrix[rmin][i]);
                    count++;
                }
            }
            rmin++;

        }

        for (int [] a : matrix){
            System.out.println(Arrays.toString(a));

        }
    }
}
