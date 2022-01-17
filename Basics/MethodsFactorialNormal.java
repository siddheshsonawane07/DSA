package Basics;

import java.util.Scanner;

public class MethodsFactorialNormal {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int number = in.nextInt();
        int fact = 1;

        for(int i=1;i<=number;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of "+number+" is: "+fact);
    }
}
/*
fact = 1 * 1
fact = 1 * 2
fact = 2 * 3
fact = 6 * 4
fact = 24 * 5
fact = 120
*/