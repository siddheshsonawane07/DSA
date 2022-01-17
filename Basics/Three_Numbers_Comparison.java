package Basics;

import java.util.Scanner;

public class Three_Numbers_Comparison {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // traditional method
//        System.out.println("Enter number 1");
//        int num1 = in.nextInt();
//
//        System.out.println("Enter number 2");
//        int num2 = in.nextInt();
//
//        System.out.println("Enter number 3");
//        int num3 = in.nextInt();
//
//        if (num1 > num2 && num1 > num3) {
//            System.out.println(num1 + " is greatest");
//        }
//        else if (num2 > num1 && num2 > num3) {
//            System.out.println(num2 + " is greatest");
//        }
//        else {
//            System.out.println(num3 + " is greatest");
//        }

        //efficient method

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int max = a;

        if (b > max){
            max = b;
        }

        if (c > max){
            max = c;
        }

        System.out.println(max);
    }

}

