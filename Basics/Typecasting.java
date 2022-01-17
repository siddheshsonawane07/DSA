package Basics;

import java.util.Scanner;

public class Typecasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //      Manual Typecasting

        //int num = (int)(67.90f);

        //System.out.println(num);

        //      Automatic Typecasting

        //float num1 = input.nextFloat();
        //System.out.println(num1);

        //      automatic type promotion in expressions

//        int a = 257;
//        byte b = (byte)(a); // 257 % 256 = 1
//        System.out.println(b);

//        byte b = 50;
//        b = b * 2;

//        prints the ASCII values of the character. '' are used for characters and "" are used for strings

//        int number = 'A';
//        int number1 = 'a';
//        System.out.println(number);


        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f * b) + (i * c) - (d * s);
        //float + int - double = double
        System.out.println((f * b) + "" + (i * c) + "" +(d * s));
        System.out.println(result);




    }
}
