package Recursion;

public class basics {

    static int sum(int n) {

        /*
        3 steps for recursion

        1) find the base case
        2) find the relation between problem and sub problem
        3) generalise the relation

        Find the sum of N natural numbers using recursion
        */

        if (n == 1) {
            return 1;
        }

        return n + sum(n - 1);

    }

    static int power(int a, int n){

        if(n==0){
            return 1;
        }

        return a * power(a,n-1);
    }


    public static void main(String[] args) {

        //function calling itself is called recursion

        int s = sum(5);
        System.out.println(s);
        int p=  power(5,3);
        System.out.println(p);
    }
}