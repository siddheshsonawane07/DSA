package Basics;


import java.util.Scanner;

public class MethodsPalindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        palindrome(n);

    }

    static void palindrome(int n) {
       int r,sum = 0,temp;
       temp = n;
       while (n>0){
           r = n % 10;
           sum = (sum*10)+r;
           n = n /10;
       }
        if (temp==sum){
            System.out.println("It is a palindrome");
        }
        else{
            System.out.println("It is not a palindrome");
        }

    }


}
