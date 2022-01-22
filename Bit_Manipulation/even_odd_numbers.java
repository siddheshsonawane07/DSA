package Bit_Manipulation;

import java.util.Scanner;

public class even_odd_numbers {
    public static void main(String[] args) {
        /*
        Even numbers always ends with 0 in binary
        Odd numbers always ends with 1 in binary
        If we AND the given binary number with "001" and if the result is zero then it is "even" number, and if the result contains one then it is an odd number
        */
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        if((a&1)==0){
            System.out.println("number is even");
        }
        else{
            System.out.println("number is odd");
        }
    }
}
