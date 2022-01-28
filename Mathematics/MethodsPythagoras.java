package Mathematics;

import java.util.Scanner;

public class MethodsPythagoras {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number as the hypotenuse");

        int a =in.nextInt();
        int b =in.nextInt();
        int c =in.nextInt();

        Pythagoras(a,b,c);
    }

     static void Pythagoras(int a, int b, int c) {
        if((a*a) == (b*b) +(c*c)) {
            System.out.println("Pythagoras theorem is applicable");
        }
        else{
            System.out.println("Pythagoras theorem is not applicable");
        }
    }
}
