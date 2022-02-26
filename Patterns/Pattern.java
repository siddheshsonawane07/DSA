package Patterns;
/*
Steps to solve pattern questions

1) no. of lines = no.of rows = no. of times the outer loop will run
2) identify for every row number, how many columns are there & type of elements in the column
3) what do you need to print

*/
public class Pattern {

    public static void pattern1(int n){

//        *
//        * *
//        * * *
//        * * * *

        for (int row = 1; row <= n; row++) {
            // for every row, run the column
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            //when one complete row is completed, we need to add a new line
            System.out.println();
        }
    }

    public static void pattern2(int n){

//        * * * *
//        * * * *
//        * * * *
//        * * * *

        for (int row = 1; row <= n; row++) {
            // for every row, run the column
            for (int col = 1; col <= n; col++) {
                System.out.print("*");
            }
            //when one complete row is completed, we need to add a new line
            System.out.println();
        }
    }

    public static void pattern3(int n){

//        * * * *
//        * * *
//        * *
//        *

        for (int row = 1; row <= n; row++) {
            // for every row, run the column
            for (int col = 1; col <= (n+1)-row; col++) {
                System.out.print("*");
            }
            //when one complete row is completed, we need to add a new line
            System.out.println();
        }
    }

    public static void pattern4(int n){

//        1
//        1 2
//        1 2 3
//        1 2 3 4

        for (int row = 1; row <= n; row++) {
            // for every row, run the column
            for (int col = 1; col <= row; col++) {
                System.out.print(" "+ col);
            }
            //when one complete row is completed, we need to add a new line
            System.out.println();
        }
    }

    public static void pattern5(int n){

//        1 2 3 4
//        1 2 3
//        1 2
//        1

        for (int row = 1; row <= n; row++) {
            // for every row, run the column
            for (int col = 1; col <= (n+1)-row; col++) {
                System.out.print(" "+ col);
            }
            //when one complete row is completed, we need to add a new line
            System.out.println();
        }
    }

    public static void pattern6(int n){

//        *
//        * *
//        * * *
//        * * * *
//        * * *
//        * *
//        *

        for (int row = 0; row <2*n; row++) {
            int totalCols = row > n ? (2 * n) - row: row;
            for (int col = 0; col < totalCols; col++) {
                System.out.print("* ");
                }
            }
            //when one complete row is completed, we need to add a new line
            System.out.println();
        }



    public static void main(String[] args) {
        pattern6(4);

    }
}
