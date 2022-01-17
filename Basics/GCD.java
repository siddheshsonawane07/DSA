package Basics;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        while(a % b != 0){
            int rem = a % b;
            a = b;
            b = rem;
        }
        int gcd = b;
        System.out.println(gcd);
    }
}
