package Basics;


import java.util.Scanner;

public class MethodsFactorialRecursion {
    {
        Scanner in = new Scanner(System.in);

        int number= in.nextInt();
        int fact = factorial(number);
        System.out.println("Factorial of "+number+" is: "+fact);
    }

    static int factorial(int n){
        if (n == 0) {
            return 1;
        }
        else {
            return (n * factorial(n - 1));
        }
    }
}
