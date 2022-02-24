package Bit_Manipulation;

/*find number of bits to change to convert 'A' to 'B'
a=> 1 0 1 1 0
b=> 1 1 0 1 1
for converting "a" to "b" we need to change 3 bits
n & (n-1) till we get "0000"
It changes the least significant bit to "0"

*/

import java.util.Scanner;

public class no_of_bits {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int a = in.nextInt();
    int k = 0;

    while(a != 0){
        a = a & (a-1);
        k++;
    }

        System.out.println("the number of bits in the number is: "+ k);
    }
}
