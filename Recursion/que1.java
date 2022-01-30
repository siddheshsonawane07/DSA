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

public class que1 {

    static int count (int m, int n) {
        if(m==1 || n==1){
            return 1;
        }
        return count(n-1,m)+count(m,n-1);
    }

    public static void main(String[] args) {
    int ans = count(3,3);
        System.out.println(ans);

    }
}
