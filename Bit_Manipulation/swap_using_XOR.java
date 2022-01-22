package Bit_Manipulation;

import java.util.Scanner;

public class swap_using_XOR {
    public static void main(String[] args) {
        /*
        7^5
        XOR: statement is true if both the inputs are different
        a = 5, b = 7

        a = a ^ b

            101
            111
          _______
            010

        ('a' value is updated, now a = 010)

        b = a ^ b

            010
            111
          _______
            101

        ('b' value is updated, now b = 101)
        Now, 'b' has 'a' value

        a = a ^ b

            010
            101
          _______
            111

        ('a' value is updated, now a = 111)
        Now, 'a' has 'b' value
        Thus, the numbers are swapped

        */

        Scanner in = new Scanner(System.in);

        System.out.println("Enter a");
        int a = in.nextInt();
        System.out.println("Enter b");
        int b = in.nextInt();

        a  = a ^ b;
        b = a ^ b;
        a = b^ a;

        System.out.println("The value of a "+ a);
        System.out.println("The value of b "+ b);
    }
}
