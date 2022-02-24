package Recursion;
/*
find the number of ways in n*m matrix
n rows and m columns
1 2 3
4 5 6
7 8 9
find the total number of ways from which you can travel from 1 to 9
condition is that we have to go straight and down
*/

public class matrix_path {

    static int count (int r, int c) {
        if(r==1 || c==1){
            return 1;
        }
        return count(r-1,c)+count(r,c-1);
    }

    public static void main(String[] args) {
    int ans = count(3,3);
        System.out.println(ans);

    }
}
