package Basics;

import java.util.Scanner;

public class gcd_lcm {
//GCD (i.e. Greatest Common Divisor) or HCF (i.e. Highest Common Factor) is the largest number that can divide both the given numbers.
    public static int gcd(int a, int b){
        while (a%b!=0){
            int rem = a % b;
            a = b;
            b = rem;
        }
        return b;
    }

    public static int gcd_using_euclidean(int a, int b){
        /*
        GCD of two numbers is the largest number that divides both of them
        Basic Euclidean Algorithm for GCD
        *If we subtract a smaller number from a larger (we reduce a larger number), GCD doesn’t change. So if we keep subtracting repeatedly the larger of two, we end up with GCD.
        *Now instead of subtraction, if we divide the smaller number, the algorithm stops when we find remainder 0.
        */
        if (b == 0)
            return a;

        return gcd_using_euclidean(b, a%b);

        /*
         gcd(10,14)
         gcd(14,10)
         gcd(10,4)
         gcd(4,2)
         gcd(2,0)
        */
    }

    public static int lcm_using_gcd(int a, int b, int gcd){
        int lcm = (a*b)/gcd;
        return lcm;
    }

    public static int lcm(int a, int b){
        int lcm = (a>b) ? a:b;
        while(true){
            if(lcm%a==0 && lcm%b ==0){
                System.out.println();
                break;
            }
            lcm++;
        }
        return lcm;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int gcd = gcd(a,b);
        int lcm = lcm_using_gcd(a,b,gcd);
        int lcm2 = lcm(a,b);
        System.out.println("GCD is "+ gcd);
        System.out.println("LCM is "+ lcm);
        System.out.println("LCM without using GCD is " +lcm2);
        int gcd2 = gcd_using_euclidean(a,b);
        System.out.println("GCD with Euclid's Algorithm "+gcd2);

    }
}
